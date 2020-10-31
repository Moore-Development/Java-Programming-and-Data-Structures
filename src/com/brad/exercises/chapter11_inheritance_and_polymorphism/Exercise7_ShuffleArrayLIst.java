package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise7_ShuffleArrayLIst {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		java.util.Collections.shuffle(list);
		for(int item : list) {
			System.out.println(item);
		}
	}
}
