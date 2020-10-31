package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.GregorianCalendar;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private GregorianCalendar cal = new GregorianCalendar();
	
	public MyDate() {
		year = cal.get(GregorianCalendar.YEAR);
		month = cal.get(GregorianCalendar.MONTH) + 1;
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
}
