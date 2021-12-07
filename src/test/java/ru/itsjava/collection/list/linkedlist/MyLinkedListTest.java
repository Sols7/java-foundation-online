package ru.itsjava.collection.list.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collection.lists.linkedlist.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс MyLinkedList должен: ")
public class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();
    MyLinkedList listEmpty = new MyLinkedList();

    @DisplayName(" корректно выполнять метод size")
    @Test
    public void shouldHaveCorrectMethodSize() {
        list.add("Строка_1");
        list.add("Строка_2");
        assertEquals(2, list.size());
    }

    @DisplayName(" корректно выполнять метод isEmpty")
    @Test
    public void shouldHaveCorrectMethodIsEmpty() {
        list.add("Строка_1");
        assertFalse(list.isEmpty());
        assertTrue(listEmpty.isEmpty());
    }

    @DisplayName(" корректно выполнять метод contains")
    @Test
    public void shouldHaveCorrectMethodContains() {
        list.add("Строка_1");
        list.add("Строка_2");
        assertFalse(list.contains("Строка_3"));
        assertTrue(list.contains("Строка_2"));
    }

    @DisplayName(" корректно выполнять метод add")
    @Test
    public void shouldHaveCorrectMethodAdd() {
        assertEquals(0, list.size());
        list.add("Строка_1");
        assertEquals(1, list.size());
        assertTrue(list.contains("Строка_1"));
    }

}
