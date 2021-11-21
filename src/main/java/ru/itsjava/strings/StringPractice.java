package ru.itsjava.strings;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {
//        String name = "Sergey";
//        String copyName = "Sergey";
//        System.out.println("(name == copyName) = " + (name == copyName));
//
//        String constructorName = new String("Sergey");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//
//        String internConstructorName = constructorName.intern();
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));

        String str = "Я строка";

        System.out.println("str.length() = " + str.length()); //определяем длину строки
//        System.out.println("str.isEmpty() = " + str.isEmpty()); //проверяем пустая ли строка
//
//        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА")); //сравнение содержимого строк
//        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = " + str.equalsIgnoreCase("Я строкА")); //сравнение содержимого строк без учета регистра

        String[] strs = str.split(" "); //разделяем строку в массив по пробелу
        System.out.println(strs[0]);
        System.out.println(strs[1]);

        char[] charStrs = str.toCharArray(); //преобразование в массив символов
        System.out.println("Arrays.toString(charStrs) = " + Arrays.toString(charStrs));

        char char3 = str.charAt(3); //возвращаем символ строки с индексом 3
        System.out.println("char3 = " + char3);

        int index1 = str.indexOf("о"); //возвращает индекс первого символа о
        System.out.println("index1 = " + index1);

        int index2 = str.lastIndexOf("р"); //возвращает индекс последнего символа р
        System.out.println("index2 = " + index2);

        String replStr = str.replace("Я", "Ты"); //возвращает строку с изменением (Я на Ты)
        System.out.println("replStr = " + replStr);

        System.out.println("str.toLowerCase() = " + str.toLowerCase()); //преобразование в нижний регистр
        System.out.println("str.toUpperCase() = " + str.toUpperCase()); //фпреобразование в верхний регистр
        System.out.println("str.substring(2,5) = " + str.substring(2, 5)); //возвращает подстроку с 2 по 5 символ

        String str2 = " в лучшей книге";
        String str3 = str.concat(str2); //соединение строк
        System.out.println(str3);

        str2 = str2.trim(); //удаляет пробелы в начале и в конце строки
        System.out.println(str2);

//        for (int i = 0; i < 1_000_000; i++) {
//            str = str + "!";
//        }

//        StringBuilder builderStr = new StringBuilder(str);
//        for (int i = 0; i < 1_000_000; i++) {
//            builderStr.append("!");
//        }
//
//        System.out.println(builderStr.toString());

    }
}
