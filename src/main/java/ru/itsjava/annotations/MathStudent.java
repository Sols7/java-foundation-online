package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@StudentAnnotation(departmentName = "Math department")
@AllArgsConstructor
@ToString
public class MathStudent {
    private final String name;
    private final String surname;
    private int course;
}
