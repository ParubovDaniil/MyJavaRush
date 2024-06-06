package Java_Syntax_Pro.L3;
import java.util.Scanner;

/*
Сравним строки
*/
public class lvl3_12 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.equals(str2))
        System.out.println("строки одинаковые");
        //напишите тут ваш код
        else  System.out.println("строки разные");
    }
}
/*
Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
•	Если строки разные, то программа должна вывести сообщение "строки разные".
*/