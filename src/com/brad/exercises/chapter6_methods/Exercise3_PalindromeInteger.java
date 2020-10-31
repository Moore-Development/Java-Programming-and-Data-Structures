package com.brad.exercises.chapter6_methods;

import java.util.Scanner;

public class Exercise3_PalindromeInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to check if it's a palindrome: ");
		int number = input.nextInt();
		
		System.out.printf("Is %d a palindrome? " + isPalindrome(number), number);

		input.close();
	}

	// return the reversal of an integer
	public static int reverse(int number) {
		
		// convert an integer to a String
		String numberString = convertIntToString(number);
		
		// convert the String to an array of characters in reverse order
		char[] charArrayReversed = convertStringToArrayInReverse(numberString);
		
		// convert the array back to a String
		String numberStringReversed = convertCharArrayToString(charArrayReversed);
		
		// convert the string back to an integer and return the integer
		return Integer.parseInt(numberStringReversed);
	}
	
	// return true if number is a palindrome
	public static boolean isPalindrome(int number) {
		
		if(number == reverse(number)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// converts an integer to a String
	public static String convertIntToString(int number) {
		
		String numberToString = Integer.toString(number);
		
		System.out.println("Converting int to String... " + numberToString);
		
		return numberToString;
	}
	
	// converts a character array to a String
	public static String convertCharArrayToString(char [] charArray) {
		String charString = "";
		
		System.out.print("Converting char [] to String...");
		
		for(char item : charArray) {
			System.out.print(" " + item);
			charString += item;
		}
		
		System.out.println();
		
		return charString;
	}
	
	// convert a String to an array of characters in reverse order
	public static char[] convertStringToArrayInReverse(String string) {
		
		System.out.print("Converting String to char [] in reverse...");
		
		char[] charactersReversed = new char[string.length()];
		int index = 0;
		
		for(int i = string.length() - 1; i >= 0; i--) {
			charactersReversed[index] = string.charAt(i);
			
			System.out.print(" " + charactersReversed[index]);
			
			index++;
		}
		
		System.out.println();
		
		return charactersReversed;
	}
}
