import java.util.Scanner;

public class FibanocciSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fibanocci Upto 1st : ");
		int count = input.nextInt();
		int n1 = 0, n2 = 1, n3;
		System.out.print("\n" + n1 + " " + n2);
		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}