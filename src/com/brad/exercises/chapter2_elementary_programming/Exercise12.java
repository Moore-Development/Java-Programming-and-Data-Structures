package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

/**
 * Physics: finding runway length
 * 
 * Computes the minimum runway length needed for
 * an airplane to takeoff
 * 
 * @author Brad Moore
 *
 */

public class Exercise12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter take-off speed
		System.out.print("Enter the take-off speed: ");
		double speed = input.nextDouble();
		
		// Prompt the user to enter the airplane's acceleration
		System.out.print("Enter the acceleration: ");
		double acceleration = input.nextDouble();
		
		// Calculate the length of the runway needed
		double runwayLength = (Math.pow(speed, 2) / (2 * acceleration));
		
		// Display the result
		System.out.println("The minimum runway length for this airplane is " 
				+ (int)(runwayLength * 1000) / 1000.00);

		input.close();
	}

}
