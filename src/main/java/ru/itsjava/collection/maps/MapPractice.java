package ru.itsjava.collection.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
//        Map<Man, String> men = new HashMap<>();
//        Man ivanov = new Man("Иванов");
//        Man sidorov = new Man("Сидоров");
//        Man javov = new Man("Джавов");
//
//        men.put(ivanov, "футболка");
//        men.put(sidorov, "свитшот");
//        men.put(javov, "свитер");
//
//        for (Map.Entry<Man, String> pair : men.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
//
//        System.out.println("--------------");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }
//
//        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
//        System.out.println("After delete Ivanov");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }
//
//        System.out.println("men.size() = " + men.size());
//        System.out.println("men.isEmpty() = " + men.isEmpty());
//
//        System.out.println("men.replace(javov, \"свитер\", \"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
//        System.out.println(men.get(javov));
//
//        men.clear();
//        System.out.println("men.size() = " + men.size());

        Map<Man, Fruit> buyers = new HashMap<>();
        Map<Man, Fruit> newBuyers = new HashMap<>();

        Man ivanov = new Man("Иванов");
        Man petrov = new Man("Петров");
        Man sidorov = new Man("Сидоров");
        Man smirnov = new Man("Смирнов");
        Man javov = new Man("Джавов");

        Fruit apple = new Fruit("Apple", 2.0);
        Fruit orange = new Fruit("Orange", 3.5);
        Fruit banana = new Fruit("Banana", 1.0);
        Fruit lemon = new Fruit("Lemon", 0.5);
        Fruit mango = new Fruit("Mango", 2.0);

        buyers.put(ivanov, apple);
        buyers.put(petrov, orange);
        buyers.put(sidorov, banana);
        buyers.put(smirnov, lemon);
        buyers.put(javov, mango);

        for (Man keyMan : buyers.keySet()) {
            System.out.println(keyMan + ": " + buyers.get(keyMan));
        }

        newBuyers.putAll(buyers);
        System.out.println("______________________");
        for (Man keyMan : newBuyers.keySet()) {
            System.out.println(keyMan + ": " + newBuyers.get(keyMan));
        }

        System.out.println("buyers.get(ivanov) = " + buyers.get(ivanov));

        System.out.println("buyers.remove(ivanov) = " + buyers.remove(ivanov));

        System.out.println("buyers.containsValue(banana) = " + buyers.containsValue(banana));
        System.out.println("buyers.containsValue(apple) = " + buyers.containsValue(apple));

        System.out.println("Все покупатели:");
        for (Man keyMan : buyers.keySet()) {
            System.out.println(keyMan);
        }

        System.out.println("Все фрукты:");
        for (Man keyMan : buyers.keySet()) {
            System.out.println(buyers.get(keyMan));
        }

        System.out.println("Все покупатели и фрукты:");
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        //Обход коллекций

        System.out.print("количество ключей длина которых больше 5: ");
        int count = 0;
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            if (pair.getKey().getName().length() > 5) {
                count++;
            }
        }
        System.out.println(count);

        System.out.print("количество элементов, которые равны \"Lemon\": ");
        int countFruit = 0;
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("Lemon")) {
                countFruit++;
            }
        }
        System.out.println(countFruit);

        System.out.println("Пропустить 2 элемента, значения которых Orange, все остальные вывести: ");
        int countOrange = 0;
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("Orange") && countOrange < 2) {
                countOrange++;
            } else {
                System.out.println(pair.getValue());
            }
        }

        System.out.println("Вывести все кроме 2 элементов, ключи которых начинаются на C: ");
        int countElemBeginC = 0;
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            if (pair.getKey().getName().startsWith("С") && countElemBeginC < 2) {
                countElemBeginC++;
            } else {
                System.out.println(pair.getKey());
            }
        }

        System.out.println("Возвращаем элемент значение которого Orange или OrAnge или ORANGE: ");
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            if (pair.getValue().getName().equals("Orange") || pair.getValue().getName().equals("OrAnge") ||
                    pair.getValue().getName().equals("ORANGE")) {
                System.out.println(pair.getValue());
                break;
            }
        }

        System.out.println("Возвращаем все элементы в другую карту, которые являются Apple или Lemon: ");
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            if (pair.getValue().getName().equals("Apple") || pair.getValue().getName().equals("Lemon")) {
                newBuyers.put(pair.getKey(), pair.getValue());
            }
        }
        for (Map.Entry<Man, Fruit> pair : newBuyers.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.print("средний вес всех фруктов: ");
        int countWeight = 0;
        double sumWeight = 0.0;
        for (Map.Entry<Man, Fruit> pair : buyers.entrySet()) {
            sumWeight += pair.getValue().getWeight();
            countWeight++;
        }
        System.out.println(sumWeight/countWeight + " кг");

    }
}
