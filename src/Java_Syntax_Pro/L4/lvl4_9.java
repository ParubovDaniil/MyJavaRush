package Java_Syntax_Pro.L4;
import java.util.Scanner;
/*
Максимум из введенных чисел
*/
public class lvl4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        int i = 0;
        boolean b = true;
        while (b) {
            while (sc.hasNextInt()) {
                i = sc.nextInt();
                if ((i > max && i % 2 == 0)) {
                    max = i;
                }
            }
            if (i == max || max > i) {
                System.out.print(max);
            break;
            } else {
                b = false;
                System.out.print(min);
            }
        }
    }
}
/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.
Пример ввода:
8
9
8
4
5
e

Пример вывода:
8
Требования:
•	Программа должна считывать числа c клавиатуры.+
•	Программа должна выводить число на экран.+
•	Программа должна выводить на экран максимальное четное из введенных целых чисел.+
•	Если введено несколько максимальных четных чисел, необходимо вывести любое.+
•	Если среди введенных символов нет четного числа или введен только один не числовой символ, то вывести на экран минимальное значение числа типа int.
•	Считывать данные с клавиатуры необходимо в цикле while.
* */