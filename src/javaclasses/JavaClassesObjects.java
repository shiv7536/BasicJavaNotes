package javaclasses;

public class JavaClassesObjects {
    int x = 5; // instance variable

    public static void main(String[] args) {
        // create an object of JavaClassesObjects
        JavaClassesObjects myObj = new JavaClassesObjects();
        System.out.println(myObj.x); // access instance variable using object
    }
}



/**
Java Classes/Objects
Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. 
The car has attributes, such as weight and color, and methods, such as drive and brake.
A Class is like an object constructor, or a "blueprint" for creating objects.

Create a Class
To create a class, use the keyword class.

In this example, we create a class named "Main" with a variable x:

Main.java
public class Main {
  int x = 5;
}
Remember from the Java Syntax chapter that a class should always start with an uppercase first letter, and that the name of the java file should match the class name.

Create an Object
In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

ExampleGet your own Java Server
Create an object called "myObj" and print the value of x:

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}

**/