import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("\nFactorial of " + number + " is " + factorial);
	}
}