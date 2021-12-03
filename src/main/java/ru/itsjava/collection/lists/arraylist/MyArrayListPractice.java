package ru.itsjava.collection.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
//        MyArrayList list = new MyArrayList();
//        System.out.println(list.size());
//        System.out.println("list.isEmpty() = " + list.isEmpty());
//        list.add("Привет");
//        list.add("Пока");
//        System.out.println("После добавления двух элементов размер равен " + list.size());
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        System.out.println("list.size() = " + list.size());
//
//        System.out.println(list);
//
////        System.out.println("list.isEmpty() = " + list.isEmpty());
////
////        System.out.println("list.contains(\"Привет\") = " + list.contains("Привет"));
////        System.out.println("list.contains(\"Privet\") = " + list.contains("Privet"));
////
////        list.clear();
////        System.out.println(list);
////        System.out.println("list.size() = " + list.size());
////        System.out.println("list.isEmpty() = " + list.isEmpty());
//
//        System.out.println("list.remove(\"Привет\") = " + list.remove("Привет"));
//        System.out.println("list.size() = " + list.size());
//        System.out.println(list);
//
//        System.out.println("list.remove(\"Пока\") = " + list.remove("Пока"));
//        System.out.println("list.size() = " + list.size());
//        System.out.println(list);
//
//        list.add("До_свидания");
//        System.out.println(list);
//        list.remove(9);
//        System.out.println(list);

        MyArrayList list = new MyArrayList();
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        System.out.println(list);

//        list.remove(1);
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);

//        list.remove("element1");
//        System.out.println(list);
//
//        list.remove("element3");
//        System.out.println(list);

        System.out.println("list.get(1) = " + list.get(1));

        list.set(0, "setElement");
        System.out.println(list);

        list.add(3, "addElement");

        list.add(1, "addElement");
        System.out.println(list);

        System.out.println("list.indexOf(\"addElement\") = " + list.indexOf("addElement"));
        System.out.println("list.indexOf(\"setElement\") = " + list.indexOf("setElement"));
        System.out.println("list.indexOf(\"element4\") = " + list.indexOf("element4"));

        System.out.println("list.lastIndexOf(\"addElement\") = " + list.lastIndexOf("addElement"));
        System.out.println("list.lastIndexOf(\"element4\") = " + list.lastIndexOf("element4"));
        System.out.println("list.lastIndexOf(\"setElement\") = " + list.lastIndexOf("setElement"));

//        System.out.println("list.indexOf(\"elem\") = " + list.indexOf("elem"));
//        System.out.println("list.lastIndexOf(\"elem\") = " + list.lastIndexOf("elem"));
    }
}
