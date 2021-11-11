package ru.itsjava.oopHW;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Sergey";
    public static final int DEFAULT_AGE = 15;
    public static final int NEW_AGE = 35;
    public static final boolean EXPECTED_MORE18 = false;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertEquals(DEFAULT_NAME, actualPerson.getName());
        assertEquals(DEFAULT_AGE, actualPerson.getAge());
    }

    @DisplayName(" корректно менять возраст")
    @Test
    public void shouldHaveCorrectUpdateAge(){
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setAge(NEW_AGE);
        assertEquals(NEW_AGE, actualPerson.getAge());
    }


    @DisplayName(" корректно менять возраст в день рождения")
    @Test
    public void shouldHaveCorrectBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals(DEFAULT_AGE + 1, actualPerson.birthday());
    }

    @DisplayName(" корректно проверять совершенолетие")
    @Test
    public void shouldHaveCorrectCheckMore18() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals(EXPECTED_MORE18, actualPerson.takeBeer());
    }

}
