package com.brad.exercises.chapter11_inheritance_and_polymorphism;

//import com.brad.exercises.chapter13_abstract_classes_and_interfaces.AbstractGeometricObject;

public class Triangle extends GeometricObject {
    private double side1, side2, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s-side3));
        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTriangle: side 1 = " + side1 + " side 2 = " + side2 + " side3 = " + side3;
    }
}
