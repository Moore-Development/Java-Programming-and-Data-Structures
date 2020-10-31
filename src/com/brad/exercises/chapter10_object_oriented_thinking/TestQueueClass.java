package com.brad.exercises.chapter10_object_oriented_thinking;

import java.util.Random;

public class TestQueueClass {

	public static void main(String[] args) {
		
		Random rand = new Random();

		Queue queue = new Queue();
		
		for(int i = 0; i < 20; i++) {
			queue.enqueue(rand.nextInt());
		}
		
		for(int i = 0; i < 20; i++) {
			queue.dequeue();
		}
	}

}
