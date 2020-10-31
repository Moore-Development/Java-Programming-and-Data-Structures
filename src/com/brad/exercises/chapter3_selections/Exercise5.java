package com.brad.exercises.chapter3_selections;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of today's day (e.g. Sun = 0, Mon = 1): ");
		int today = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int days = input.nextInt();
		
		int futureDay = (today + days) % 7;
		
		System.out.printf("Today is %s and the future day is %s",
				convertIntDateToString(today),
				convertIntDateToString(futureDay));
		
		input.close();
	}

	public static String convertIntDateToString(int date) {
		
		String futureDayString;

		switch(date) {
		case 0: futureDayString = "Sunday"; break;
		case 1: futureDayString = "Monday"; break;
		case 2: futureDayString = "Tuesday"; break;
		case 3: futureDayString = "Wednesday"; break;
		case 4: futureDayString = "Thursday"; break;
		case 5: futureDayString = "Friday"; break;
		case 6: futureDayString = "Saturday"; break;
		default: futureDayString = "Invalid"; System.exit(1);
		}
		
		return futureDayString;
	}
}
