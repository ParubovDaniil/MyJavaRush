package Java_Syntax_Pro.L4;

import java.util.Scanner;

/*
Суммирование
*/
public class lvl4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        while (!isExit) {
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                int summ = sum +i;
                sum = summ;
            }
            else if (sc.hasNextLine()) {
                String str = sc.nextLine();
                isExit = str.equalsIgnoreCase("enter");
            }

        }
        System.out.println(sum);//напишите тут ваш код
    }

}



/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.

Требования:
•	Программа должна считывать данные c клавиатуры.
•	Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
•	В программе необходимо использовать цикл while.
*/