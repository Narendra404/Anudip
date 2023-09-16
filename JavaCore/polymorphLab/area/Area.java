package polymorphLab.area;

public class Area {

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2.0); // Using the formula for the area of a circle
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth; // Using the formula for the area of a rectangle
    }

    // Method to calculate the area of a triangle using Heron's formula
    public double calculateArea(double firstSide, double secondSide, double thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2.0; // Calculating the semi-perimeter
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide)); // Using Heron's formula
    }

    public static void main(String[] args) {

        double r = 7.0, l = 10.0, b = 20.0, f = 3.0, s = 4.0, t = 5.0;

        Area a = new Area();

        // Calculating and printing the area of a circle
        System.out.println("Area of circle of radius " + r + " is : " + a.calculateArea(r));

        // Calculating and printing the area of a rectangle
        System.out.println("Area of rectangle of length " + l + " and breadth " + b + " is : " + a.calculateArea(l, b));

        // Calculating and printing the area of a triangle
        System.out.println("The area of a triangle with sides " + f + ", " + s + " and " + t + " is : " + a.calculateArea(f, s, t));
    }
}
