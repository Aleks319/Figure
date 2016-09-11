package Lesson4.hw.Figure;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getP() {
        return 2*height + 2*width;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }



}