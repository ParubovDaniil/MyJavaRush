package Java_Syntax_Pro.L16;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Пропускаем не всех
*/
public class lvl16_7 {}
 class Solution7 {
     public static void main(String[] args) {
         //напишите тут ваш код
         try (Scanner scanner = new Scanner(System.in)) {
             List<String> data = new ArrayList<>(Files.readAllLines(Path.of(scanner.nextLine())));

             for (int i = 0; i < data.size(); i++) {
                 System.out.println(data.get(i));
                i++;
             }

         } catch (IOException e) {
             System.out.println("Something went wrong : " + e);
         }
     }
 }

/*Напиши программу, которая считывает из консоли имя текстового файла,
далее читает строки из этого файла (используй метод readAllLines(Path) класса Files) и
выводит их на экран через одну, начиная с первой.

Требования:
•	Программа должна считать из консоли путь к файлу.
•	Программа должна вывести в консоли содержимое файла согласно условию.
•	Для чтения строк из файла нужно использовать метод readAllLines(Path) класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/