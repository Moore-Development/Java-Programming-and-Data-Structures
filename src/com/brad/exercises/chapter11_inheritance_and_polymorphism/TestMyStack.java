package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.Scanner;

public class TestMyStack {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MyStack stack = new MyStack();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter a String: ");
			stack.add(input.nextLine());
		}
		
		int stackSize = stack.getSize();
		for(int i = 0; i < stackSize; i++) {
			System.out.println(stack.pop());
		}

		input.close();
	}

}
