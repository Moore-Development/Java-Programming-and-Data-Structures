package com.brad.exercises.chapter5_loops;

import java.util.Scanner;

public class Exercise37_DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal integer: ");
		int number = input.nextInt();
		String binaryNumber = "";
		int  removeNumber = 2048;
		
		while(removeNumber > 0) {
			if(number >= removeNumber) {
				binaryNumber += "1";
				number -= removeNumber;
			}
			else {
				binaryNumber += "0";
			}
			removeNumber /= 2;
		}
		
		System.out.println("The number in binary is " + binaryNumber);

		input.close();
	}

}
