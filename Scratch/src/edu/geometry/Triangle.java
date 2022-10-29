package edu.geometry;

public class Triangle implements Shape {
    private double base;
    private double height;

    // ctors
    public Triangle (double base, double height) {
        setBase(base);
        setHeight(height);
    }


    // getters & setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return ((getBase() * getHeight())/2);
    }
}