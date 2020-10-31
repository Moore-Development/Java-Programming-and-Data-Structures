package com.brad.exercises.chapter9_objects_and_classes;

public class Fan {

	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan() {
	}
	
	public void setSpeed() {
		if(this.speed == SLOW) {
			this.speed = MEDIUM;
		}
		else if(this.speed == MEDIUM) {
			this.speed = FAST;
		}
		else {
			this.speed = SLOW;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		if(on) {
			return String.format("The speed of the fan is %d, the color is %s, and the radius is %f.",
					speed, color, radius);
		}
		else {
			return String.format("The color of the fan is %s, and the radius is %f. The fan is off.",
					color, radius);
		}
	}
}
