package ru.itsjava.annotations;

import lombok.AllArgsConstructor;
import lombok.ToString;

@StudentAnnotation(departmentName = "Biology department")
@AllArgsConstructor
@ToString
public class BiologyStudent {
    private final String name;
    private final String surname;
    private int course;
}
