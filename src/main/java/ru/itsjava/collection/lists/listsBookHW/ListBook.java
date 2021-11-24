package ru.itsjava.collection.lists.listsBookHW;

import ru.itsjava.collection.lists.Watch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListBook {

    public static void main(String[] args) {

//        List<Book> bookList0 = new ArrayList<>();
//        System.out.println("bookList = " + bookList0);

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

        // Практика 2

        Book javaBook1 = new Book("Java", "Author1", 125);
        Book javaBook2 = new Book("Java", "Author2", 105);
        Book javaBook3 = new Book("Java", "Author3", 96);
        Book javaBook4 = new Book("Java", "Author4", 1025);

        bookList.add(1, javaBook1);
        bookList.add(5, javaBook2);
        bookList.add(3, javaBook3);
        bookList.add(2, javaBook4);

        System.out.println();
        System.out.println("книги с индексом, который делится на 3: ");
        for (int i = 0; i < bookList.size(); i++) {
            if (i % 3 == 0) {
                System.out.println(bookList.get(i));
            }
        }
        System.out.println();

        System.out.print("Колличество книг с названием Java:");
        int numOfBook = 0;
        for (Book book : bookList) {
            if (book.getName().equals("Java")) {
                numOfBook++;
            }
        }
        System.out.println(numOfBook);

        System.out.println();
        System.out.println("Пропустить первые 3 книги в списке");
        for (int i = 3; i < bookList.size(); i++) {
            System.out.print(bookList.get(i));
        }
        System.out.println();

        System.out.println();
        System.out.println("Пропустить первые 2 книги, которые равные \"Java\"");
        int bookCount = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().equals("Java") && bookCount < 2) {
                bookCount++;
            } else {
                System.out.print(bookList.get(i));
            }
        }
        System.out.println();

        System.out.print("Первая книга, длина автора которого делится на 3");
        for (Book book : bookList) {
            if (book.getAuthor().length() % 3 == 0) {
                System.out.println(book);
                break;
            }
        }

        System.out.print("Все книги, длина автора которых делится на 3");
        for (Book book : bookList) {
            if (book.getAuthor().length() % 3 == 0) {
                System.out.print(book);
            }
        }
        System.out.println();


        Person nikolay = new Person("Nikolay", 22, true);
        Person sergey = new Person("Sergey", 31, true);
        Person olga = new Person("Olga", 18, false);
        Person nazar = new Person("Nazar", 12, true);
        Person elena = new Person("Elena", 14, false);

        List<Person> personList = new ArrayList<>(Arrays.asList(nikolay, sergey, olga, nazar, elena));
        System.out.println("personList = " + personList);

        System.out.println("Призывники с именем на букву Н:");
        for (Person person : personList) {
            if (person.isMale() && (person.getAge() < 27) && (person.getAge() >= 18) && person.getName().startsWith("N")) {
                System.out.print(person + " ");
            }
        }
        System.out.println();

        System.out.print("Средний возраст всех женщин: ");
        int countWoman = 0;
        int sumAge = 0;
        for (Person person : personList) {
            if (!person.isMale()) {
                sumAge += person.getAge();
                countWoman++;
            }
        }
        System.out.println(sumAge / countWoman);

    }
}
