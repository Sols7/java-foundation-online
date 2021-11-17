package ru.itsjava.oopHW.figure;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {
    private double radius = 5.0;

    public Circle(){
    }

    @Override
    public double area() {
        return PI * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
