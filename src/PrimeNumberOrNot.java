import java.util.Scanner;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number = input.nextInt();
		boolean flag = false;
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("\n" + "Your Number " + number + " Is Prime Number");
		}else {
			System.out.println("\n" + "Your Number " + number + " Is Not A Prime Number");
		}
	}
}