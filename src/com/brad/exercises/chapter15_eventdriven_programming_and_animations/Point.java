package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

public class Point {

    private double x;
    private double y;
    private String direction;
    
    public Point(double x, double y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", this.x, this.y);
    }
}
