import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Base        : ");
		int base = input.nextInt();
		System.out.print("Enter Your Exponential : ");
		int exp = input.nextInt();
		int exponent = exp;
		long result = 1;
		while (exp != 0) {
			result = result * base;
			exp--;
		}
		System.out.println("\nBase : " + base + " ,Exponent : " + exponent + " ,Result : " + result);
	}
}