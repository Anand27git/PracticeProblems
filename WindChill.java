import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// declaring the variable temp and velocity
		double temp, vel;
		System.out.println("enter the value of tempreture and velocity");
		Scanner sc = new Scanner(System.in);
		//assigning the value to the variable
		temp = sc.nextDouble();
		vel = sc.nextDouble();
       // checking the condition of the temp using math.pow 
		double windChillTemp = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(vel, 0.16);
		System.out.println("windChillTemp=" + windChillTemp);
	}

}
