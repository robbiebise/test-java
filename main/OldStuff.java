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