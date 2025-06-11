import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		int temp = number;
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}
		System.out.println("\nThe Number " + temp + " Reversed Is : " + reversed);
	}
}