import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		int temp = number;
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("\nThe Number Of Digits In " + temp + " Is : " + count);
	}
}