package edu.geometry.client;

import edu.geometry.*;

class ShapeClient {

    public static void main(String[] args) {
        Shape circle = new Circle(3.0);
        Shape rectangle = new Rectangle(3, 6);
        Shape triangle = new Triangle(9, 5);

        System.out.printf("Area of the circle: %s\n", circle.findArea());
        System.out.printf("Area of the rectangle: %s\n", rectangle.findArea());
        System.out.printf("Area of the triangle: %s\n", triangle.findArea());

    }
}