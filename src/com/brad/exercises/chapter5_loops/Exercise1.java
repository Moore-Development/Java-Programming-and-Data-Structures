package com.brad.exercises.chapter5_loops;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int numberOfPositive = 0;
		int numberOfNegative = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		while(input.hasNext()) {
			
			int number = input.nextInt();
			total += number;
			
			if(number == 0) {
				break;
			}
			else if(number > 0) {
				numberOfPositive++;
			}
			else if(number < 0) {
				numberOfNegative++;
			}
			else {
				System.out.println("Invalid input. Laters.");
				System.exit(1);
			}
		}
		
		double average = total / (numberOfPositive + numberOfNegative);
		
		System.out.println("The number of positives is " + numberOfPositive);
		System.out.println("The number of negatives is " + numberOfNegative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);

		input.close();
	}

}
