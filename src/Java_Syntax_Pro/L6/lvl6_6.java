package Java_Syntax_Pro.L6;
import java.util.Scanner;

/*
Минимальное из N чисел
*/
public class lvl6_6 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < N; i++) {
            if (array[i] < min)

                min = array[i];
        }
        System.out.println(min);
    }
}
/*
*
Чтобы выполнить эту задачу, тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
Требования:
•	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
•	В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
* */
