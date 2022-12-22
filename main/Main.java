package main;
import static java.lang.System.out;

public class Main {

   public static void main(String[] arguments) {
      out.println("HELLO");
      String a = null;
      a = "asdf";
      if (a != null) {out.println(a);}
      //TODO: something elsee

      OldStuff oldStuff = new OldStuff();
      oldStuff.oldMethod();

   }
}

