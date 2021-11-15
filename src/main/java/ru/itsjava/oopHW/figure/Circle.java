package ru.itsjava.oopHW.figure;

public class Circle extends Figure {
    private double radius = 5.0;
    private final static double PI = 3.141592654;

    public Circle(){
    }

    public double area() {
        return PI * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }
}
