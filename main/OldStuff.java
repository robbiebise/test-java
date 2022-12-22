package main;
import static java.lang.System.out;


abstract class MyClass{

}

class AbstractLikeClass {

}

public class OldStuff {
   public void oldMethod(){
      out.println("old!");
   }

   private String color = "red";

   private void doSomething(){
   synchronized(color) {  // Noncompliant; lock is actually on object instance "red" referred to by the color variable
      //...
      color = "green"; // other threads now allowed into this block
      // ...
   }
   synchronized(new Object()) { // Noncompliant this is a no-op.
      // ...
   }
   }
}


