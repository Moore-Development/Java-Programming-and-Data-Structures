package com.brad.exercises.chapter3_selections;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		if(number1 <= number2 && number1 <= number3) {
			if(number2 <= number3) {
				System.out.printf("The numbers in non-decreasing order are %d, %d, %d",
						number1, number2, number3);
			}
			else {
				System.out.printf("The numbers in non-decreasing order are %d, %d, %d",
						number1, number3, number2);
			}
		}
		else if(number2 <= number1 && number2 <= number3) {
			if(number1 <= number3) {
				System.out.printf("The numbers in non-decreasing order are %d, %d, %d",
						number2, number1, number3);
			}
			else {
				System.out.printf("The numbers in non-decreasing order are %d, %d, %d",
						number2, number3, number1);
			}
		}
		else {
			if(number1 <= number2) {
				System.out.printf("The numbers in non-decreasing order are %d, %d, %d",
						number3, number1, number2);
			}
			else {
				System.out.printf("The numbers in non-decreasing order are %d, %d, %d",
						number3, number2, number1);
			}
		}
		
		input.close();
	}

}
