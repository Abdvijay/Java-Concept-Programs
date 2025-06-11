import java.util.Scanner;

public class CheckAlphabetOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Character :  ");
		char c = input.next().charAt(0);
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println("The Character " + c + " is an Alphabet.");
		else
			System.out.println("The Character " + c + " is not an Alphabet.");
	}
}