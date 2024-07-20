package Java_Syntax_Pro.L6;

import java.util.Scanner;
/*
Удаляем одинаковые строки
*/
public class lvl6_8 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = strings.length - 1; j >= 0; j--) {
                if (strings[i] == null) {
                    break;
                }
                if (j==i)
                {break;}
                if (strings[i].equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                    break;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}


/*
* В этой задаче тебе нужно:

Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
Примеры.

Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}

Требования:
•	В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
•	В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.*/