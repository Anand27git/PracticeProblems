import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// Declaring Variable
		int num;
		System.out.println("enter the Number");
		Scanner sc = new Scanner(System.in);
		// Assigning Value to Variable
		num = sc.nextInt();
		// Checking with if condition weather the number is even or odd
		if (num % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}

}
