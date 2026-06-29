package org.example;

public class RightTriangle extends Shape {
    private double length;
    private double width;
    public RightTriangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return 0.5 * length * width;
    }
    public double getPerimeter() {
        double hypotenuse = Math.sqrt((length * length) + (width * width));
        return length + width + hypotenuse;
    }
}