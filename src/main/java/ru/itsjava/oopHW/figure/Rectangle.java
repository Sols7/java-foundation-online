package ru.itsjava.oopHW.figure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Figure {
    private double side;
    private double height;

    public Rectangle() {
    }

    @Override
    public double area() {
        return side * height;
    }

    @Override
    public double perimeter() {
        return (side + height) * 2;
    }

}
