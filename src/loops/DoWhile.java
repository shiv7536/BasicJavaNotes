package loops;

public class DoWhile {
		public static void main(String[] args) {
	
	int i = 1;
	do {
	    System.out.println(i);
	    i++;
	} while (i <= 5);


}
}// This code demonstrates a do-while loop that prints numbers from 1 to 5.
// The loop will execute the block of code at least once before checking the condition.
// Output:
// 1
// 2
// 3
// 4
// 5



/**
The Do/While Loop

The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true.
Then it will repeat the loop as long as the condition is true.

SyntaxGet your own Java Server
do {
  // code block to be executed
}
while (condition);


Do/While Example
The example below uses a do/while loop.
The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:

Condition is False from the Start
In the while loop chapter, we saw that if the condition is false at the beginning, the loop never runs at all.
The do/while loop is different: it will always run the code block at least once, even if the condition is false from the start.
In the example below, the variable i starts at 10, so i < 5 is false immediately. Still, the loop runs once before checking the condition:




 
 **/
