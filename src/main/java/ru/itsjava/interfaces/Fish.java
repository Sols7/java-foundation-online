package ru.itsjava.interfaces;

public class Fish implements Swimable{
    private double swimSpeed = 12.0;

    @Override
    public void swim() {
        System.out.println("Рыбы умеют плавать");
    }

    @Override
    public double maxSwimSpeed() {
        return swimSpeed;
    }
}
