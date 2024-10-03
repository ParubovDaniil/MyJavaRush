package Java_Syntax_Pro.L13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lvl13_12 {}

class Solution12 {

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
/*
Создаем свой список
*/

class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
    capacity = (int)(capacity*1.5);
    String []noviy = new String[capacity];
    System.arraycopy(elements,0,noviy,0,size);
    elements = noviy;
    }
}
/*
* ArrayList — это список, который хранит динамически расширяемый массив элементов.
Сейчас мы будем реализовывать свою версию списка, в котором хранятся строки.
В классе CustomStringArrayList есть три поля:

String[] elements — это массив текущих элементов (в похожем массиве хранит значения ArrayList). Изначально его размер равен 10 (capacity = 10).
int size — в нем хранится количество заполненных элементов, начальное значение — 0.
int capacity — вместимость в текущем массиве (elements) данных, которая будет увеличиваться по ходу добавления данных.
Для простоты реализации у нас будут только два метода:

Публичный метод add(String), добавляющий элементы в массив, с помощью которого мы сможем увидеть, как массив динамически расширяется.
Когда массив заполнен (size == capacity), вызывается метод grow() для расширения массива.
Приватный метод grow(), который должен присвоить полю elements новый массив вместимостью (capacity) в полтора раза больше,
чем у старого массива и скопировать данные из старого массива в новый в том же порядке. Поле capacity должно увеличиться точно так же, как и размер массива.
Требования:
•	В классе CustomStringArrayList должны быть не статические приватные поля int size, int capacity, String[] elements.
•	В классе CustomStringArrayList должен быть конструктор без параметров, который инициализирует поле size значением 0, поле capacity — значением 10, поле elements — новым массивом с размером capacity.
•	В классе CustomStringArrayList должен быть метод public void add(String).
•	В классе CustomStringArrayList должен быть метод private void grow().
•	Метод grow() должен работать согласно условию.
•	Метод add(String) изменять нельзя*/