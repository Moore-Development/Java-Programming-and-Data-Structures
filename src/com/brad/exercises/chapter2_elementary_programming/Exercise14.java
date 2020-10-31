package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

/**
 * (Health application: computing BMI)
 * 
 * Calculates body mass index
 * 
 * @author Brad Moore
 *
 */

public class Exercise14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		
		// Prompt user for height in inches
		System.out.print("Enter height in inches: ");
		double heightInInches = input.nextDouble();
		
		// Convert weight to kilograms
		double weightInKilograms = weightInPounds * 0.45359237;
		
		// Convert height to meters
		double heightInMeters = heightInInches * 0.0254;
		
		// Compute BMI
		double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));
		
		// Display result
		System.out.println("BMI is " + (int)(bmi * 10000) / 10000.00);

		input.close();
	}

}
