package javamethods;

public class ReturnValues {
	 // Method that doubles the number
	  static int doubleGame(int x) {
	    return x * 2;
	  }

	  public static void main(String[] args) {
	    for (int i = 1; i <= 5; i++) {
	      System.out.println("Double of " + i + " is " + doubleGame(i));
	    }
	  }

}


//Return Values
//In the previous page, we used the void keyword in all examples (like static void myMethod(int x)), which indicates that the method should not return a value.
//If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method: