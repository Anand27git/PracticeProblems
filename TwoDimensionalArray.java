import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// declaring an Array
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int m = 0; m < 3; m++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("Enter Elements again and again \n");
				// assigning value to store in an Array 
				arr[m][n] = sc.nextInt();
				System.out.println();
			}
		}
		System.out.println("Printing Elements...");
		for (int m = 0; m < 3; m++) {
			System.out.println();
			for (int n = 0; n < 3; n++) {
				// printing the values in m rows and n columns
				System.out.print(arr[m][n] + "\t");
			}
		}
	}
}