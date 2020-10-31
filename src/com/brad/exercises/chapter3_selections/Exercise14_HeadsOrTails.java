package com.brad.exercises.chapter3_selections;

import java.util.Scanner;

public class Exercise14_HeadsOrTails {

	public static void main(String[] args) {
		int flip = (int)Math.round(Math.random());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Guess 1 for heads or 0 for tails: ");
		int guess = input.nextInt();
		
		if(guess == flip) {
			System.out.printf("You guess correctly! The flip was %d", flip);
		}
		else {
			System.out.printf("You guessed incorrectly. The flip was %d", flip);
		}
		
		input.close();
	}

}
