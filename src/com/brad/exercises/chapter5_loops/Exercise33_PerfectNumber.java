package com.brad.exercises.chapter5_loops;

import java.util.ArrayList;

public class Exercise33_PerfectNumber {

	public static void main(String[] args) {

		ArrayList<Integer> perfectNumbers = new ArrayList<Integer>();

		for(int i = 1; i < 10000; i++) {
			
			int sumOfDivisors = 0;
			ArrayList<Integer> divisors = new ArrayList<Integer>();
			
			for(int j = 1; j < i; j++) {
				
				if(i % j == 0) {
					divisors.add(j);
					//System.out.println(i + " is divisible by " + j);
				}
				
			}
				
			for(int divisor: divisors) {
				sumOfDivisors += divisor;
				//System.out.println("Sum of divisors for " + i + " is " + sumOfDivisors);
			}
			
			if(sumOfDivisors == i) {
				
				perfectNumbers.add(i);
				
				System.out.print(i + " = " + divisors.get(0));
				divisors.remove(0);
				
				for(int divisor: divisors) {
					
					System.out.print(" + " + divisor);
				}
				
				System.out.println();
			}
		}
		
		System.out.print("The Perfect Numbers that are less than 10,000 are "
				+ perfectNumbers.get(0));
		perfectNumbers.remove(0);
		
		for(int number: perfectNumbers) {
			
			System.out.print(", " + number);
		}
	}

}
