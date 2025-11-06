package javaclasses;

public class ThisKeyword {
	int x;  // Class variable x

	  // Constructor with one parameter x
	  public ThisKeyword(int x) {
	    this.x = x; // refers to the class variable x
	  }

	  public static void main(String[] args) {
	    // Create an object of Main and pass the value 5 to the constructor
		  ThisKeyword myObj = new ThisKeyword(5);
	    System.out.println("Value of x = " + myObj.x);
	  }

}


//Calling a Constructor from Another Constructor


/**
You can also use this() to call another constructor in the same class.
This is useful when you want to provide default values or reuse initialization code instead of repeating it.

Example
public class Main {
  int modelYear;
  String modelName;

  // Constructor with one parameter
  public Main(String modelName) {
    // Call the two-parameter constructor to reuse code and set a default year    
    this(2020, modelName);
  }

  // Constructor with two parameters
  public Main(int modelYear, String modelName) {
    // Use 'this' to assign values to the class variables
    this.modelYear = modelYear;
    this.modelName = modelName;
  }

  // Method to print car information
  public void printInfo() {
    System.out.println(modelYear + " " + modelName);
  }

  public static void main(String[] args) {
    // Create a car with only model name (uses default year)
    Main car1 = new Main("Corvette");

    // Create a car with both model year and name
    Main car2 = new Main(1969, "Mustang");

    car1.printInfo();
    car2.printInfo();
  }
}

When to use this?
When a constructor or method has a parameter with the same name as a class variable, use this to update the class variable correctly.
To call another constructor in the same class and reuse code.
**/
