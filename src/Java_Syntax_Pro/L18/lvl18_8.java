package Java_Syntax_Pro.L18;

public class lvl18_8 {
}

class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        int z = Math.min(a, b);
        return Math.min(z, c);
    }

    public static int min(int a, int b, int c, int d) {
        int z = Math.min(a, b);
        int x = Math.min(c, d);
        return Math.min(z, x);
    }

    public static int min(int a, int b, int c, int d, int e) {
        int z = Math.min(a, b);
        int x = Math.min(c, d);
        int f = Math.min(z, x);
        return Math.min(f, e);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        int z = Math.max(a, b);
        return Math.max(z, c);
    }

    public static int max(int a, int b, int c, int d) {
        int z = Math.max(a, b);
        int x = Math.max(c, d);
        return Math.max(z, x);
    }

    public static int max(int a, int b, int c, int d, int e) {
        int z = Math.max(a, b);
        int x = Math.max(c, d);
        int f = Math.max(z, x);
        return Math.max(f, e);
    }
}
/*
В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(),
которые в качестве аргументов принимают целочисленные (тип int) значения и возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.

Требования:
•	В классе MinMaxUtil должно быть создано 4 перегруженных метода min() в соответствии с условием задания.
•	В классе MinMaxUtil должно быть создано 4 перегруженных метода max() в соответствии с условием задания.
•	Методы min() должны возвращать минимальное из переданных чисел.
•	Методы max() должны возвращать максимальное из переданных чисел.*/