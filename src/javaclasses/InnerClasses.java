package javaclasses;

// Outer class
public class InnerClasses {
    int x = 10;

    // Inner class
    class InnerClass {
        int y = 5;
    }

    // Main method inside same file
    public static void main(String[] args) {
        // Create object of outer class
        InnerClasses myOuter = new InnerClasses();
        // Create object of inner class using outer class
        InnerClasses.InnerClass myInner = myOuter.new InnerClass();

        // Access both variables
        System.out.println(myInner.y + myOuter.x); // Output: 15
    }
}



/**
Java Inner Classes
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, 
which makes your code more readable and maintainable.






**/
