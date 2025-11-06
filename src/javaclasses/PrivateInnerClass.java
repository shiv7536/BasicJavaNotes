package javaclasses;

public class PrivateInnerClass {
    int x = 10;

    // Private inner class
    private class InnerClass {
        int y = 5;
    }

    // Method inside outer class to access private inner class
    void displaySum() {
        InnerClass myInner = new InnerClass(); // can access private inner class here
        System.out.println("Sum: " + (x + myInner.y));
    }

    public static void main(String[] args) {
        PrivateInnerClass myOuter = new PrivateInnerClass();
        myOuter.displaySum();
    }
}
