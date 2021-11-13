package ru.itsjava.interfaces;

public class Cat implements Walkable, Runnable {
    private int runDistance = 8;

    @Override
    public void run() {
        System.out.println("Кошки умеют бегать ");
    }

    @Override
    public int maxRunDistance() {
        return runDistance;
    }

    @Override
    public void walk() {
        System.out.println("Кошки умеют ходить");
    }
}

