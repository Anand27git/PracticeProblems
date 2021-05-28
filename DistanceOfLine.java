import java.util.Scanner;

public class DistanceOfLine {

	public static void main(String[] args) {
		// declaring the variables x and y
		int x, y;
		System.out.println("enter the values of x,y");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		// equation to get the distance
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("distance from (" + x + "," + y + ") to (0,0)= " + distance);
	}

}
