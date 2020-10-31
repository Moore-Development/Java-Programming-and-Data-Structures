package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// Sum the digits in an integer
		
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		int number = 0;
		int result = 0;
		
		// Read an integer between 0 and 1000
		do {
			System.out.print("Enter an Integer between 0 and 1000: ");
				number = input.nextInt();
				if (number > 0 && number <= 1000) {
					continueInput = false;
				}
				else {
					System.out.println("Invalid input");
				}
				input.nextLine();
		}
		
		while (continueInput);
		
		input.close();
		
		// Add all the digits in the integer
		int firstDigit = number % 10;
		number = number / 10;
		int secondDigit = number % 10;
		number = number / 10;
		int thirdDigit = number;
		result = firstDigit + secondDigit + thirdDigit;
		
		// Display the results
		System.out.println("The sum of the digits is " + result);
		
	}

}
