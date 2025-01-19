package Java_Syntax_Pro.L16;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Перемещение файлов
*/
public class lvl16_20 {}

 class Solution20 {
     public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
         Path sourceDirectory = Path.of(scanner.nextLine());
         Path targetDirectory = Path.of(scanner.nextLine());
         try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
             for (Path path : files) {
                 if (Files.isRegularFile(path)) {
                     Path resolve = targetDirectory.resolve(path.getFileName());
                     Files.move(path, resolve);
                 }
             }
         }
     }
 }
/*
* Напиши программу, которая будет считывать с клавиатуры пути к двум директориям
и перемещать файлы из одной директории в другую (только файлы, директории игнорируй).
* Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), move().

Требования:
•	Программа должна считать из консоли пути к директориям.
•	В программе должны быть использованы соответствующие методы класса Files согласно условию.
•	Программа должна перемещать файлы из одной директории в другую согласно условию.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/
