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

//        System.out.println("list.size() = " + list.size());
//
//        System.out.println("list.isEmpty() = " + list.isEmpty());
//
//        System.out.println("list.contains(\"Строка_2\") = " + list.contains("Строка_2"));
//        System.out.println("list.contains(\"Строка_3\") = " + list.contains("Строка_3"));
//        System.out.println("list.contains(\"Строка_5\") = " + list.contains("Строка_5"));

//        list.remove(2);
//        System.out.println("list = " + list);

//        list.clear();
//        System.out.println("list = " + list);
//        System.out.println("list.isEmpty() = " + list.isEmpty());

//        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("list.get(1) = " + list.get(1));
//        System.out.println("list.get(2) = " + list.get(2));

//        list.set(2, "СТРОКА");
//        System.out.println("list = " + list);

//        System.out.println("list.remove(\"Строка_4\") = " + list.remove("Строка_4"));
//        System.out.println("list = " + list);

        list.add("Строка_1");
        System.out.println("list = " + list);
        System.out.println("list.indexOf(\"Строка_1\") = " + list.indexOf("Строка_1"));
        System.out.println("list.indexOf(\"Строка_2\") = " + list.indexOf("Строка_2"));
        System.out.println("list.indexOf(\"Строка_3\") = " + list.indexOf("Строка_3"));
//        System.out.println("list.indexOf(\"Строка_4\") = " + list.indexOf("Строка_4"));

        System.out.println("list.lastIndexOf(\"Строка_1\") = " + list.lastIndexOf("Строка_1"));
        System.out.println("list.lastIndexOf(\"Строка_2\") = " + list.lastIndexOf("Строка_2"));

    }
}
