package com.brad.exercises.chapter10_object_oriented_thinking;

public class Queue {

	private int[] elements;
	private int size = 0;
	
	public Queue() {
		elements = new int[8];
	}
	
	public void enqueue(int v) {
		System.out.printf("Adding element %d to queue... Size of queue is %d\n", v, size);
		if(size >= elements.length) {
			System.out.println("Creating new array");
			int[] temp = new int[elements.length * 2];
			for(int i = 0; i < elements.length; i++) {
				temp[i] = elements[i];
			}
			elements = temp;
		}
		elements[size++] = v;
		System.out.printf("Added element %d to queue. Size of queue is %d\n", v, size);
	}
	
	public int dequeue() {
		int firstElement = elements[0];
		System.out.printf("Removing element %d from queue... Size of queue is %d\n", firstElement, size);
		for(int i = 0; i < size; i++) {
			elements[i] = elements[i+1];
		}
		size--;
		System.out.printf("Removed element %d from queue. Size of queue is %d\n", firstElement, size);
		return firstElement;
	}
	
	public boolean empty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getSize() {
		return size;
	}
}
