package interfaceLabProg.shape;

class App {
    public static void main(String[] args) {

        Circle c = new Circle(7.0);
        Rectangle r = new Rectangle(10.0, 20.0);
        Triangle t = new Triangle(3.0, 4.0, 5.0);

        System.out.println();
        System.out.println("\t\t\t\tShapes");
        System.out.println();
        System.out.println("For circle with radius 7.0 :");
        System.out.println("Perimeter of the circle : " + c.calculatePerimeter());
        System.out.println("Area of the circle : " + c.calculateArea());
        System.out.println();
        System.out.println("For rectangle with length 10.0 and breadth 20.0 :");
        System.out.println("Perimeter of the rectangle : " + r.calculatePerimeter());
        System.out.println("Area of the rectangle : " + r.calculateArea());
        System.out.println();
        System.out.println("For triangle with sides 3.0, 4.0 and 5.0 :");
        System.out.println("Perimeter of the triangle : " + t.calculatePerimeter());
        System.out.println("Area of the triangle : " + t.calculateArea());
        System.out.println();
    }
}