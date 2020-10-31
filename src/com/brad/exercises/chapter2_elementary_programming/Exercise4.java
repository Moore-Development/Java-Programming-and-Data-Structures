package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// Converts pounds into kilograms
		
		Scanner input = new Scanner(System.in);
		double weightInPounds = 0.0;
		boolean continueInput = true;
		
		// Prompt the user to enter a number in pounds
		do {
			try {
				System.out.print("Enter your weight in pounds: ");
				weightInPounds = input.nextDouble();
				continueInput = false;
			}
			
			catch(Exception ex) {
				System.out.println("The following exception has occurred: " + ex);
				input.nextLine();
			}
		}
		while (continueInput == true);
		
		// Convert the number to kilograms
		double weightInKilograms = weightInPounds * 0.454;
		
		// Display the result
		System.out.println("Your weight in kilograms is " + weightInKilograms);
		
		input.close();
	}

}