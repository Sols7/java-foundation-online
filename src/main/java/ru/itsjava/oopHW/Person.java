package ru.itsjava.oopHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public int birthday() {
        return ++age;
    }

    public boolean takeBeer() {
        if (age > 18) return true;
        return false;
    }
}
