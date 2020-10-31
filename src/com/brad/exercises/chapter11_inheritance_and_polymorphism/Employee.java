package com.brad.exercises.chapter11_inheritance_and_polymorphism;

public class Employee extends Person {
	
	private int office;
	private int salary;
	private MyDate dateHired;

	public Employee() {
		super();
		office = 0;
		salary = 0;
		dateHired = new MyDate();
	}
	
	public Employee(String name) {
		super(name);
		office = 0;
		salary = 0;
		dateHired = new MyDate();
	}
	
	public Employee(int office, int salary) {
		super();
		this.office = office;
		this.salary = salary;
	}

	public Employee(String name, String address, String phoneNumber, String email,
			int office, int salary) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		dateHired = new MyDate();
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate date) {
		this.dateHired = date;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + super.getName() + " is a Employee";
	}
	
}
