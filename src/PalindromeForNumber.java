import java.util.Scanner;

public class PalindromeForNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		int reversedNum = 0, remainder;
		int originalNum = number;
		while (number != 0) {
			remainder = number % 10;
			reversedNum = reversedNum * 10 + remainder;
			number /= 10;
		}
		if (originalNum == reversedNum) {
			System.out.println("\n" + originalNum + " is Palindrome.");
		} else {
			System.out.println("\n" + originalNum + " is not Palindrome.");
		}
	}

}