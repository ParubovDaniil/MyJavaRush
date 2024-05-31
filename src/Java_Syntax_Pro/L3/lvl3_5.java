package Java_Syntax_Pro.L3;

import java.util.Scanner;

/*
Три числа
*/
public class lvl3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        if (i1 == i2 && i2 == i3) System.out.println(i1 + " " + i2 + " " + i3);
        else if (i1 == i2) {
             System.out.println(i1 + " " + i2);
        }
        else if(i2 == i3){
          System.out.println(i2 + " " + i2);}

        else if(i1 == i3) {
            System.out.println(i1 + " " + i3);
        }
        //напишите тут ваш код

    }
}
/*
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2
Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести их на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
 */