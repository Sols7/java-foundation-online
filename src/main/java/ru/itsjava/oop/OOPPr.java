package ru.itsjava.oop;

import ru.itsjava.oopHW.Birds;
import ru.itsjava.oopHW.Crows;
import ru.itsjava.oopHW.Parrot;

public class OOPPr {
    public static void main(String[] args) {

        Birds birds1 = new Crows();
        System.out.println("birds1.toString() = " + birds1.toString());

        Birds birds2 = new Parrot();
        System.out.println("birds2.toString() = " + birds2.toString());

        Animals animal1 = new Wolf();
        System.out.println("animal1.toString() = " + animal1.toString());
    }
}
