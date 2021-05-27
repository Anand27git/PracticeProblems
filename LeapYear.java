import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// declaring variable
		int year;
		// Taking input from user and assigning value to variable
		System.out.println("Enter the Year");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		// checking condition with if year is leap year or not
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is not Leap Year");
		}
	}

}
