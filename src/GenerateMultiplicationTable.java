import java.util.Scanner;

public class GenerateMultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		System.out.println("\n\n");
		for (int i = 1; i <= 16; i++) {
			System.out.println(i + " * " + number + " = " + number * i);
		}
	}
}