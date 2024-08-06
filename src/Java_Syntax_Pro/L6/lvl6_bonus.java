package Java_Syntax_Pro.L6;

import java.util.Arrays;
import java.util.Scanner;

public class lvl6_bonus {
    public static int array[][][] = {{{2,2},{2,2}},{{2,2},{2,2}}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length ; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
            }
        }
    }
}
/*
* Бонусное задание — написать код, который выводит на экран все значения трехмерного массива.
 */
