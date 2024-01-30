package main;
import static java.lang.System.out;
import java.io.File;



// @Deprecated
public class OldStuff {
   public void oldMethod(){
      out.println("old!");
      out.println("old!");
      // TODO: something
      // TODO: something
   }
    import java.security.Key;
    import java.security.KeyPair;
    import java.security.KeyPairGenerator;
    import java.security.NoSuchAlgorithmException;
    import java.security.PrivateKey;
    import java.security.PublicKey;
    import javax.crypto.Cipher;

    public class AsymmetricEncryptionUtils {

        private static final String RSA = "RSA";

        public static KeyPair generateRSAKeyPair() throws NoSuchAlgorithmException {
            KeyPairGenerator generator = KeyPairGenerator.getInstance(RSA);
            generator.initialize(2048);
            return generator.generateKeyPair();
        }

        public static byte[] encrypt(String plainText, Key publicKey) throws Exception {
            Cipher cipher = Cipher.getInstance(RSA);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            return cipher.doFinal(plainText.getBytes());
        }

        public static String decrypt(byte[] cipherText, Key privateKey) throws Exception {
            Cipher cipher = Cipher.getInstance(RSA);
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            return new String(cipher.doFinal(cipherText));
        }
    }
}



@Controller
public class ExampleController
{
    static private String targetDirectory = "/path/to/target/directory/";

    @GetMapping(value = "/exists")
    public void delete(@RequestParam("filename") String filename) throws IOException {

        File file = new File(targetDirectory + filename);
        if (!file.exists()) { // Noncompliant
            throw new IOException("File does not exists in the target directory");
        }
    }
}