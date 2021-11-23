package ru.itsjava.collection.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Vitaliy", 10000.0);
        Watch gShock = new Watch("GSHOCK", "Best dancer", 100000.0);

        watchesList.add(seiko);
        watchesList.add(gShock);

        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }

//        watchesList.remove(0);
        watchesList.remove(seiko);

        System.out.println("List: ");
        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch + " ");
        }
        System.out.println();


        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));

        System.out.println("watchesList = " + watchesList);

        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());

        watchesList.set(0, seiko);

        System.out.println(watchesList);

        System.out.println("watchesList.size() = " + watchesList.size());


        List<Watch> watchesOmegaList = new ArrayList<>();
        Watch andrewOmega = new Watch("Omega", "Andrew", 100_000.0);
        Watch romanOmega = new Watch("Omega", "Roman", 100_000.0);

        watchesOmegaList.add(andrewOmega);
        watchesOmegaList.add(romanOmega);

        System.out.println("watchesOmegaList = " + watchesOmegaList);

        watchesList.addAll(watchesOmegaList);

        System.out.println("watchesList = " + watchesList);

        Watch sergeyWatch = new Watch("Garmin", "Sergey", 40_000.0);

        watchesList.add(1, sergeyWatch);

        System.out.println("watchesList = " + watchesList);
    }
}
