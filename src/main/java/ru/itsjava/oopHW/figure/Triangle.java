package ru.itsjava.oopHW.figure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends Figure {
    private double side;
    private double height;

    public Triangle() {
    }

    @Override
    public double area() {
        return 0.5 * side * height;
    }

    @Override
    public double perimeter() {
        return side * 3;
    }

}
