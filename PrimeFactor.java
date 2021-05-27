import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// declaration of variable
		int n;
		System.out.println("enter The No");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		primeFactors(n);
	}

	// A function to print all prime factors
	// of a given number n
	public static void primeFactors(int n) {
		// prints the no that divides by 2
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.println(i + "");
				n /= i;

			}
		}
		if (n > 2)
			System.out.print(n);
	}
}
