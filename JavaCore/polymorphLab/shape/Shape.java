package polymorphLab.shape;

import static java.lang.Math.PI;

// Abstract Shape class
public abstract class Shape {
    abstract public void calculateArea(); // Abstract method to calculate the area of a shape
}

// Circle class that extends Shape
class Circle extends Shape {

    private final Double radius;

    // Constructor for Circle
    public Circle(Double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method for Circle
    @Override
    public void calculateArea() {
        // Calculate and print the area of the circle
        System.out.println();
        System.out.println("The area of the circle with radius " + radius + " is : " + (PI * Math.pow(radius, 2.0)));
        System.out.println();
    }
}

// Rectangle class that extends Shape
class Rectangle extends Shape {

    private final Double length;
    private final Double breadth;

    // Constructor for Rectangle
    public Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Override the calculateArea method for Rectangle
    @Override
    public void calculateArea() {
        // Calculate and print the area of the rectangle
        System.out.println("The area of the rectangle with length " + length + " and breadth " + breadth + " is : " + length * breadth);
        System.out.println();
    }
}

// Triangle class that extends Shape
class Triangle extends Shape {

    private final Double firstSide;
    private final Double secondSide;
    private final Double thirdSide;

    // Constructor for Triangle
    public Triangle(Double firstSide, Double secondSide, Double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    // Override the calculateArea method for Triangle
    @Override
    public void calculateArea() {
        // Calculate and print the area of the triangle using Heron's formula
        Double s = (firstSide + secondSide + thirdSide) / 2.0;
        System.out.print("The area of a triangle with sides " + firstSide + ", " + secondSide + " and " + thirdSide + " is : ");
        System.out.println(Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide)));
    }
}

// Main application class
class App {
    public static void main(String[] args) {

        // Create an array of Shape objects
        Shape[] obj = {new Circle(7.0), new Rectangle(10.0, 20.0), new Triangle(4.0, 3.0, 5.0)};

        // Calculate and print the areas of the shapes
        for (Shape s : obj) {
            s.calculateArea();
        }
    }
}
