package com.brad.exercises.chapter5_loops;

import java.util.Scanner;

public class Exercise46_ReverseAString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userInput = input.nextLine();
		
		String userInputReversed = "";
		
		for(int i = userInput.length() - 1; i >= 0; i--) {
			userInputReversed += userInput.charAt(i);
		}
		
		System.out.println("The reversed string is " + userInputReversed);
		
		input.close();
	}

}
