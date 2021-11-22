package ru.itsjava.exceptions.exceptionHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public void checkAge() throws AgeNotValidException {
        if ((age < 0) || (age > 150)) {
            throw new AgeNotValidException("Возраст не может быть: " + age);
        }
    }
}
