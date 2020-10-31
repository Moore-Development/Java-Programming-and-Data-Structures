package com.brad.exercises.chapter5_loops;

import java.util.Random;
import java.util.Scanner;

public class Exercise34_RockPaperScissors {
	
	static int playerWins = 0;
	static int computerWins = 0;

	public static void main(String[] args) {
			
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		while (playerWins - computerWins <= 2 
				&& computerWins - playerWins <= 2) {
			
			int randomChoice = rand.nextInt(3);
			String comp = convertChoice(randomChoice);
			
			System.out.print("Rock (0), Paper (1), Scissors (2): ");
			String player = convertChoice(input.nextInt());
			
			if(player.equals("Rock")) {
				if(comp.contentEquals("Paper")) {
					lose(comp, player);
				}
				else if(comp.contentEquals("Scissors")) {
					win(comp, player);
				}
				else {
					draw(comp, player);
				}
			}
			else if (player.equals("Paper")) {
				if(comp.contentEquals("Scissors")) {
					lose(comp, player);
				}
				else if(comp.contentEquals("Rock")) {
					win(comp, player);
				}
				else {
					draw(comp, player);
				}
			}
			else if (player.equals("Scissors")) {
				if(comp.contentEquals("Rock")) {
					lose(comp, player);
				}
				else if(comp.contentEquals("Paper")) {
					win(comp, player);
				}
				else {
					draw(comp, player);
				}
			}
			else {
				System.out.println("Invalid input!\n");
			}
		}
		
		System.out.println("The game has concluded.");
		System.out.printf("The player has won %d games "
				+ "and the computer has won %d games.",
			playerWins, computerWins);
		
		input.close();
	}
	
	private static String convertChoice(int choice) {
		String gesture = "";
		switch(choice) {
		case 0: gesture += "Rock"; break;
		case 1: gesture += "Paper"; break;
		case 2: gesture += "Scissors"; break;
		}
		return gesture;
	}
	
	private static void win(String comp, String player) {
		playerWins++;
		System.out.printf("The computer is %s. You are %s. You won!\n",
				comp, player);
	}
	
	private static void lose(String comp, String player) {
		computerWins++;
		System.out.printf("The computer is %s. You are %s. You lost.\n",
				comp, player);
	}
	
	private static void draw(String comp, String player) {
		System.out.printf("The computer is %s. You are %s. It's a tie.\n",
				comp, player);
	}

}
