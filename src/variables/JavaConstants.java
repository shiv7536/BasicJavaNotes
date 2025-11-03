package variables;

public class JavaConstants {
		public static void main(String[] args) {
			
			final int MINUTES_PER_HOUR = 60;
			final int BIRTHYEAR = 1980;
			
			System.out.println("Minutes per hour: " + MINUTES_PER_HOUR);
			
			System.out.println("Birth year: " + BIRTHYEAR);
	}

}


// Output:
//Minutes per hour: 60
//Birth year: 1980


/**
Java Constants (final)

Constants (final keyword)

When you do not want a variable's value to change, use the final keyword.

A variable declared with final becomes a constant, which means unchangeable and read-only:

When to Use final?
You should declare variables as final when their values should never change. For example, the number of minutes in an hour, or your birth year:

Example
final int MINUTES_PER_HOUR = 60;
final int BIRTHYEAR = 1980;

Note: By convention, final variables in Java are usually written in upper case (e.g. BIRTHYEAR). It is not required, but useful for code readability and common for many programmers.



*/