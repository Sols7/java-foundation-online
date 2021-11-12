package ru.itsjava;

import ru.itsjava.oopHW.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola!");

        Person sergey = new Person("Sergey", 14);
        System.out.println("sergey.birthday() = " + sergey.birthday());
        System.out.println("sergey.takeBeer() = " + sergey.takeBeer());

    }
}
