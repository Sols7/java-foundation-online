package ru.itsjava.collection.lists.listsBookHW;

import java.util.ArrayList;
import java.util.List;

public class ListBook {

    public static void main(String[] args) {

        List<Book> bookList0 = new ArrayList<>();
        System.out.println("bookList = " + bookList0);

        List<Book> bookList = new ArrayList<>(20);
        System.out.println("bookList = " + bookList);

        Book thinkingInJava = new Book("Thinking in Java", "Bruce Eckel", 1168);
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 650);
        Book later = new Book("Later", "Stephen King", 256);
        Book voynaIMir = new Book("Voyna i mir", "Lev Tolstoy", 1300);
        Book idiot = new Book("Idiot", "F. Dostoevskiy", 640);
        Book borodino = new Book("Borodino", "M. Lermontov", 296);
        Book evgeniyOnegin = new Book("Evgeniy Onegin", "A. Pushkin", 224);

        bookList.add(thinkingInJava);
        bookList.add(harryPotter);
        bookList.add(later);
        bookList.add(voynaIMir);
        bookList.add(idiot);
        System.out.println("bookList = " + bookList);

        System.out.println();
        System.out.println("bookList.get(0) = " + bookList.get(0));
        System.out.println("bookList.get(bookList.size()-1) = " + bookList.get(bookList.size() - 1));

        System.out.println();
        bookList.add(2, borodino);
        bookList.add(0, evgeniyOnegin);
        System.out.println("bookList = " + bookList);

        System.out.println();
        List<Book> bookListNew = new ArrayList<>();
        bookListNew.addAll(0, bookList);
        System.out.println("bookListNew = " + bookListNew);

        System.out.println();
        bookList.remove(idiot);
        bookList.remove(3);
        System.out.println("bookList = " + bookList);

        System.out.println();
        System.out.println("bookList.contains(thinkingInJava) = " + bookList.contains(thinkingInJava));
        System.out.println("bookList.contains(idiot) = " + bookList.contains(idiot));

        System.out.println();
        System.out.print("List: [ ");
        for (Book elemBook : bookList) {
            System.out.print(elemBook + " ");
        }
        System.out.println("]");

    }
}
