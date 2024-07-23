package Java_Syntax_Pro.L6;

/*
Таблица умножения
*/
public class lvl6_9 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                MULTIPLICATION_TABLE[i][j]=(i+1)*(j+1);
                System.out.print(MULTIPLICATION_TABLE[i][j]+" ");
                if (j==9){
                    System.out.println();
                }
            }
        }
    }
}
/*
* Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
* заполни его таблицей умножения и выведи в консоли в следующем виде:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
Числа в строке разделены пробелом.

Требования:
•	В методе main массив MULTIPLICATION_TABLE должен быть заполнен таблицей умножения.
•	Выведенный текст должен содержать 10 строк.
•	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
•	Выведенные числа должны быть таблицей умножения.*/