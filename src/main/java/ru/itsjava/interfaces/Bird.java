package ru.itsjava.interfaces;

public class Bird implements Walkable, Flyable{
    @Override
    public void fly() {
        System.out.println("Птицы умеют летать");
    }

    @Override
    public String flyMaxDistance() {
        return "Птицы любят летать на очень большие расстояния!!!";
    }

    @Override
    public void walk() {
        System.out.println("Птицы умеют ходить");
    }
}
