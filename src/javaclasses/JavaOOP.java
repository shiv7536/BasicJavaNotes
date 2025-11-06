package javaclasses;

// Main class
public class JavaOOP {

    // Base class (Parent)
    static class Animal {
        String name;

        // Constructor
        Animal(String name) {
            this.name = name;
        }

        // Method (will be overridden)
        void sound() {
            System.out.println("Animals make sounds");
        }

        // Common method
        void eat() {
            System.out.println(name + " is eating...");
        }
    }

    // Derived class (Child) - Inheritance
    static class Dog extends Animal {

        // Constructor calling parent class constructor
        Dog(String name) {
            super(name);
        }

        // Method overriding (Polymorphism)
        @Override
        void sound() {
            System.out.println(name + " says: Woof Woof!");
        }
    }

    // Another derived class
    static class Cat extends Animal {

        Cat(String name) {
            super(name);
        }

        @Override
        void sound() {
            System.out.println(name + " says: Meow Meow!");
        }
    }

    // Encapsulation Example (data hiding)
    static class Person {
        private String name;  // private variable
        private int age;

        // Setter method
        public void setData(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter method
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    // Abstraction using abstract class
    static abstract class Shape {
        abstract void draw();  // abstract method (no body)
    }

    static class Circle extends Shape {
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Main Method
    public static void main(String[] args) {

        // 1️⃣ Object creation and Inheritance
        Dog dog = new Dog("Buddy");
        dog.sound();  // Polymorphism (method overriding)
        dog.eat();

        Cat cat = new Cat("Kitty");
        cat.sound();
        cat.eat();

        // 2️⃣ Encapsulation example
        Person p1 = new Person();
        p1.setData("Shiv", 25);
        p1.display();

        // 3️⃣ Abstraction example
        Shape shape = new Circle();
        shape.draw();
    }
}



/**
Java - What is OOP?
OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:

OOP is faster and easier to execute
OOP provides a clear structure for the programs
OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
OOP makes it possible to create full reusable applications with less code and shorter development time
Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.




**/
