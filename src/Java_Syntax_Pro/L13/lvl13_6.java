package Java_Syntax_Pro.L13;

import java.lang.reflect.Array;

/*
Анализ строк
*/
public class lvl13_6 {}
class Solution6 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigits = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i <array.length ; i++) {
            if (Character.isDigit(array[i])){
                countDigits++;
        }
        }return countDigits;
    }

    public static int countLetters(String string) {
        int countLetters = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i <array.length ; i++) {
            if (Character.isLetter(array[i])){
                countLetters++;
            }
        }return countLetters;    }

    public static int countSpaces(String string) {
        int countSpaces = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i <array.length ; i++) {
            if (Character.isSpaceChar(array[i])){
                countSpaces++;
            }
        }return countSpaces;
    }
}
/*
*
Реализуй методы countDigits(String), countLetters(String), countSpaces(String), которые должны возвращать количество цифр, букв и пробелов в строке.
Метод main не принимает участия в проверке.

Требования:
•	Метод countDigits(String) должен возвращать количество цифр в переданной строке.
•	Метод countLetters(String) должен возвращать количество букв в переданной строке.
•	Метод countSpaces(String) должен возвращать количество пробелов в переданной строке.*/