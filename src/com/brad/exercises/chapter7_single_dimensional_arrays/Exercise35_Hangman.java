package com.brad.exercises.chapter7_single_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercise35_Hangman {
	
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	static boolean cont = true;

	public static void main(String[] args) {
		
		// play until the user sets continue to false
		do {
			play();
		}
		while(cont == true);
	}
	
	// game logic
	private static void play() {
		
		// randomly generate a word
		String word = generateWord();
		
		// prompt user to guess one letter at a time
		
		
		// if user makes a correct guess, the letter is displayed
		
		// when the user finishes a word
			// display the number of misses
			// ask user whether to continue play with another word
	}
	
	// selects a random word from a list of words
	private static String generateWord() {
		
		String[] words = {"happy", "mailbox", "package", "chair", "porch"};
		
		// generate a random index
		int randomIndex = rand.nextInt(words.length);
		
		// return the word at the location of the random index
		return words[randomIndex];
	}

}
