package Java_Syntax_Pro.L16;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

/*
Временное сохранение файла
*/
public class lvl16_21 {
}


class Solution21 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        InputStream input = url.openStream();

        byte[] buffer = input.readAllBytes();

        Path path = Files.createTempFile(null,null);

        try{
            Files.write(path, buffer);
            System.out.println("Файл успешно сохранен: " + path); // Сообщение об успехе
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении файла: " + e.getMessage()); // Более информативное сообщение об ошибке
        }
    }
}
/*
* Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять во временный файл.
Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.

Требования:
•	Программа должна считать из консоли ссылку на файл в интернете (строку).
•	Программа должна скачать файл по ссылке и сохранить его во временный файл.
•	В программе должны быть использованы методы классов Files и URL согласно условию.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/