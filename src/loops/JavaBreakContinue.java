package loops;

public class JavaBreakContinue {
		public static void main(String[] args) {
		// Break example
		for (int i = 0; i < 6; i++) {
			if (i == 4) {
				break;
			}
			System.out.println("Break Example: " + i);
		}

		// Continue example
		for (int i = 0; i < 6; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println("Continue Example: " + i);
		}

		// Combining Break and Continue
		for (int i = 0; i < 6; i++) {
			if (i == 2) {
				continue;
			}
			if (i == 4) {
				break;
			}
			System.out.println("Combined Break and Continue: " + i);
		}

		// Break in While Loop
		int i = 0;
		while (i < 10) {
			System.out.println("While Loop Break Example: " + i);
			i++;
			if (i == 4) {
				break;
			}
		}
	}
	
	

}



/**
Break
You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.
The break statement can also be used to jump out of a loop.

Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

Combining Break and Continue
You can also combine break and continue.
for (int i = 0; i < 6; i++) {
  if (i == 2) {
    continue;
  }
  if (i == 4) {
    break;
  }
  System.out.println(i);
 
 
}

Break and Continue in While Loop
int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}





**/
