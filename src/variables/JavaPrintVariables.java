package variables;

public class JavaPrintVariables {
		public static void main(String[] args) {

	
	String firstName = "shiv ";
	String lastName = "sharma";
	String fullName = firstName + lastName;
	System.out.println(fullName);
}
}


//Notes:

/**
The println() method is often used to display variables.

To combine both text and a variable, use the + character:

Mixing Text and Numbers
int x = 5;
int y = 6;

System.out.println("The sum is " + x + y);   // Prints: The sum is 56
System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

Explanation:

In the first line, Java combines "The sum is " with x, creating the string "The sum is 5". Then y is added to that string, so it becomes "The sum is 56".

In the second line, the parentheses make sure x + y is calculated first (resulting in 11), so the output is "The sum is 11".


**/