import java.util.Scanner;

public class PowerofNumber {
	public static void main(String args[])
	{
		int Num,pow,res=1;
		System.out.println("Enter the two Number");
		Scanner sc = new Scanner(System.in);
		Num=sc.nextInt();
		pow=sc.nextInt();
		
		
	for (int i=1 ; i<=pow; i++)
	{
		res=res*Num;
	}
	System.out.println("Result of "+Num+" power "+pow+" is "+res);
	}
}
