package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

public class Exercise10 {

	/** (Science: calculating energy)
	 * 
	 * Calculates the energy needed to heat water
	 * from an initial temperature to a final temperature
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("Enter the amount of water in kilograms: ");
		double amountOfWater = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemp = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		
		// Calculate the energy
		double energy = amountOfWater * (finalTemp - initialTemp) * 4184;
		
		// Display the result to the user
		System.out.println("The energy needed is " + energy);

		input.close();
	}

}
