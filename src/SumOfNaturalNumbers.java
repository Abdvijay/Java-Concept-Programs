import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("\nThe Sum Of 1st " + number + " is : " + sum);
	}
}