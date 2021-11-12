package ru.itsjava.oopHW.figure;

public class Square extends Figure {
    private int side;
    private int height;

    public Square() {
    }

    public Square(int side, int height) {
        this.side = side;
        this.height = height;
    }

    public double area(int side, int height) {
        return side * side;
    }

    public int perimeter(int side, int height) {
        return side * 4;
    }

}
