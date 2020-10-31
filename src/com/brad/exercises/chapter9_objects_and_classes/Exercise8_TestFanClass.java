package com.brad.exercises.chapter9_objects_and_classes;

public class Exercise8_TestFanClass {

	public static void main(String[] args) {

		Fan fan1 = new Fan();
		fan1.setOn(true);
		fan1.setSpeed();
		fan1.setSpeed();
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		
		Fan fan2 = new Fan();
		fan2.setSpeed();
		fan2.setColor("Blue");
		
		System.out.println("Fan 1: " + fan1.toString());
		System.out.println("Fan 2: " + fan2.toString());
	}

}
