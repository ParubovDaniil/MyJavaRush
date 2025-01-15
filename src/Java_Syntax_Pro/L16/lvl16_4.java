package Java_Syntax_Pro.L16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class lvl16_4 {
}

class Solution4 {
    public static void main(String[] args) {
        String fileInput; // Объявляем переменную fileName
        String fileOutput;
        try (Scanner scannerInputFile = new Scanner(System.in); Scanner scannerOutputFile = new Scanner(System.in)) {
            // Объявляем scanner в try-with-resources.
            fileInput = scannerInputFile.nextLine();
            fileOutput = scannerOutputFile.nextLine();
            try (InputStream inputStream = Files.newInputStream(Path.of(fileInput));
                 OutputStream outputStream = Files.newOutputStream(Path.of(fileOutput))) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    if (bytesRead >= 2) {
                        for (int i = 0; i < bytesRead - 1; i += 2) {
                            int tmp = buffer[i];
                            buffer[i] = buffer[i + 1];
                            buffer[i + 1] = (byte) tmp;
                        }
                    }
                    outputStream.write(buffer, 0, bytesRead);
                    if (bytesRead % 2 != 0) {
                        byte lastByte = buffer[bytesRead-1];
                        outputStream.write(lastByte);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
        //напишите тут ваш код
    }
}
/*
* public static void main(String[] args) {
    // Создаем try-with-resources блок для управления ресурсами Scanner, потоками ввода и вывода
    try (Scanner scanner = new Scanner(System.in);
         var input =  Files.newInputStream(Path.of(scanner.nextLine()));
         var output = Files.newOutputStream(Path.of(scanner.nextLine())))
    {
        // Цикл для чтения и обработки данных, пока есть доступные байты во входном потоке
        while (input.available() > 0){
             // Проверяем, если во входном потоке больше 2 доступных байт
            if (input.available() > 2) {
                // Читаем первый байт
               byte byteSourceOne = (byte) input.read();
                // Читаем второй байт
               byte byteSourceTwo = (byte) input.read();
                // Записываем второй байт
               output.write(byteSourceTwo);
                // Записываем первый байт
               output.write(byteSourceOne);
            } else {
                // Если осталось меньше 2 байт, читаем оставшийся байт и записываем его в выходной поток.
                byte byteSourceOne = (byte) input.read();
                output.write(byteSourceOne);
            }
        }
    } catch (IOException e){
        // Выводим сообщение об ошибке, если что-то пошло не так
        System.out.println("Something went wrong : " + e);
    }
}
* */
/*
Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2.
Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть. Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.

        Требования:
        •	Программа должна считать с консоли пути к файлам.
        •	Программа должна переписывать байты из одного файла в другой согласно условию.
        •	Для чтения и записи файлов должны быть использованы методы newInputStream и newOutputStream класса Files.
        •	Потоки для чтения и записи должны быть закрыты.
        •	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/
