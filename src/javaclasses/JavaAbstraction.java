package javaclasses;

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

// Main class (entry point)
public class JavaAbstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();    // Call abstract method implementation
        myPig.sleep();          // Call regular method
    }
}





/**
Abstract Classes and Methods
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

Animal myObj = new Animal(); // will generate an error



**/
