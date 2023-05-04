package main;
import static java.lang.System.out;

public class Main {

   public static void main(String[] arguments) {
      out.println("HELLO");
      String a = null;
      a = "asdf";
      if (a != null) {out.println(a);}
      //TODO: something elsee
      //TODO: another task
      for (;true;) { 
         out.println("bad"); 
         OldStuff oldStuff = new OldStuff();
         oldStuff.oldMethod();
      }

      for (;true;) { 
         out.println("bad"); 
         OldStuff oldStuff = new OldStuff();
         oldStuff.oldMethod();
      }
   }

   void removeFrom(List<String> list) {
      // expected: iterate over all the elements of the list
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i).isEmpty()) {
          // actual: remaining elements are shifted, so the one immediately following will be skipped
          list.remove(i); // Noncompliant
        }
      }
    }
}

