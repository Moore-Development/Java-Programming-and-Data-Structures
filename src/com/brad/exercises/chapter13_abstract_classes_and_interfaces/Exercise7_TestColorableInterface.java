package com.brad.exercises.chapter13_abstract_classes_and_interfaces;

import java.util.ArrayList;

public class Exercise7_TestColorableInterface {

    public static void main(String[] args) {

        ArrayList<Square> list = new ArrayList<Square>();

        for(int i = 0; i < 5; i++) {
            list.add(new Square(i));
        }

        for(Square item : list) {
            System.out.println(item.getArea());
            item.howToColor();
            System.out.println();
        }
    }
}
