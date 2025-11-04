package conditions;

public class ElseIfStatement {
		public static void main(String[] args) {
	
	
	int marks = 75;
	if (marks >= 90) {
	    System.out.println("Grade A");
	} else if (marks >= 75) {
	    System.out.println("Grade B");
	} else if (marks >= 50) {
	    System.out.println("Grade C");
	} else {
	    System.out.println("Fail");
	}
	
	
	int time = 22;
	if (time < 10) {
	  System.out.println("Good morning.");
	} else if (time < 18) {
	  System.out.println("Good day.");
	} else {
	  System.out.println("Good evening.");
	}
}
}






/**
else if Statement – Short Notes:

Definition:
The else if statement is used to check multiple conditions one after another.
When the first if condition is false, the program checks the next else if condition, and so on.

Syntax:
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else {
    // code if all conditions are false
}
Example:
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}

**/