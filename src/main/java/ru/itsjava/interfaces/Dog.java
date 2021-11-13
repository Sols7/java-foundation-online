package ru.itsjava.interfaces;

public class Dog implements Swimable, Runnable {
    private int runDistance = 100;
    private double swimSpeed = 8.5;

    @Override
    public void run() {
        System.out.println("Собаки умеют бегать ");
    }

    @Override
    public int maxRunDistance() {
        return runDistance;
    }

    @Override
    public void swim() {
        System.out.println("Собаки умеют плавать ");
    }

    @Override
    public double maxSwimSpeed() {
        return swimSpeed;
    }
}
