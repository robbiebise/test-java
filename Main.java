import static java.lang.System.out;

public class Main
{
   public static void main(String[] arguments)
   {
      out.println("HELLO");
      String a = null;
      try {
         a = "asdf";
         if (a != null) {out.println(a);}
      }
      catch (Exception e){
         throw e;
      }
      //TODO: somethingg

   }
}