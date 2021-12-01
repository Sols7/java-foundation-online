package ru.itsjava.collection.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        list.add("Привет");
        list.add("Пока");
        System.out.println("После добавления двух элементов размер равен " + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());

        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());

        System.out.println("list.contains(\"Привет\") = " + list.contains("Привет"));
        System.out.println("list.contains(\"Privet\") = " + list.contains("Privet"));

        list.clear();
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
    }
}
