package com.knoldus.enumGeometry.shape;

import com.knoldus.Enum.EnumClass;

import java.util.Scanner;

public class AreaGeometry {
    enum Shape {
        Square,
        circle,
        rectangle,
    }

    public double circleArea() {
        Scanner read_radius = new Scanner(System.in);
        final double pii = 3.14;
        System.out.println("Enter the raduis of the circle");
        int radius = read_radius.nextInt();
        return (double) (pii * radius * radius);

    }


    public int squareArea() {


        Scanner read_side = new Scanner(System.in);
        System.out.println("Enter the side of the Square");
        int side = read_side.nextInt();
        return side * side;
    }


    public int rectangleArea() {
        Scanner read_side = new Scanner(System.in);
        System.out.println("Enter the side1 of the rectangle ");
        int side1 = read_side.nextInt();
        System.out.println("Enter the side2 of the rectangle");
        int side2 = read_side.nextInt();
        return side1 * side2;


    }

    public static void main(String[] args) {

        AreaGeometry object = new AreaGeometry();
        for (Shape index : Shape.values()) {
            if (index == Shape.circle) {
                System.out.println(object.circleArea());
            } else if (index == Shape.Square) {
                System.out.println(object.squareArea());
            } else if (index == Shape.rectangle) {
                System.out.println(object.rectangleArea());
            }
        }

    }
}
