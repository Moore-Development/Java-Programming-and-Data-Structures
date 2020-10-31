package com.brad.exercises.chapter6_methods;

import java.util.Random;
import java.util.Scanner;

public class Exercise32_ChanceOfWinningCraps {
	
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	
	static int total = 0;

	public static void main(String[] args) {
		
		System.out.println("Your chances of winning craps...");
		
		int count = 0;
		
		for(int i = 0; i < 10000; i ++) {
			int firstRoll = firstRoll();
			if(firstRoll != 0) {
				reRoll(firstRoll);			
			}
			count++;
		}
		
		double chances = (total * 100) / 10000;
		
		System.out.printf("%d won out of %d rolls.\n", total, count);
		System.out.println("Your chances are " + chances + "%");
	}
	
	private static int firstRoll() {
		
		int roll = rollDice();
		
		if (roll == 2 || roll == 3 || roll == 12) {
			lose();
			return 0;
		}
		else if (roll == 7 || roll == 11) {
			win();
			return 0;
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
			return;
		}
		else if(roll == 7) {
			lose();
			return;
		}
	}
	
	private static int rollDice() {
		int dice1 = rand.nextInt(6) + 1;
		int dice2 = rand.nextInt(6) + 1;
		int sum = dice1 + dice2;
		System.out.printf("You rolled a %d (%d + %d)\n", sum, dice1, dice2);
		return sum;
	}
	
	private static void win() {
		System.out.println("Holy shit, you won. Congrats stupid.\n");
		total++;
	}
	
	private static void lose() {
		System.out.println("You lose, stupid.");
	}

}
