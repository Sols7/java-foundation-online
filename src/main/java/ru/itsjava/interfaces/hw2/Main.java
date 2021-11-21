package ru.itsjava.interfaces.hw2;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.canEat();

        System.out.println();
        Man man = new Man();
        man.canTalk();
        man.canEat();

        System.out.println();
        Plant plant = new Plant();
        plant.canEat();

    }
}
