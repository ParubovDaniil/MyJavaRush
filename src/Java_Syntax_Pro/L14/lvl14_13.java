package Java_Syntax_Pro.L14;
/*
StringLinkedList
*/

public class lvl14_13 {
}

class Solution13 {
    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();
    }
}

class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();
    public StringLinkedList() {
        first.next = last; // соединяем первый и последний узлы
        last.prev = first; // соединяем последний узел с первым
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node n = new Node(value); // Передаём значение

        if (first.next == last) {
            first.next = n;
            n.prev = first;
            n.next = last;
            last.prev = n;
        } else {
            Node currentLast = last.prev;
            currentLast.next = n;
            n.prev = currentLast;
            n.next = last;
            last.prev = n;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;

        // Добавь конструктор для удобства инициализации
        public Node(String value) {
            this.value = value;
        }

        public Node() {
            // пустой узел
        }
    }
}
/*
Пришло время познакомиться с двусвязным списком.
Решая эту задачу ты поймешь, как работает двусвязный список и сможешь добавлять в него элементы.
У тебя есть класс StringLinkedList, в котором есть поля first и last, указывающие на первый и последний элемент соответственно.
Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.

Подсказки:
Для правильной реализации важно понимать, что по списку можно проходить как с первого элемента до последнего,
так и наоборот, поэтому при добавлении новых элементов не забудь менять ссылки рядом стоящих.
Метод add должен создавать новый объект класса Node, в который он поместит переданное значение.
Перед тем как добавлять новую ноду, нужно изменить ссылку последней ноды на новосозданную, а новосозданная станет последней.
Если в списке один элемент, то на него указывает first.next и last.prev одновременно.
Метод printAll создан для debug и в проверке не участвует.
Важно:
Node first не должна иметь значение, она указывает только на первый элемент(first.next);
Node last также не содержит значения, а только указывает на последний элемент(last.prev).

Требования:
•	При добавлении нового элемента предыдущие элементы должны получать на него ссылку.
•	При добавлении нового элемента он должен получать ссылку на предыдущий.
•	Поле first класса StringLinkedList должно всегда ссылаться на первый элемент, не содержать значение (value) и ссылку на предыдущий элемент (prev).
•	Поле last класса StringLinkedList должно всегда ссылаться на последний элемент, не содержать значение (value) и ссылку на следующий элемент (next).
*/
///////////////Победила меня задача LinkedList не понял вообще решения с огромным количеством подсказок