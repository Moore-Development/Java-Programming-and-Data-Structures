package com.brad.exercises.chapter13_abstract_classes_and_interfaces;

import java.util.Scanner;

public class Exercise1_TestTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a color for the triangle: ");
        String color = input.nextLine();

        System.out.print("Is the triangle filled?: ");
        Boolean filled = Boolean.parseBoolean(input.nextLine());

        System.out.print("Enter the length of side1: ");
        int side1 = Integer.parseInt(input.nextLine());

        System.out.print("Enter the length of side2: ");
        int side2 = Integer.parseInt(input.nextLine());

        System.out.print("Enter the length of side3: ");
        int side3 = Integer.parseInt(input.nextLine());

        ComparableTriangle triangle = new ComparableTriangle(color, filled, side1, side2, side3);

        System.out.printf("The area is %f, the perimeter is %f, the color is %s, and is it filled: %s",
                triangle.getArea(), triangle.getPerimeter(), triangle.getColor(), String.valueOf(triangle.isFilled()));

        input.close();
    }
}
