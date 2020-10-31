package com.brad.helper.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {

	private Scanner scan;
	private int validInt;
	
	public InputValidator() {
		scan = new Scanner(System.in);
	}
	
	public int getValidInt() {
		boolean continueInputLoop = true;
		do {
			try {
				validInt = scan.nextInt();
				continueInputLoop = false;
			}
			catch(InputMismatchException e) {
				scan.nextLine();
				System.out.print("Invalid input. Enter a valid integer: ");
			}
		}
		while(continueInputLoop == true);
		return validInt;
	}
	
	public void close() {
		scan.close();
	}
}
