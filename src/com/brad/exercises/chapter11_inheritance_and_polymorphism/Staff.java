package com.brad.exercises.chapter11_inheritance_and_polymorphism;

public class Staff extends Employee {
	
	private String title;

	public Staff() {
		super();
	}
	
	public Staff(String name) {
		super(name);
	}
	
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	public Staff(int office, int salary, String title) {
		super(office, salary);
		this.title = title;
	}

	public Staff(String name, String address, String phoneNumber, String email, int office, int salary,
			String title) {
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + super.getName() + " is a Staff member";
	}
	
}
