package ru.itsjava.oopHW.figure;

public class Square extends Figure {
    private double side = 5.0;

    public Square() {
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

}
