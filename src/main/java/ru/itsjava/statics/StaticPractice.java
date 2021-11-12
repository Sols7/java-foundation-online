package ru.itsjava.statics;

public class StaticPractice {

    public static void main(String[] args) {
//        System.out.println("Salary.increaseCoefficient = " + Salary.increaseCoefficient);

        Salary cleanerSalary = new Salary(5_000.0);
        Salary targetSalary = new Salary(10_000.0);

        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        Salary.setIncreaseCoefficient(1.0);

        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        System.out.println("Salary.CEO = " + Salary.CEO);

        Car bentley = new Car("Bentley", "white");
        Car lada = new Car("Lada", "black");

        System.out.println("bentley.getPriceCar() = " + bentley.getPriceCar());
        System.out.println("lada.getPriceCar() = " + lada.getPriceCar());

    }
}
