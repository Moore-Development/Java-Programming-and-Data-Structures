package com.brad.exercises.chapter13_abstract_classes_and_interfaces;

public class Square extends AbstractGeometricObject implements Colorable{

    private double side;

    public Square() {
        side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return side * 4;
    }
}
