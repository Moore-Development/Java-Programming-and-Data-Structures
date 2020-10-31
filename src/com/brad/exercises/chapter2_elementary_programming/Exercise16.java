package com.brad.exercises.chapter2_elementary_programming;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side of a hexagon: ");
		double sideOfHexagon = input.nextDouble();
		
		double areaOfHexagon = ((3 * Math.sqrt(3)) / 2) 
				* Math.pow(sideOfHexagon, 2);
		
		System.out.println("The area of the Hexagon is " 
				+ (int)(areaOfHexagon * 10000) / 10000.00);
		
		input.close();

	}

}
