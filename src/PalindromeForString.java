import java.util.Scanner;

public class PalindromeForString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your String : ");
		String str = input.nextLine(), reverseStr = "";
		int strLength = str.length();
		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println("\n" + str + " is a Palindrome String.");
		} else {
			System.out.println("\n" + str + " is not a Palindrome String.");
		}
	}
}