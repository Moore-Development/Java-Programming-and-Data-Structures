package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.ArrayList;

import com.brad.helper.input.InputValidator;

public class Exercise4_MaximumElementInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		InputValidator input = new InputValidator();
		
		do {
			System.out.print("Enter a sequence of numbers ending with 0: ");
			list.add(input.getValidInt());
		}
		while(list.get(list.size() -1) != 0);
		
		input.close();
		System.out.println("The maximum value that was entered is " + max(list));
	}

	public static Integer max(ArrayList<Integer> list) {
		if(list.size() <= 0 || list == null) {
			return null;
		}
		int max = list.get(0);
		for(int item : list) {
			if(item > max) {
				max = item;
			}
		}
		return max;
	}
}
