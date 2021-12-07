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
        for (Node curNode = head; curNode != null; curNode = curNode.getNext()) {
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
        if (head == null) return false;                     //возвращаем false если список пустой
        if (head.getValue().equals(o)) {                    //сравниваем head с удаляемым объектом
            head = head.getNext();                          //меняем head на следующий элемент
            return true;                                    //возвращаем true
        }
        if (head.getNext() == null) return false;           //возвращаем false если после head нет элемента
        Node curNode = head;                                //определяе элемент, который будем удалять
        Node prevNode = head;                               //определем предидущий элемен для замены ссылки

        while ((curNode = curNode.getNext()) != null) {     //бежим по списку для поиска удаляемого элемента
            if (curNode.getValue().equals(o)) {             //проверяем на равенство текущий элемент с удаляемым
                break;                                      //выходим из цикла - элемент для удаления определен
            }
            prevNode = prevNode.getNext();                  //переопределяем prevNode
        }

        if (curNode == null) return false;                  //возвращаем false если curNode равен null

        prevNode.setNext(curNode.getNext());                //переопрелеляем ссылку предидущего элемента на следующий после удаляемого
        curNode.setNext(null);                              //удаляем ссылку у текущего элемента
        return true;                                        //возвращаем true
    }

    public void clear() {
        Node curNode = head;
        while ((curNode = curNode.getNext()) != null) {
            curNode.setNext(null);
        }
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        Node curNode = head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node curNode = head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        curNode.setValue(element);
        return curNode.getValue();
    }

    public void add(int index, Object element) {

    }

    //СТРОКА1 -> null
    //СТРОКА1 -> СТРОКА2 -> СТРОКА3-> null
    public Object remove(int index) {
        checkIndex(index);                                  //проверяем корректность индекса
        if (index == 0) {                                   //если индекс равен 0
            Object resValue = head.getValue();              //создаем объект, чтобы вернуть значение
            if (head.getNext() == null) {                   //проверяем есть ли в списке ещё элементы
                head = null;                                //удаляем элемент
            } else {
                head = head.getNext();                      //переопределяем head на следующий элемент
            }
            return resValue;                                //возвращаем удаленный элемент
        }
        Node curNode = head;                                //определяе элемент, который будем удалять
        Node prevNode = head;                               //определем предидущий элемен для замены ссылки
        int count = 0;                                      //определяем переменную(индекс) для поиска удаляемого элемента
        while ((curNode = curNode.getNext()) != null) {     //бежим по списку для поиска удаляемого элемента
            count++;                                        //увеличиваем текущий индекс
            if (count == index) {                           //проверяем на равенство текущий индекс с  индексом удамяемого элемента
                break;                                      //выходим из цикла - элемент для удаления определен
            }
            prevNode = prevNode.getNext();                  //переопределяем prevNode
        }
        if (curNode == null) return null;
        Object resValue = curNode.getValue();               //создаем объект, чтобы вернуть значение
        if (curNode.getNext() == null) {                    //проверяем является ли удаляемый элемен последим в списке
            prevNode.setNext(null);                         //удаляем ссылку у предидущего элемента
        } else {
            prevNode.setNext(curNode.getNext());            //переопрелеляем ссылку предидущего элемента на следующий после удаляемого
            curNode.setNext(null);                          //удаляем ссылку у текущего элемента
        }
        return resValue;                                    //возвращаем удаленный элемент
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        Node curNode = head;
        int index = -1;
        int count = 0;
        while (curNode != null) {
            if (curNode.getValue().equals(o)) {
                index = count;
                break;
            }
            curNode = curNode.getNext();
            count++;
        }
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Элемент " + o + " не найден");
        }
        return index;
    }

    public int lastIndexOf(Object o) {
        Node curNode = head;
        int index = -1;
        int count = 0;
        while (curNode != null) {
            if (curNode.getValue().equals(o)) {
                index = count;
            }
            curNode = curNode.getNext();
            count++;
        }
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Элемент " + o + " не найден");
        }
        return index;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
