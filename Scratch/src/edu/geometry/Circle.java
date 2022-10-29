
package edu.geometry;

public class Circle implements Shape {

    public static final double pi = Math.PI;
    private double radius;

    // ctors
    public Circle (double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // methods
    @Override
    public double findArea() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }
}