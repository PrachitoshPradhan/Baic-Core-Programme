package com.day5JavaCore;
import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {

		System.out.println("Welcome to the Quotient and Remainder programme.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend, D = ");
		int D = sc.nextInt();
		System.out.println("Enter the Divisor, d = ");
		int d = sc.nextInt();
		System.out.println("Dividend, D is "+D);
		System.out.println("Divisor, d is "+d);

		System.out.println("Quotient, Q is "+(D/d));
		System.out.println("Reminder, R is "+(D%d));
		sc.close();
	}

}
