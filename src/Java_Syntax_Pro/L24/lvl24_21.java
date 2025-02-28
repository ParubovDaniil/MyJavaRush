package Java_Syntax_Pro.L24;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class lvl24_21 {}

/*
Нашествие исключений
*/

class Solution21 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[1];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Object obj = null;
            obj.toString();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            Object obj = new Object();
            String str = (String) obj;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            List<String> list = new ArrayList<>();
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            throw new InterruptedIOException();
        } catch (InterruptedIOException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            throw new SecurityException();
        } catch (SecurityException e) {
            exceptions.add(e);
        }

    }
}
/*
*       exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ClassCastException());
        exceptions.add(new IOException());
        exceptions.add(new InterruptedIOException());
        exceptions.add(new InterruptedException());
        exceptions.add(new SecurityException());*/

/*
*
Заполни список exceptions десятью различными исключениями.
Первое исключение уже реализовано в методе initExceptions.

Требования:
•	Список exceptions должен содержать 10 элементов.
•	Все элементы списка exceptions должны быть исключениями (потомками класса Throwable).
•	Все элементы списка exceptions должны быть уникальны.
•	Метод initExceptions должен быть статическим.*/