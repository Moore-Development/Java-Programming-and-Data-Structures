package com.brad.exercises.chapter11_inheritance_and_polymorphism;

public class Student extends Person {

	final static private String[] STATUS = {"Freshman", "Sophmore", "Junior", "Senior"};
	private String status;
	
	public Student() {
		super();
		status = STATUS[0];
	}
	
	public Student(String name) {
		super(name);
		status = STATUS[0];
	}
	
	public Student(int statusNum) {
		super();
		this.status = STATUS[statusNum];
	}
	
	public Student(String name, String address, String phoneNumber, String email, int statusNum) {
		super(name, address, phoneNumber, email);
		this.status = STATUS[statusNum];
	}
	
	public String getStatus() {
		return status;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + super.getName() + " is a Student";
	}
}
