package ru.itsjava.oopHW.figure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square extends Figure {
    private double side;

    public Square() {
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

}
