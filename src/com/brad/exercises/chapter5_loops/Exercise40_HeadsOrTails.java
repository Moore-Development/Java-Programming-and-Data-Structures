package com.brad.exercises.chapter5_loops;

import java.util.Random;

public class Exercise40_HeadsOrTails {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int sumOfHeads = 0;
		int sumOfTails = 0;
		
		System.out.println("Flipping coin 1,000,000 times...");
		
		for(int i = 1; i <= 1000000; i++) {
			
			int flip = rand.nextInt(2);
			
			if(flip == 0) {
				sumOfHeads += 1;
			}
			else {
				sumOfTails += 1;
			}
		}
		
		System.out.printf("The number of heads was %d\n", sumOfHeads);
		System.out.printf("The number of tails was %d\n", sumOfTails);

	}

}
