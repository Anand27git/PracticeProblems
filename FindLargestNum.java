import java.util.Scanner;

public class FindLargestNum {
	public static void main(String[] args) {
		// Declaring variables
		int x, y, z;
		System.out.println("Enter Three Numbers :");
		Scanner sc = new Scanner(System.in);
		// Assigning Values to Variables
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		// Checking the Largest Number Out of Three using if else if Condition
		if (x >= y && x >= z) {
			System.out.println("The Largest Number is" + x);
		} else if (y >= x && y >= z) {
			System.out.println("The largest Number is" + y);
		} else {
			System.out.println("The largest Number is" + z);

		}
	}

}
