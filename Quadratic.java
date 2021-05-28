import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		//declaring the variable a , b ,c && root 1 root2
		double a, b, c;
		double root1, root2;
		System.out.println("Enter the Values of a,b and C");
		Scanner qd = new Scanner(System.in);
		a = qd.nextDouble();
		b = qd.nextDouble();
		c = qd.nextDouble();
        
		double determinant = b * b - 4 * a * c;
		if (determinant > 0.0) {
			//checking with the equation 
			root1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
			root2 = (-b + Math.sqrt(determinant)) / (2.0 * a);
			// printing the root values
			System.out.format("root1 =%2.f and root2 = %.2f", root1, root2);
		} else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %2f;", root1);
		} else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi \n", real, imaginary);
			System.out.format("root2 = %.2f-%.2fi", real, imaginary);
		}
	}
}
