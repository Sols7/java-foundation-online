package ru.itsjava.interfaces.hw2;

public interface Talkable {

    default void canTalk() {
        System.out.println("Я умею разговаривать");
    }
}
