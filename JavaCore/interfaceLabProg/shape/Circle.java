package interfaceLabProg.shape;

class Circle implements Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}