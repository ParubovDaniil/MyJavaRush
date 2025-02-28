package Java_Syntax_Pro.L24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class lvl24_22 {}

/*
НОД
*/

class Solution22 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 1; // НОД всегда как минимум 1

        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i; // Обновляем НОД, если нашли больший общий делитель
            }
        }

        return gcd;
    }
}
/*
*
Давай найдем наибольший общий делитель (НОД). Для этого:

Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.
Требования:
•	Программа должна считывать с клавиатуры 2 строки.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.*/