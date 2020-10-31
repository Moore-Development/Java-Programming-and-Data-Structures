package com.brad.exercises.chapter4_math_chars_strings;

import java.util.Scanner;

public class Exercise8_ASCII {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code (0-127): ");
		int asciiInt = input.nextInt();
		
		char asciiChar = (char)asciiInt;
		
		System.out.printf("The character for ASCII code %d is %c",
				asciiInt, asciiChar);

		input.close();
	}

}
