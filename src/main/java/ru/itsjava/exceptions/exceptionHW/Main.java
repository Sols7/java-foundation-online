package ru.itsjava.exceptions.exceptionHW;

public class Main {

    public static void main(String[] args) {
        Person sergey = new Person("Sergey", 31);
        Person ivan = new Person("Ivan", -5);
        Person oleg = new Person("Oleg", 180);

        try {
            System.out.println("sergey = " + sergey);
            sergey.checkAge();
        } catch (AgeNotValidException ca){
            System.out.println("Не корректный возраст");
            ca.printStackTrace();
        }

        System.out.println();
        try {
            System.out.println("ivan = " + ivan);
            ivan.checkAge();
        } catch (AgeNotValidException ca){
            System.out.println("Не корректный возраст");
            ca.printStackTrace();
        }

        System.out.println();
        try {
            System.out.println("oleg = " + oleg);
            oleg.checkAge();
        } catch (AgeNotValidException ca){
            System.out.println("Не корректный возраст");
            ca.printStackTrace();
        }

    }
}
