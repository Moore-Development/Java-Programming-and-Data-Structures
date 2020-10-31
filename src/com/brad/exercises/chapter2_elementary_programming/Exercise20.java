package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		double interest = balance * (interestRate/1200);
		
		System.out.println("The interest is " 
				+ Math.round(interest * 100000) / 100000.00);

		input.close();
	}

}
