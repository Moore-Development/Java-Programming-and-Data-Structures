package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise12_SumArrayList {

	public static void main(String[] args) {

		Integer[] array = {7,2,4,7,4,2};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		
		int sum = 0;
		
		for(int item : list) {
			sum += item;
		}
		
		System.out.println(sum);
	}

}
