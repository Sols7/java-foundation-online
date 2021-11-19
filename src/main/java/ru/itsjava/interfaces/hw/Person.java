package ru.itsjava.interfaces.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String surname;
    private int age;


    @Override
    public int compareTo(Person person) {
        int result = this.name.compareTo(person.name);
        if (result == 0) {
            result = this.surname.compareTo(person.surname);
        }
        if (result == 0) {
            result = age - person.age;
        }
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
