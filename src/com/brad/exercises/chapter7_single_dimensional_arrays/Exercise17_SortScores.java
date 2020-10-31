package com.brad.exercises.chapter7_single_dimensional_arrays;

import java.util.Scanner;

public class Exercise17_SortScores {

	public static void main(String[] args) {
	
		// create an array of scores and print it
		int[] scores = {55, 23, 96, 52, 85, 29, 94, 67, 82, 91};
		System.out.println("Scores are " + print(scores));
		
		// sort the array of scores and print it
		sort(scores);
		System.out.println("Sorted are " + print(scores));
		
		// prompt the user to enter a score to search for and save it to a variable
		System.out.print("Enter a score to search for: ");
		Scanner input = new Scanner(System.in);
		int numToSearch = input.nextInt();
		
		// search for the score and print the location
		int locationOfNum = search(scores, numToSearch);
		System.out.println("Location of score is " + locationOfNum);

		input.close();
	}
	
	// Sorts the scores
	private static void sort(int[] scores) {
		
		// loop through each score 
		for(int i = 0; i < scores.length; i++) {
		
			// loop through every subsequent score
			for(int j = i + 1; j < scores.length; j++) {
			
				// check if the score is not greater than each subsequent score
				if(scores[i] > scores[j]) {
					
					// switch the score with the subsequent score
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
	}
	// searches a sorted array for an integer
	private static int search(int[] array, int num) {
		
		// set the indexes to search between
		int low = 0;
		int high = array.length - 1;
		int middle;
		
		// loop until low is greater than high
		while(low <= high) {
		
			// find the middle of the search area
			middle = (low + high) / 2;
			
			
			// return the middle if it is the number to search for
			if(array[middle] == num) {
				return middle;
			}
			
			// if middle is greater than the number, decrease high
			else if(array[middle] > num) {
				high = middle -1;
			}
			
			// if middle is less than the number, increase low
			else {
				low = middle + 1;
			}
		}
		
		// if number was not found, return -1
		return -1;
	}
	
	// prints the array
	private static String print(int[] scores) {
		
		// loop through the array and append each value to a string
		String result = "";
		for(int i = 0; i < scores.length; i++) {
			result += scores[i] + " ";
		}
		
		// return the string
		return result;
	}
}
