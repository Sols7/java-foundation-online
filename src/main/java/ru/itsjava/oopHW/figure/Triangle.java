package ru.itsjava.oopHW.figure;

public class Triangle extends ru.itsjava.oopHW.figure.Figure {
    private int side;
    private int height;

    public Triangle() {
    }

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    public double area(int side, int height) {
        return 0.5 * side * height;
    }

    public int perimeter(int side, int height) {
        return side * 3;
    }

}
