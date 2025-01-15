package Java_Syntax_Pro.L16;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Что-то не копируется...
*/

public class lvl16_5 {}


 class Solution5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] buffer = new byte[1024];
            while (inputStream.available() > 0) {
                int read = inputStream.read(buffer);
                outputStream.write(buffer, 0, read);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
/*
* Есть программа, которая считывает из консоли путь к файлу1 и путь к файлу2 и копирует содержимое файла1 в файл2.
Но она не работает корректно. Найди и исправь ошибки в коде, чтобы программа заработала как нужно.

Требования:
•	Программа должна считать с консоли пути к файлам.
•	Программа должна переписывать содержимое из одного файла в другой.
•	Потоки для чтения и записи должны быть закрыты.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/