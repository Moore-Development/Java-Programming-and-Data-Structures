package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.ArrayList;

import com.brad.helper.input.InputValidator;

public class Exercise13_RemoveDuplicates {
	
	private static InputValidator input = new InputValidator();
	private static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.print("Enter an integer: ");
			list.add(input.getValidInt());
		}
		
		removeDuplicate(list);
		
		System.out.println(list);
		for(int item: list) {
			System.out.println("item " + item);
		}
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int item : list) {
			if(!temp.contains(item)) {
				temp.add(item);
			}
		}
		list.clear();
		list.addAll(temp);
	}
}
