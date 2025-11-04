package conditions;

public class IfStatements {
	public static void main(String[] args) {
		
	
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}
		
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}

	}
	}




/**
Java Conditions and If Statements
Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped. Every if statement needs a condition that results in true or false.

Most often, conditions are created using comparison operators, like the ones below:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to: a == b
Not equal to: a != b


ava has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

The if Statement
Syntax
if (condition) {
  // block of code to be executed if the condition is true
}

**/