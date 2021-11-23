package ru.itsjava.collection.lists.listsBookHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String name;
    private final String author;
    private int numberOfPages;

    @Override
    public String toString() {
        return "Book{'" + name + "', '" + author + "', " + numberOfPages + "};";
    }
}
