package interfaceLabProg.shape;

class Triangle implements Shape {

    private Double first_side;
    private Double second_side;
    private Double third_side;

    public Triangle(Double first_side, Double second_side, Double third_side) {
        this.first_side = first_side;
        this.second_side = second_side;
        this.third_side = third_side;
    }

    public Double getFirst_side() {
        return first_side;
    }

    public void setFirst_side(Double first_side) {
        this.first_side = first_side;
    }

    public Double getSecond_side() {
        return second_side;
    }

    public void setSecond_side(Double second_side) {
        this.second_side = second_side;
    }

    public Double getThird_side() {
        return third_side;
    }

    public void setThird_side(Double third_side) {
        this.third_side = third_side;
    }

    @Override
    public Double calculateArea() {

        Double semi_perimeter = calculatePerimeter() / 2;

        return Math.sqrt(semi_perimeter * (semi_perimeter - first_side) * (semi_perimeter - second_side) * (semi_perimeter - third_side));
    }

    @Override
    public Double calculatePerimeter() {
        return (first_side + second_side + third_side);
    }
}