package interfaceLabProg.shape;

class Rectangle implements Shape {

    private Double length;
    private Double breadth;

    public Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getBreadth() {
        return breadth;
    }

    public void setBreadth(Double breadth) {
        this.breadth = breadth;
    }

    @Override
    public Double calculateArea() {
        return length * breadth;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (length + breadth) ;
    }
}