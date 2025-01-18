package Java_Syntax_Pro.L16;

import java.nio.file.Path;
import java.util.Scanner;

/*
Все относительно
*/

public class lvl16_14 {
}

class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишите тут ваш код
        try {
                System.out.println(Path.of(str1).relativize(Path.of(str2)));

        }catch (Exception ignored){
        }
    }
}


/*
Напиши программу, которая будет считывать с клавиатуры два пути и
выводить в консоль относительный путь между первым и вторым путями, если он существует.
В противном случае выводить ничего не нужно.

Требования:
•	Программа должна считать из консоли два пути.
•	Программа должна выводить в консоли относительный путь между введенными путями, если он существует.
•	Для вычисления относительного пути должен быть использован метод relativize() класса Path.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/