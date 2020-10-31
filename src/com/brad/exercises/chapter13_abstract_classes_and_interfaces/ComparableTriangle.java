package com.brad.exercises.chapter13_abstract_classes_and_interfaces;

//import com.brad.exercises.chapter11_inheritance_and_polymorphism.GeometricObject;
import com.brad.exercises.chapter11_inheritance_and_polymorphism.Triangle;

public class ComparableTriangle extends Triangle implements Comparable<ComparableTriangle> {

    public ComparableTriangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled, side1, side2, side3);
    }

    public int compareTo(ComparableTriangle triangle) {
        if (this.getArea() > triangle.getArea()) {
            return 1;
        }
        else if (this.getArea() < triangle.getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
