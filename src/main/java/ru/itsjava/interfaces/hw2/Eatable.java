package ru.itsjava.interfaces.hw2;

public interface Eatable {

    default void canEat() {
        System.out.println("Я питаюсь");
    }
}
