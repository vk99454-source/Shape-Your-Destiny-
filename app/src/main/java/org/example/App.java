package org.example;

public class App {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(10, 5);
    RightTriangle rightTriangle = new RightTriangle(3, 4);
    Square square = new Square(5);
    IsocelesRightTriangle isocelesRightTriangle = new IsocelesRightTriangle(5);

    System.out.println("Shape Your Destiny Driver Program");
    System.out.println();

    System.out.println("Circle");
    System.out.println("Area: " + circle.getArea());
    System.out.println("Perimeter: " + circle.getPerimeter());
    System.out.println();

    System.out.println("Rectangle");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());
    System.out.println("Number of sides: " + rectangle.numberOfSides());
    System.out.println();

    System.out.println("Right Triangle");
    System.out.println("Area: " + rightTriangle.getArea());
    System.out.println("Perimeter: " + rightTriangle.getPerimeter());
    System.out.println("Number of sides: " + rightTriangle.numberOfSides());
    System.out.println();

    System.out.println("Square");
    System.out.println("Area: " + square.getArea());
    System.out.println("Perimeter: " + square.getPerimeter());
    System.out.println("Number of sides: " + square.numberOfSides());
    System.out.println();

    System.out.println("Isoceles Right Triangle");
    System.out.println("Area: " + isocelesRightTriangle.getArea());
    System.out.println("Perimeter: " + isocelesRightTriangle.getPerimeter());
    System.out.println("Number of sides: " + isocelesRightTriangle.numberOfSides());
  }
}