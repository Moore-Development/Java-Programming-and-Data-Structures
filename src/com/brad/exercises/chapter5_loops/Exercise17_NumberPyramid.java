package com.brad.exercises.chapter5_loops;

import java.util.Scanner;

public class Exercise17_NumberPyramid {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines (0 - 15): ");
		int number = input.nextInt();
		
		for(int i = 1; i <= number; i++) {
			for(int j = number; j >= 1; j--) {
				if(j > i) {
					System.out.print("   ");
				}
				else {
					System.out.print(" " + j + " ");
				}
			}
			for(int g = 2; g <= number; g++) {
				if(g > i) {
					System.out.print("   ");
				}
				else {
					System.out.print(" " + g + " ");
				}
			}
			System.out.println();
		}
		
		input.close();
	}

}
