package com.brad.exercises.chapter3_selections;

import java.util.Random;
import java.util.Scanner;

public class Exercise17_RockPaperScissors {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int randomChoice = rand.nextInt(3);
		String comp = convertChoice(randomChoice);
		
		System.out.print("Rock (0), Paper (1), Scissors (2): ");
		Scanner input = new Scanner(System.in);
		String player = convertChoice(input.nextInt());
		
		if(player.equals("Rock")) {
			if(comp.contentEquals("Paper")) {
				System.out.printf("The computer is %s. You are %s. You lost.",
						comp, player);
			}
			else if(comp.contentEquals("Scissors")) {
				System.out.printf("The computer is %s. You are %s. You won!",
						comp, player);
			}
			else {
				System.out.printf("The computer is %s. You are %s. It's a tie.",
						comp, player);
			}
		}
		else if (player.equals("Paper")) {
			if(comp.contentEquals("Scissors")) {
				System.out.printf("The computer is %s. You are %s. You lost.",
						comp, player);
			}
			else if(comp.contentEquals("Rock")) {
				System.out.printf("The computer is %s. You are %s. You won!",
						comp, player);
			}
			else {
				System.out.printf("The computer is %s. You are %s. It's a tie.",
						comp, player);
			}
		}
		else if (player.equals("Scissors")) {
			if(comp.contentEquals("Rock")) {
				System.out.printf("The computer is %s. You are %s. You lost.",
						comp, player);
			}
			else if(comp.contentEquals("Paper")) {
				System.out.printf("The computer is %s. You are %s. You won!",
						comp, player);
			}
			else {
				System.out.printf("The computer is %s. You are %s. It's a tie.",
						comp, player);
			}
		}
		else {
			System.out.println("Invalid input!");
		}
		
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

}
