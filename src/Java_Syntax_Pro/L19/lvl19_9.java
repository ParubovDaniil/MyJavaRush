package Java_Syntax_Pro.L19;

import java.util.ArrayList;
import java.util.Collections;

/*
Прощание со ссылками на методы
*/
public class lvl19_9 {}


class Solution9 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(s -> System.out.println(s));
    }
}
/*
В классе Solution публичный метод print(ArrayList<Integer>) выводит в консоли все элементы списка по порядку.

Сейчас метод реализован с использованием метода списка forEach(),
который принимает ссылку на метод. Необходимо переписать реализацию метода print(ArrayList<Integer>),
чтобы метод списка forEach() вместо ссылки на метод принимал лямбда-выражения.

Метод main() не принимает участие в тестировании.

Требования:
•	В методе print(ArrayList<Integer>) нужно использовать метод списка forEach(), принимающий лямбда-выражения.
•	В методе print(ArrayList<Integer>) нужно выводить в консоли все элементы полученного списка.*/