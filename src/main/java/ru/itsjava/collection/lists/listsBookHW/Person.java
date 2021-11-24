package ru.itsjava.collection.lists.listsBookHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;
    private final boolean isMale;
}
