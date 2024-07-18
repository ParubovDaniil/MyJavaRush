package Java_Syntax_Pro.L6;

import java.util.Arrays;
import java.util.Scanner;

public class lvl6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            if (N > 0) {
                int[] array = new int[N];
                if (N%2==1) {
                    for (int i = 0; i < array.length; i++) {
                        array[i] = scanner.nextInt();
                    }
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                }
                if (N%2==0) {
                    for (int i = array.length-1; i >=0; i--) {
                        array[i] = scanner.nextInt();
                    }
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                }

            }
        }
    }
/*
*
Тебе нужно написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
Требования:
•	Программа должна считывать число N и за ним еще N чисел.
•	В классе должен быть метод public static void main(String[]).
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
•	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.*/