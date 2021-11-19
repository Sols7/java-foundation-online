package ru.itsjava.interfaces;

public class interfacesPractice {

    public static void main(String[] args) {
        Creatable khotabich = new Gin();
        khotabich.createWish();

        Creatable badGin = new BadGin();
        badGin.createWish();

        khotabich.canYouCreateWish();
        badGin.canYouCreateWish();

        //HomeWork
//        System.out.println();
//
//        Walkable manWalk = new Man();
//        manWalk.walk();
//
//        Walkable catWalk = new Cat();
//        catWalk.walk();
//
//        Walkable birdWalk = new Bird();
//        birdWalk.walk();
//
//        Swimable manSwim = new Man();
//        manSwim.swim();
//        System.out.println("manSwim.maxSwimSpeed() = " + manSwim.maxSwimSpeed());
//
//        Swimable dogSwim = new Dog();
//        dogSwim.swim();
//        System.out.println("dogSwim.maxSwimSpeed() = " + dogSwim.maxSwimSpeed());
//
//        Swimable fish = new Fish();
//        fish.swim();
//        fish.maxSwimSpeed();
//
//        Runnable manRun = new Man();
//        manRun.run();
//        System.out.println("manRun.maxRunDistance() = " + manRun.maxRunDistance());
//
//        Runnable dogRun = new Dog();
//        dogRun.run();
//        System.out.println("dogRun.maxRunDistance() = " + dogRun.maxRunDistance());
//
//        Runnable catRun = new Cat();
//        catRun.run();
//        System.out.println("catRun.maxRunDistance() = " + catRun.maxRunDistance());
//
//        Flyable birdFly = new Bird();
//        birdFly.fly();
//        System.out.println("birdFly.flyMaxDistance() = " + birdFly.flyMaxDistance());

    }
}
