package ru.itsjava.collection.lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch victorSeiko = new Watch("Seiko", "Victor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, victorSeiko, dmitriySeiko, valentinOmega));

        System.out.println("Наши часы: " + watches);

        System.out.println("Вывести все часы у который фирма Seiko");
        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();

        System.out.println("Вывести все часы у который цена больше 30_000");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() >= 30000.0) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();

        System.out.println("Вывести одни часы у который цена больше 30_000");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() >= 30000.0) {
                System.out.print(elemWatch + " ");
                break;
            }
        }
        System.out.println();

        System.out.println("Пропустить ервые 2 элемента фирмы Seiko");
        int seikoCount = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }
        }
        System.out.println();
    }
}
