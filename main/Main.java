package main;
import static java.lang.System.out;

public class Main {

   public static void main(String[] arguments) throws Exception{
      out.println("HELLO");
      String a = null;
      a = "asdf";
      if (a != null) {out.println(a);}
      if (a != null) {out.println(a);}
      if (a != null) {out.println(a);}
      if (a != null) {out.println(a);}
      if (a != null) {out.println(a);}
      if (a != null) {out.println(a);}
      //TODO: something elsee
      String password = "hello";
      out.println(password);
      OldStuff oldStuff = new OldStuff();
      oldStuff.oldMethod();
      String password_2 = "hello";
      out.println(password_2);
   }
   int myPow(int num, int exponent) {
      num = num * myPow(num, exponent - 1); // Noncompliant
      return num;  // this is never reached
   }

   public static void newMethod(String a) {
      out.println("new method");
      // throw exception if a is null
      if (a == null) {
         throw new Exception("a is null");
      }

   }
}