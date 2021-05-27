import java.util.Scanner;

public class QuficientReminder {

	public static void main(String[] args) {
		// Declaring The variables dividend divisor
		int dividend;
		int divisor;
		// Taking input from User and Assigning Values to the Variables
		System.out.println("Enter The two Number");
		Scanner sc = new Scanner(System.in);
		dividend = sc.nextInt();
		divisor = sc.nextInt();
		// Writing the Expression to get the quotient and Remainder
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient is: " + quotient);
		System.out.println("remainder is: " + remainder);
	}

}
