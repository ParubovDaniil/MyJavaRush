package Java_Syntax_Pro.L6;
import java.util.Arrays;

/*
Выводим двумерные массивы
*/
public class lvl6_13 {
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
/*
* Реализуй метод main(String[]), который выводит массивы strings и ints в консоли c помощью метода Arrays.deepToString(Object[][]).

Требования:
•	В классе Solution должна быть публичная статическая переменная strings типа String[][].
•	В классе Solution должна быть публичная статическая переменная ints типа int[][].
•	В методе main(String[]) выведи в консоли массив strings с помощью метода Arrays.deepToString(Object[][]).
•	В методе main(String[]) выведи в консоли массив ints с помощью метода Arrays.deepToString(Object[][]).*/
