package Java_Syntax_Pro.L6;

import java.util.Scanner;
/*
Максимальное из N чисел
*/
public class lvl6_7 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        int max = array[0];

        for (int i = 1; i < N; i++) {
            if (array[i] > max)

                max = array[i];
        }
        System.out.println(max);
    }
}



/*
*
В этой задаче тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
Требования:
•	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
*/