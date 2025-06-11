import java.util.Scanner;

public class LCMOfTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number  : ");
		int number1 = input.nextInt();
		System.out.print("Enter Second Number : ");
		int number2 = input.nextInt();
		int gcd = 1;
		for (int i = 1; i <= number1 && i <= number2; ++i) {
			if (number1 % i == 0 && number2 % i == 0)
				gcd = i;
		}
		int lcm = (number1 * number2) / gcd;
		System.out.println("\nLCM of " + number1 + " and " + number2 + " is = " + lcm);
	}
}