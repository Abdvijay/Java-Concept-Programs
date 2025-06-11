import java.util.Scanner;

public class CheckPositiveNegative {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		if (number < 0) {
			System.out.println("The Number " + number + " Is Negative");
		} else if (number > 0) {
			System.out.println("The Number " + number + " Is Positive");
		} else {
			System.out.println("The Number is " + number);
		}
	}
}