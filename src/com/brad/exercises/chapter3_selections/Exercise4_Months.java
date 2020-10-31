package com.brad.exercises.chapter3_selections;

import java.util.Scanner;

public class Exercise4_Months {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numberOfMonth = ((int) (Math.random() * 110) % 12) + 1;
		String nameOfMonth;
		
		switch(numberOfMonth) {
		case 1: nameOfMonth = "January"; break;
		case 2: nameOfMonth = "February"; break;
		case 3: nameOfMonth = "March"; break;
		case 4: nameOfMonth = "April"; break;
		case 5: nameOfMonth = "May"; break;
		case 6: nameOfMonth = "June"; break;
		case 7: nameOfMonth = "July"; break;
		case 8: nameOfMonth = "August"; break;
		case 9: nameOfMonth = "September"; break;
		case 10: nameOfMonth = "October"; break;
		case 11: nameOfMonth = "November"; break;
		case 12: nameOfMonth = "December"; break;
		default: nameOfMonth = "Invalid";
		}
		
		System.out.print("Enter the name of month " + numberOfMonth + ": ");
		String answer = input.nextLine();

		if(answer.equals(nameOfMonth)) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Incorrect!");
		}
		
		System.out.println("The name of the " + numberOfMonth 
				+ " month is " + nameOfMonth);
		
		input.close();
	}

}
