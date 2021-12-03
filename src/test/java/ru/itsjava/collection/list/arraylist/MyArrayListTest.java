package ru.itsjava.collection.list.arraylist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collection.lists.arraylist.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс MyArrayList должен: ")
public class MyArrayListTest {
    MyArrayList list = new MyArrayList();
    MyArrayList listEmpty = new MyArrayList();

    @DisplayName(" корректно выполнять метод size")
    @Test
    public void shouldHaveCorrectMethodSize() {
        list.add("Element1");
        assertEquals(1, list.size());
    }

    @DisplayName(" корректно выполнять метод isEmpty")
    @Test
    public void shouldHaveCorrectMethodIsEmpty() {
        list.add("Element1");
        assertFalse(list.isEmpty());
        assertTrue(listEmpty.isEmpty());
    }

    @DisplayName(" корректно выполнять метод contains")
    @Test
    public void shouldHaveCorrectMethodContains() {
        list.add("Element1");
        assertFalse(list.contains("Element2"));
        assertTrue(list.contains("Element1"));
    }

    @DisplayName(" корректно выполнять метод add")
    @Test
    public void shouldHaveCorrectMethodAdd() {
        assertEquals(0, list.size());
        list.add("Element1");
        assertEquals(1, list.size());
    }

    @DisplayName(" корректно выполнять метод remove")
    @Test
    public void shouldHaveCorrectMethodRemove() {
        list.add("Element1");
        assertEquals(1, list.size());
        list.remove("Element1");
        assertEquals(0, list.size());
    }

    @DisplayName(" корректно выполнять метод clear")
    @Test
    public void shouldHaveCorrectMethodClear() {
        list.add("Element1");
        list.add("Element2");
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @DisplayName(" корректно выполнять метод get")
    @Test
    public void shouldHaveCorrectMethodGet() {
        list.add("Element1");
        assertEquals("Element1", list.get(0));
    }

    @DisplayName(" корректно выполнять метод set")
    @Test
    public void shouldHaveCorrectMethodSet() {
        list.add("Element1");
        assertEquals("setElement", list.set(0, "setElement"));
    }

    @DisplayName(" корректно выполнять метод add по индексу")
    @Test
    public void shouldHaveCorrectMethodAddIndex() {
        list.add("Element1");
        list.add("Element2");
        list.add(1, "newElement");
        assertEquals("newElement", list.get(1));
    }

    @DisplayName(" корректно выполнять метод remove по индексу")
    @Test
    public void shouldHaveCorrectMethodRemoveIndex() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.remove(1);
//        assertEquals("Element3", list.get(1));
        assertFalse(list.contains("Element2"));
    }

    @DisplayName(" корректно выполнять метод indexOf")
    @Test
    public void shouldHaveCorrectMethodIndexOf() {
        list.add("Element1");
        list.add("Element1");
        list.add("Element3");
        assertEquals(0, list.indexOf("Element1"));
    }

    @DisplayName(" корректно выполнять метод lastIndexOf")
    @Test
    public void shouldHaveCorrectMethodLastIndexOf() {
        list.add("Element1");
        list.add("Element1");
        list.add("Element3");
        assertEquals(1, list.lastIndexOf("Element1"));
    }

    @DisplayName(" корректно выполнять метод toString")
    @Test
    public void shouldHaveCorrectMethodToString() {
        list.add("Element1");
        list.add("Element2");
        assertEquals("MyArrayList{Element1 Element2 }", list.toString());
    }

}
