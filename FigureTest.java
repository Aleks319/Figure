package Lesson2.Figure;

public class FigureTest {
    public static void main(String[] args) {
        Circle circle = new Circle(32.2);
        Rectangle rectangle = new Rectangle(15.2, 12.3);
        Triangle triangle = new Triangle(3.5, 4.7, 6.8);

        System.out.println("Perimeter: ");
        System.out.println("Circle: " + circle.getP());
        System.out.println("Rectangle: " + rectangle.getP());
        System.out.println("Triangle: " + triangle.getP());

        System.out.println();

        System.out.println("Area: ");
        System.out.println("Circle: " + circle.getArea());
        System.out.println("Rectangle: " + rectangle.getArea());
        System.out.println("Triangle: " + triangle.getArea());
    }
}
