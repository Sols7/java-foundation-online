package ru.itsjava.interfaces;

public class Man implements Walkable, Swimable, Runnable{
    private int runDistance = 30;
    private double swimSpeed = 5.5;

    @Override
    public void run() {
        System.out.println("Я могу бегать ");
    }

    @Override
    public int maxRunDistance() {
        return runDistance;
    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать ");
    }

    @Override
    public double maxSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public void walk() {
        System.out.println("Я люблю прогулки!");
    }
}
