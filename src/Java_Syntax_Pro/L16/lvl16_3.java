package Java_Syntax_Pro.L16;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Если ресурсов много
*/

public class lvl16_3 {}

 class Solution3 {
     public static void main(String[] args) throws IOException {
         String fileName; // Объявляем переменную fileName

         try (Scanner scanner = new Scanner(System.in); ) { // Объявляем scanner в try-with-resources.

             fileName = scanner.nextLine(); // Получаем fileName с помощью сканера. Это происходит ВНУТРИ try{} блока

             try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) { //  Создаем BufferedReader
                 String line;
                 while ((line = bufferedReader.readLine()) != null) {
                     System.out.println(line);
                 }
                 // читаем и выводим данные
             }

         } catch (IOException e) {
             System.out.println("Something went wrong : " + e);
         }
     }
 }
/*
* Программа считывает с консоли путь к файлу, читает строки из файла и выводит их на экран.
Перепиши код программы с использованием try-with-resources: вынеси в круглые скобки создание объектов с внешними ресурсами.
* Не забудь удалить ненужный блок finally и вызовы метода close().

Требования:
•	Программа должна считать с консоли путь к файлу, далее считать строки из файла и вывести их на экран.
•	В программе должен использоваться оператор try-with-resources согласно условию.
•	У оператора try-with-resources не должно быть блока finally.
•	У объектов с внешними ресурсами не должен вызываться метод close() явно.
•	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/
