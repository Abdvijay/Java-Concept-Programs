import java.io.*;
import java.util.Scanner;

public class FindLeapYear {
	public static void isLeapYear(int year) {
		// By Default False
		boolean is_leap_year = false;
		// A leap year (except a century year) can be identified if it is exactly
		// divisible by 4.
		if (year % 4 == 0) {
			is_leap_year = true;
			// A century year should be divisible by 4 and 100 both.
			if (year % 100 == 0) {
				if (year % 400 == 0)
					is_leap_year = true;
				else
					is_leap_year = false;
			}
		} else
			is_leap_year = false;
		// Check the boolean condition and display whether it is leap or not
		if (is_leap_year)
			System.out.println("The Year " + year + " is Leap-year");
		else
			System.out.println("The Year " + year + " is Non Leap-year");
	}

	public static void main(String[] args) {
		// Getting input from keyboard
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Year : ");
		int year = input.nextInt();
		// Call the method, for identify the given year is leap or not
		isLeapYear(year);
	}
}