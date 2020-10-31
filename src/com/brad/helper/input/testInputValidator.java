package com.brad.helper.input;

public class testInputValidator {

	public static void main(String[] args) {

		InputValidator input = new InputValidator();
		int testInt = input.getValidInt();
		System.out.println("Value of test integer: " + testInt);
	}

}
