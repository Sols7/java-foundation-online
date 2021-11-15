package ru.itsjava.oopHW.figure;

public class Triangle extends Figure {
    private double side = 8.0;
    private double height = 6.0;

    public Triangle() {
    }

    public double area() {
        return 0.5 * side * height;
    }

    public double perimeter() {
        return side * 3;
    }

}
