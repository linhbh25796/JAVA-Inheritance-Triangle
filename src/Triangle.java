public class Triangle extends Shape {
    private double side, side2, side3 = 1.0;

    public Triangle() {
        this.side = Math.random() * 10 + 1;
        this.side2 = Math.random() * 10 + 1;
        this.side3 = Math.random() * 10 + 1;
    }

    public Triangle(double side, double side2, double side3) {
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean isFilled, double side, double side2, double side3) {
        super(color, isFilled);
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double a = this.side;
        double b = this.side2;
        double c = this.side3;
        double area = Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
        return area;
    }

    public double getPerimeter() {
        return (this.side + this.side2 + this.side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " color: " + this.getColor() + " __ filled: " + (this.isFilled() ? "filled" : "not filled") +
                "  side1 = " + side +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ", area = " + this.getArea() + ", perimeter = " + this.getPerimeter() +
                '}';
    }

}
