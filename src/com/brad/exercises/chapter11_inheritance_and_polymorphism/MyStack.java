package com.brad.exercises.chapter11_inheritance_and_polymorphism;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object>{

	/**
	 * I don't know what this is. Eclipse wanted me to put it in.
	 */
	private static final long serialVersionUID = 1L;
	
	public MyStack() {
		super();
	}
	
	public int getSize() {
		return super.size();
	}
	
	public Object peek() {
		return super.get(super.size() - 1);
	}
	
	public Object pop() {
		Object objectToPop = super.get(super.size() - 1);
		super.remove(super.size() - 1);
		return objectToPop;
	}
	
	public void push(Object objectToPush) {
		super.add(objectToPush);
	}
	
	@Override
	public String toString() {
		return "stack: " + super.toString();
	}

}
