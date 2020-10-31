package com.brad.exercises.chapter11_inheritance_and_polymorphism;

public class SchoolAdmissions {

	public static void main(String[] args) {
		
		Person bob = new Person("Bob", "666 Sunnydale Ave", "666-666-6666", "bob@hell.com");
		System.out.println(bob.toString());
		
		System.out.println();
		
		Student bill = new Student("Bill");
		System.out.println(bill.toString());
		
		System.out.println();
		
		Employee jan = new Employee("Jan");
		System.out.println(jan.toString());
		
		System.out.println();
		
		Faculty sarah = new Faculty("Sarah");
		System.out.println(sarah.toString());
		
		System.out.println();
		
		Staff roger = new Staff("Roger");
		System.out.println(roger.toString());
		
		System.out.println();
	}

}
