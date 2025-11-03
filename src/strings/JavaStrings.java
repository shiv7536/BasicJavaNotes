package strings;

public class JavaStrings {
	
	public static void main(String[] args) {
//		String greeting = "Hello";
//		System.out.println(greeting);
		
		
//		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println("The length of the txt string is: " + txt.length());
		
		
		
//		String txt = "Hello World";
//		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
//		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		
//		String txt = "Please locate where 'locate' occurs!";
//		System.out.println(txt.indexOf("locate")); // Outputs 7
		
		
//		String txt = "Hello";
//		System.out.println(txt.charAt(0));  // H
//		System.out.println(txt.charAt(4));  // o
		
//		String txt1 = "Hello";
//		String txt2 = "Hello";
//
//		String txt3 = "Greetings";
//		String txt4 = "Great things";
//
//		System.out.println(txt1.equals(txt2));  // true
//		System.out.println(txt3.equals(txt4));  // false
		
		
		String txt = "   Hello World   ";
		System.out.println("Before: [" + txt + "]");
		System.out.println("After:  [" + txt.trim() + "]");
		
		


	  }
	
}



//Java Strings
//In Java, strings are objects that represent a sequence of characters. The String class is used to create and manipulate strings. 
//Strings in Java are immutable, meaning that once a string is created, it cannot be changed. Any operation that seems to modify a string actually creates a new string.


//String Length
//You can find the length of a string using the length() method.
//Example:
//String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//System.out.println("The length of the txt string is: " + txt.length());

//More String Methods
//For example:

//The toUpperCase() method converts a string to upper case letters.
//The toLowerCase() method converts a string to lower case letters.

//String txt = "Hello World";
//System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
//System.out.println(txt.toLowerCase());   // Outputs "hello world"


//Finding a Character in a String
//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
//Example:
//String txt = "Please locate where 'locate' occurs!";
//System.out.println(txt.indexOf("locate")); // Outputs 7


/**
You can use the charAt() method to access a character at a specific position in a string:
String txt = "Hello";
System.out.println(txt.charAt(0));  // H
System.out.println(txt.charAt(4));  // o


Comparing Strings
To compare two strings, you can use the equals() method:

Example
String txt1 = "Hello";
String txt2 = "Hello";

String txt3 = "Greetings";
String txt4 = "Great things";

System.out.println(txt1.equals(txt2));  // true
System.out.println(txt3.equals(txt4));  // false


Removing Whitespace
The trim() method removes whitespace from the beginning and the end of a string:

Example
String txt = "   Hello World   ";
System.out.println("Before: [" + txt + "]");
System.out.println("After:  [" + txt.trim() + "]");



**/