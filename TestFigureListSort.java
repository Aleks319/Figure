package Lesson4.hw.Figure;

import java.util.Arrays;

public class TestFigureListSort {
    public static void main(String[] args) {
        Figure[] list = {new Rectangle(12, 16), new Triangle(13.5, 14.8, 15.2), new Circle(18.88), new Rectangle(25.5, 11),
                new Triangle(11, 5, 8.9), new Triangle(1.5, 3, 2.8), new Circle(31), new Rectangle(1, 23)};

        System.out.println("Figure list before sorting by area: ");
        for (Figure f : list) {
            System.out.println(f.getArea());
        }

        Arrays.sort(list, new FigureComparator());
        System.out.println("\n" + "***********************************" + "\n");

        System.out.println("Figure list after sorting by area: ");
        for (Figure f : list) {
            System.out.println(f.getArea());
        }
    }
}
