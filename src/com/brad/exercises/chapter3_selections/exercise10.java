package com.brad.exercises.chapter3_selections;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		System.out.printf("What is %d + %d ?: ", number1, number2);
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(number1 + number2 == answer) {
			System.out.println("You are correct!");
		}
		else {
			System.out.println("Your answer is wrong.");
			System.out.printf("%d + %d should be %d", 
					number1, number2, number1 +number2);
		}

		input.close();
	}

}
