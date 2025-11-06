package javaclasses;

// Parent class
class SuperKeyword {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class
class Dog extends SuperKeyword {
    public void animalSound() {
        super.animalSound(); // Call parent class method
        System.out.println("The dog says: bow wow");
    }
}

// Main class (entry point)
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}
