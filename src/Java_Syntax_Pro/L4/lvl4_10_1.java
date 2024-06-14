package Java_Syntax_Pro.L4;

import java.util.Scanner;

public class lvl4_10_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int tmp = console.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp > min && tmp < secondMin) {
                secondMin = tmp;
            }
        }

        System.out.println(secondMin);
    }
}
//Правильное решение задачи 4_10 по логике JavaRush