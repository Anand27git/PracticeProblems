import java.util.Scanner;

public class AlphabetVowel {

	public static void main(String[] args) {
		// Declaring  Variable 
		String temp;
		System.out.println("Enter The Alphabet to check Vowel or Consonant");
		Scanner sc = new Scanner(System.in);
		// Assigning value to variable
		temp = sc.next();
		// Checking with if else condition weather the Alphabet is vowel or Consonant
		if ((temp.equals("a") || temp.equals("e") || temp.equals("i") || temp.equals("o") || temp.equals("u"))) {
			System.out.println("The ALphabet is Vowel");
		} else {
			System.out.println("The Alphabet is Consonant");
		}
	}
}
