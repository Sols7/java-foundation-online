package ru.itsjava.oop.inheritance;

public class Child implements Father, Mather{
    @Override
    public void giveLove() {
        System.out.println("Child loves you");
    }
}
