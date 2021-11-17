package ru.itsjava.oopHW.figure;

public class figurePractice {

    public static void main(String[] args) {

        Figure tri = new Triangle(10, 7);
        System.out.println("tri.area() = " + tri.area());
        System.out.println("tri.perimeter() = " + tri.perimeter());

        System.out.println();
        Figure rectangle = new Rectangle(10, 5);
        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());

        System.out.println();
        Figure square = new Square(5);
        System.out.println("square.area() = " + square.area());
        System.out.println("square.perimeter() = " + square.perimeter());

        System.out.println();
        Figure circle = new Circle(5);
        System.out.println("circle.area() = " + circle.area());
        System.out.println("circle.perimeter() = " + circle.perimeter());

    }
}
