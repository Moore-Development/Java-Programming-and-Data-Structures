package com.brad.exercises.chapter11_inheritance_and_polymorphism;

public class Faculty extends Employee {

	private String officeHours;
	private String rank;
	
	public Faculty() {
		super();
		officeHours = "None";
		rank = "Professor";
	}
	
	public Faculty(String name) {
		super(name);
		officeHours = "None";
		rank = "Professor";
	}

	public Faculty(String officeHours, String rank) {
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public Faculty(int office, int salary, String officeHours, String rank) {
		super(office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public Faculty(String name, String address, String phoneNumber, String email, int office, int salary,
			String officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + super.getName() + " is a Faculty member";
	}
}
