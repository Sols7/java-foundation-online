package ru.itsjava.collection.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
//        Man andrey = new Man("Andrey");
//        Man maxim = new Man("Maxim");
//        Man victor = new Man("Victor");
//
//        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, victor));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));
//        System.out.println("manSet = " + manSet);
//
//        Man andrey2 = new Man("Andrey");
//        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));
//        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));
//        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
//        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.size() = " + manSet.size());

        Fruit apple = new Fruit("Apple", 2.0);
        Fruit orange = new Fruit("Orange", 3.5);
        Fruit banana = new Fruit("Banana", 1.0);
        Fruit lemon = new Fruit("Lemon", 0.5);
        Fruit mango = new Fruit("Mango", 2.0);

        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(apple, orange, banana, lemon));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.add(mango) = " + fruitSet.add(mango));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.add(mango) = " + fruitSet.add(mango));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.remove(banana) = " + fruitSet.remove(banana));

        System.out.println("fruitSet.contains(banana) = " + fruitSet.contains(banana));
        System.out.println("fruitSet.contains(lemon) = " + fruitSet.contains(lemon));
        System.out.println("fruitSet = " + fruitSet);

    }
}
