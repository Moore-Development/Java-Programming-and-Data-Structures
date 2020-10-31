package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

public class Exercise8 {
	
	// Current time

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Show current time
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.println("Current time is " + currentHour + ":" 
				+ currentMinute + ":" + currentSecond + " GMT");
		
		// Prompt user for time zone offset to GMT
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		// Convert current time to the new time zone 
		currentHour += offset;
		
		// Display time in specified time zone
		System.out.println("Current time is " + currentHour + ":" 
				+ currentMinute + ":" + currentSecond + " GMT+" + offset);

		input.close();
	}

}
