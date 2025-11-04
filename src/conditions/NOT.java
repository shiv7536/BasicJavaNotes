package conditions;

public class NOT {
		public static void main(String[] args) {
			int a = 200;
			int b = 33;

			if (!(a > b)) {
			  System.out.println("The condition is false");
			} else {
			  System.out.println("The condition is true");
			}
			
			//real life example
			boolean isLoggedIn = true;
			boolean isAdmin = false;
			int securityLevel = 3; // 1 = highest

			if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
			  System.out.println("Access granted");
			} else {
			  System.out.println("Access denied");
			}

		}

}
