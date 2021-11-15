package ru.itsjava.oopHW.figure;

public class Rectangle extends Figure {
    private double side = 5;
    private double height = 4;

    public Rectangle() {
    }

    public double area() {
        return side * height;
    }

    public double perimeter() {
        return (side + height) * 2;
    }

}
