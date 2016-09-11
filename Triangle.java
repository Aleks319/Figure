package Lesson4.hw.Figure;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;


        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    @Override
        public double getArea() {
            double p2 = (this.side1 + this.side2 + this.side3)/2;
            return Math.sqrt((p2*(p2-side1)*(p2-side2)*(p2-side3)));
        }

    @Override
    public double getP() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}