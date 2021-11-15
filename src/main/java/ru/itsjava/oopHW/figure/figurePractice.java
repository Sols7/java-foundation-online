package ru.itsjava.oopHW.figure;

public class figurePractice {

    public static void main(String[] args) {

        Figure tri = new Triangle();
        System.out.println("tri.area() = " + tri.area());
        System.out.println("tri.perimeter() = " + tri.perimeter());

        System.out.println();
        Figure rectangle = new Rectangle();
        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());

        System.out.println();
        Figure square = new Square();
        System.out.println("square.area() = " + square.area());
        System.out.println("square.perimeter() = " + square.perimeter());

        System.out.println();
        Figure circle = new Circle();
        System.out.println("circle.area() = " + circle.area());
        System.out.println("circle.perimeter() = " + circle.perimeter());

    }
}
