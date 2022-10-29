package edu.geometry;

public class Rectangle implements Shape {
    private double width;
    private double length;

    // ctors
    public Rectangle (double width, double length) {
        setWidth(width);
        setLength(length);
    }

    // getters & setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        return getLength() * getWidth();
    }
}