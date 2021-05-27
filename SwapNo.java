
public class SwapNo {

	public static void main(String[] args) {
		// swapping two no using third variable

		int a = 20;
		int b = 50;
		int temp;
		System.out.println("before swap" + a + "" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swap" + a + "" + b);
		
		// swapping two numbers without using 3rd variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping without using Temp variable:" + a + " " + b);
	}

}
