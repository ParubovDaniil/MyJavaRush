package Java_Syntax_Pro.L4;

import java.util.Scanner;

public class lvl4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int secondmin = 0;
        boolean b = true;
        while (b) {
            int count = 0;
            while (count < 2 && sc.hasNextInt()) {
                int i1 = sc.nextInt();
                int i2 = sc.nextInt();
                count = +2;
                if (i1 >= i2) {
                    min = i2;
                    secondmin = i1;
                } else {
                    min = i1;
                    secondmin = i2;
                }
            }
            count = 4;
            while (count > 3 && sc.hasNextInt()) {
                int i3 = sc.nextInt();
                if (i3 > min && i3 < secondmin) {
                    secondmin = i3;
                } else if (i3 < min) {
                    secondmin = min;
                    min = i3;
                }
                else if ( min == secondmin && i3 > secondmin){
                    secondmin = i3;
                }

            }
            b = false;
            System.out.print(secondmin);
        }
    }
}

/*
В этой задаче нужно:
Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
Пример ввода:
8
4 // минимальное число
7
4 // минимальное число
5 // второе по величине число (второе минимальное)
9
5 // второе по величине число (второе минимальное)
exit
Пример вывода:
5
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран второе минимальное из введенных целых чисел.
•	Если введено несколько вторых минимальных чисел, необходимо вывести любое.
•	Считывать данные с клавиатуры необходимо в цикле while.
* */