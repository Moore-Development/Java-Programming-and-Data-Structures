package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_SortArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,6,1,4,8,5,4,6));
		java.util.Collections.sort(list);
		
		for(int item : list) {
			System.out.println(item);
		}
	}

}
