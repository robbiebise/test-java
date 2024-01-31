package main;
import static java.lang.System.out;

public class Main {

   public static void main(String[] arguments) throws Exception{
      out.println("HELLO");
      String a = null;
      a = "asdf";
      if (a != null) {out.println(a);}
      //TODO: something elsee

      OldStuff oldStuff = new OldStuff();
      oldStuff.oldMethod();
   }

   public static void newMethod(String a) {
      out.println("new method");
      // throw exception if a is null
      if (a == null) {
         throw new Exception("a is null");
      }

   }
}