package Java_Syntax_Pro.L16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class lvl16_6 {
}

class Solution6 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> data = new ArrayList<>(Files.readAllLines(Path.of(scanner.nextLine())));

            for (int i = 0; i < data.size(); i++) {
                String s = data.get(i);
                char[] tmp = s.toCharArray();
                for (int j = 0; j < tmp.length; j++) {
                char in = tmp[j];
                if (in == ',' || in == '.' || in == ' '){
                continue;
                }
                System.out.print(in);
                }
                System.out.println();

            }

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

/*
Напиши программу, которая считывает из консоли имя текстового файла,
далее читает символы из этого файла (используй метод readAllLines(Path) класса Files)
и выводит на экран все, за исключением точки, запятой и пробела.

Требования:
•	Программа должна считать с консоли путь к файлу.
•	Программа должна вывести в консоль содержимое файла согласно условию.
•	Для чтения строк из файла должен быть использован метод readAllLines(Path) класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/