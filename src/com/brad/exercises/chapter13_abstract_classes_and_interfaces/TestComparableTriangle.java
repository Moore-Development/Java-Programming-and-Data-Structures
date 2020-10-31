package com.brad.exercises.chapter13_abstract_classes_and_interfaces;

public class TestComparableTriangle {

    public static void main(String[] args) {

        ComparableTriangle triangle1 =
                new ComparableTriangle("orange", true, 2,3,4);
        ComparableTriangle triangle2 =
                new ComparableTriangle("blue", true, 1,2,3);

        int result = triangle1.compareTo(triangle2);
        switch (result) {
            case -1: System.out.println("Triangle 1 is smaller than Triangle 2");
                break;
            case 0: System.out.println("Triangle 1 is the same size as Triangle 2");
                break;
            case 1: System.out.println("Triangle 1 is larger than Triangle 2");
                break;
            default: break;
        }
    }
}
