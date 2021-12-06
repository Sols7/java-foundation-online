package ru.itsjava.collection.lists.linkedlist;



public class MyLinkedList {
    private Node head;

    public int size() {
        if (head == null) {
            return 0;
        } else {
            Node curNode = head;
            int result = 1;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                result++;
            }
            return result;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        for (Node curNode = head; curNode != null; curNode = curNode.getNext()){
            if (curNode.getValue().equals(o)) {
                return true;
            }
        }
        return false;

    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
