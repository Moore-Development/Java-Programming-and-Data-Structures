package com.brad.exercises.chapter4_math_chars_strings;

import java.util.Scanner;

public class Exercise11_Decimal_To_Hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimalValue = input.nextInt();
		char hexValue;
		
		switch(decimalValue) {
		case 0: hexValue = '0'; break;
		case 1: hexValue = '1'; break;
		case 2: hexValue = '2'; break;
		case 3: hexValue = '3'; break;
		case 4: hexValue = '4'; break;
		case 5: hexValue = '5'; break;
		case 6: hexValue = '6'; break;
		case 7: hexValue = '7'; break;
		case 8: hexValue = '8'; break;
		case 9: hexValue = '9'; break;
		case 10: hexValue = 'A'; break;
		case 11: hexValue = 'B'; break;
		case 12: hexValue = 'C'; break;
		case 13: hexValue = 'D'; break;
		case 14: hexValue = 'E'; break;
		case 15: hexValue = 'F'; break;
		default: hexValue= '0'; break;
		}
		
		System.out.printf("The Hex value is %c", hexValue);

		input.close();
	}

}
