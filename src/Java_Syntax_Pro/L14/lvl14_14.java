package Java_Syntax_Pro.L14;

public class lvl14_14 {
}

class Solution14 {
    public static void main(String[] args) {
        StringLinkedListG stringLinkedList = new StringLinkedListG();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");

        System.out.println(stringLinkedList.get(0)); // должно вывести "1"
        System.out.println(stringLinkedList.get(2)); // должно вывести "3"
        System.out.println(stringLinkedList.get(4)); // должно вывести "5"
        System.out.println(stringLinkedList.get(5)); // должно вывести null
    }
}

 class StringLinkedListG {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedListG() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        Node current = first.next;
        int i = 0;
        while (current != last) {
        if (i==index){
            return current.value;
        }
        else current = current.next;
        i++;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
/*
* StringLinkedList, часть 2
Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
Мы реализовали метод add, который добавляет элементы в конец списка. Тебе нужно реализовать метод get(int),
который вернет строку под индексом, переданным в метод. Если строки с таким индексом нет, нужно вернуть null.
Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.

Требования:
•	Метод get(int index) должен возвращать элемент, который находится под индексом index в списке.*/