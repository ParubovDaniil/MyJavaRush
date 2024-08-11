package Java_Syntax_Pro.L7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lvl7_5 {
    /*
 Правильный порядок
 */
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int alsoArray[] = Arrays.copyOf(array, array.length);
        int NEW = 0;
        for (int i = alsoArray.length-1; i >= 0; i--) {
        array[NEW]=alsoArray[i];
        NEW++;
        }
        //System.out.println(Arrays.toString(alsoArray));
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
/*
*
Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
Метод должен работать только с массивами целочисленных значений (int[]).

Пример:
Если массив содержал элементы:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
то после вызова метода reverseArray() должен содержать:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1

Требования:
•	Метод reverseArray() должен менять порядок элементов массива на обратный.*/