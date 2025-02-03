package Java_Syntax_Pro.L19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Прощание с лямбда-выражением
*/

public class lvl19_5 {
}

class Solution5 {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
    //напишите тут ваш код

}


/*
Перед тобой программа, которая сортирует список строк по их длине по возрастанию.
Это делает метод sortStringsByLength(ArrayList<String>).
Для сортировки строк используется метод Collections.sort(ArrayList<String>, Comparator<String>),
который принимает список строк и компаратор в виде лямбда-выражения.

Твоя задача — переписать реализацию метода sortStringsByLength(ArrayList<String>),
чтобы вместо лямбда-выражения использовался класс StringComparator,
который реализует интерфейс Comparator<String>, не меняя логику работы метода sortStringsByLength(ArrayList<String>).

То есть нужно, чтобы в классе StringComparator метод int compare(String s1, String s2) возвращал числовое значение согласно этим условиям:

отрицательное число, если длина строки s1 меньше длины строки s2;
положительное число, если длина строки s1 больше длины строки s2;
0, если длины строк s1 и s2 одинаковы.
Метод main() не принимает участие в тестировании.

Требования:
•	В отдельном файле нужно создать публичный класс StringComparator, который реализует интерфейс Comparator<String>.
•	В классе StringComparator нужно создать публичный метод int compare(String s1, String s2).
•	Метод compare(String s1, String s2) нужно реализовать согласно условию.
•	В методе sortStringsByLength(ArrayList<String>) нужно сортировать список строк по возрастанию их длины.
•	В методе sortStringsByLength(ArrayList<String>) для сортировки списка строк по возрастанию их длины нужно использовать собственный компаратор (объект типа StringComparator).*/