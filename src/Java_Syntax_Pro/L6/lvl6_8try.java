package Java_Syntax_Pro.L6;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/
public class lvl6_8try {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        //напишите тут ваш код
        String str;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            str = strings[i];
            if (str==null){
                continue;
            }
            for (int j = 0; j < strings.length; j++) {
                if (strings[j] == null) {
                    continue;
                }
                if (i==j){
                    continue;
                }
                if (str.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
            str = null;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
