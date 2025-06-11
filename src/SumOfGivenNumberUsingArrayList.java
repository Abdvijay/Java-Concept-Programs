import java.util.ArrayList;
import java.util.Scanner;

public class SumOfGivenNumberUsingArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		System.out.print("Enter the No of List : ");
		int n = sc.nextInt();
		System.out.println("Enter the List Items ");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			sum = sum + list.get(i);
		}
		System.out.println("Sum = " + sum);
	}
}