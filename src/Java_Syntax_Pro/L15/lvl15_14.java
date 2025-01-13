package Java_Syntax_Pro.L15;

import java.util.LinkedList;
import java.util.List;
public class lvl15_14 {}

/*
Стек в домашних условиях
*/

class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        //напишите тут ваш код
        int start = storage.size();
        String tmp = s;
        storage.add(0,s);
        }


    public String pop() {
        //напишите тут ваш код
        String tmp = peek();
        storage.remove(tmp);
        return tmp;
    }

    public String peek() {
        //напишите тут ваш код
        return storage.get(0);

    }

    public boolean empty() {
        //напишите тут ваш код
        return storage.isEmpty();

    }

    public int search(String s) {
        //напишите тут ваш код
        return storage.indexOf(s);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Мама");
        myStack.push("Папа");
        myStack.push("Сестра");
        System.out.println(myStack.storage);
        myStack.pop();
        System.out.println(myStack.storage);
        myStack.peek();
        System.out.println(myStack.storage);
        myStack.empty();
        System.out.println(myStack.storage);
        myStack.search("Сестра");
        System.out.println(myStack.storage);

    }
}

/*
* В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе списка.
Все элементы хранятся в приватном списке storage.
Твоя задача реализовать все объявленные методы класса MyStack.
Где метод push(String) добавляет элемент в начало списка storage.
Метод pop() возвращает первый элемент списка storage, а потом удаляет его из этого списка.
Метод peek() возвращает первый элемент списка storage.
Метод empty() проверяет, не пустой ли список storage.
Метод search(String) ищет элемент в списке storage и возвращает его индекс. Если элемента нет в списке — возвращает -1.

Требования:
•	Метод push(String) должен быть реализован согласно условию.
•	Метод pop() должен быть реализован согласно условию.
•	Метод peek() должен быть реализован согласно условию.
•	Метод empty() должен быть реализован согласно условию.
•	Метод search(String) должен быть реализован согласно условию.*/