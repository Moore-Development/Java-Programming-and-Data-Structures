package com.brad.exercises.chapter6_methods;

import java.util.Random;
import java.util.Scanner;

public class Exercise30_Craps {
	
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to Craps");
		
		int firstRoll = firstRoll();
		
		reRoll(firstRoll);
		
		input.close();
	}
	
	private static int firstRoll() {
		
		int roll = rollDice();
		
		if (roll == 2 || roll == 3 || roll == 12) {
			lose();
		}
		else if (roll == 7 || roll == 11) {
			win();
		}
		else {
			System.out.printf("Reroll until you roll a %d (Win) or a 7 (Lose)...\n", roll);
		}
		
		return roll;
	}
	
	private static void reRoll(int firstRoll) {
		
		int roll;
		
		do {
			 roll = rollDice();
		}
		
		while (roll != firstRoll && roll != 7);
		
		if(roll == firstRoll) {
			win();
		}
		else if(roll == 7) {
			lose();
		}
	}
	
	private static int rollDice() {
		System.out.println("Press 'Enter' to Roll");
		input.nextLine();
		int dice1 = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		int sum = dice1 + dice2;
		System.out.printf("You rolled a %d (%d + %d)\n", sum, dice1, dice2);
		return sum;
	}
	
	private static void win() {
		System.out.println("Holy shit, you won. Congrats stupid.\n");
		System.exit(0);
	}
	
	private static void lose() {
		System.out.println("You lose, stupid.");
		System.exit(0);
	}

}
