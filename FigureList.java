package Lesson3;

import Lesson2.Figure.Circle;
import Lesson2.Figure.Figure;
import Lesson2.Figure.Rectangle;
import Lesson2.Figure.Triangle;

/*
Построить иерархию классов «Фигуры» с учетом знаний о
полиморфизме. У каждого класса фигуры должен быть
метод подсчета площади. Создать список фигур. Вывести
площади всех фигур на экран.
 */
public class FigureList {

    public static void main(String[] args) {
        Figure[] list = {new Rectangle(15.2, 12.3),
                new Triangle(3.5, 4.7, 6.8),
                new Circle(32.2)};

         for (Figure f: list) {
             System.out.println(typeFigure(f) + "'s area: " + f.getArea());
         }

    }

    public static String typeFigure(Figure f) {
        return (f instanceof Rectangle) ? "Rectangle" : ((f instanceof Triangle) ? "Triangle" : "Circle");
    }
}
