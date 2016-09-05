package Lesson2.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getP() {
        return 2*Math.PI*radius;
    }
}