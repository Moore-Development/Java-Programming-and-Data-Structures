package com.brad.exercises.chapter11_inheritance_and_polymorphism;

public class TestMyDate {

	public static void main(String[] args) {

		MyDate myDate = new MyDate();
		
		System.out.printf("The current year is %d. The current month is %d. The current day is %d",
				myDate.getYear(), myDate.getMonth(), myDate.getDay());
	}

}
