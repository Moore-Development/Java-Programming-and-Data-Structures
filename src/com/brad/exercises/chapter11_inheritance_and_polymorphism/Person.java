package com.brad.exercises.chapter11_inheritance_and_polymorphism;

public class Person {

	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	public Person() {
		name = "Name";
		address = "Address";
		phoneNumber = "Phone Number";
		email = "Email";
	}
	
	public Person(String name) {
		this.name = name;
		address = "Address";
		phoneNumber = "Phone Number";
		email = "Email";
	}
	
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return this.name + " is a Person";
	}
}
