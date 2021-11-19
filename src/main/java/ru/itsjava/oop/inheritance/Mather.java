package ru.itsjava.oop.inheritance;

public interface Mather {

    default void giveLove() {
        System.out.println("Mather loves you");
    }
}
