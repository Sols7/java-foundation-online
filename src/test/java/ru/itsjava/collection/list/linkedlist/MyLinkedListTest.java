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

    @DisplayName(" корректно выполнять метод remove")
    @Test
    public void shouldHaveCorrectMethodRemove() {
        list.add("Строка_1");
        assertEquals(1, list.size());
        list.remove("Строка_1");
        assertEquals(0, list.size());
        assertFalse(list.contains("Строка_1"));
    }

    @DisplayName(" корректно выполнять метод clear")
    @Test
    public void shouldHaveCorrectMethodClear() {
        list.add("Строка_1");
        list.add("Строка_2");
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @DisplayName(" корректно выполнять метод get")
    @Test
    public void shouldHaveCorrectMethodGet() {
        list.add("Строка_1");
        assertEquals("Строка_1", list.get(0));
    }

    @DisplayName(" корректно выполнять метод set")
    @Test
    public void shouldHaveCorrectMethodSet() {
        list.add("Строка_1");
        assertEquals("Строка_SET", list.set(0, "Строка_SET"));
    }

    @DisplayName(" корректно выполнять метод remove по индексу")
    @Test
    public void shouldHaveCorrectMethodRemoveIndex() {
        list.add("Строка_1");
        list.add("Строка_2");
        list.add("Строка_3");
        list.remove(1);
        assertFalse(list.contains("Строка_2"));
        assertEquals(2, list.size());
    }

    @DisplayName(" корректно выполнять метод indexOf")
    @Test
    public void shouldHaveCorrectMethodIndexOf() {
        list.add("Строка_1");
        list.add("Строка_2");
        list.add("Строка_3");
        assertEquals(0, list.indexOf("Строка_1"));
    }

    @DisplayName(" корректно выполнять метод lastIndexOf")
    @Test
    public void shouldHaveCorrectMethodLastIndexOf() {
        list.add("Строка_1");
        list.add("Строка_1");
        list.add("Строка_3");
        assertEquals(1, list.lastIndexOf("Строка_1"));
    }
}
