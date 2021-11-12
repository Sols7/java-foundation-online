package ru.itsjava.oopHW.figure;

public class Rectangle extends ru.itsjava.oopHW.figure.Figure {
    private int side;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    public double area(int side, int height) {
        return side * height;
    }

    public int perimeter(int side, int height) {
        return (side + height) * 2;
    }

}
