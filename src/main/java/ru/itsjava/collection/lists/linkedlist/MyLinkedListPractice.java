package ru.itsjava.collection.lists.linkedlist;

public class MyLinkedListPractice {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        System.out.println("list.isEmpty() = " + list.isEmpty());
        list.add("Строка_1");
        System.out.println("list = " + list);

        list.add("Строка_2");
        System.out.println("list = " + list);

        list.add("Строка_3");
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());

        System.out.println("list.isEmpty() = " + list.isEmpty());

        System.out.println("list.contains(\"Строка_2\") = " + list.contains("Строка_2"));
        System.out.println("list.contains(\"Строка_3\") = " + list.contains("Строка_3"));
        System.out.println("list.contains(\"Строка_5\") = " + list.contains("Строка_5"));
    }
}
