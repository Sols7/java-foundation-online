package ru.itsjava.interfaces.hw;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person sergey = new Person("Sergey", "Solovyov", 31);
        Person sergey2 = new Person("Sergey", "Ivanov", 42);
        Person ivan = new Person("Ivan", "Ivanov", 25);
        Person ivan2 = new Person("Ivan", "Ivanov", 22);

        Person[] people = {sergey, sergey2, ivan, ivan2};
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));
        Arrays.sort(people);
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));

        Person ivan2Clone = (Person) ivan2.clone();
        System.out.println("ivan2 = " + ivan2);
        System.out.println("ivan2Clone = " + ivan2Clone);
    }
}
