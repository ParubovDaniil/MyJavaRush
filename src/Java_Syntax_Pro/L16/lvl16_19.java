package Java_Syntax_Pro.L16;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Поверхностное копирование
*/

public class lvl16_19 {
}

class Solution19 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 1. Считываем пути к исходной и целевой директориям
        Path sourceDirectory = Path.of(scanner.nextLine()); // Путь к исходной директории
        Path targetDirectory = Path.of(scanner.nextLine()); // Путь к целевой директории

        // 2. Открываем поток для чтения файлов из исходной директории
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            // 3. Проходим по всем файлам в исходной директории
            for (Path path : files) {
                // 4. Проверяем, является ли текущий элемент файлом
                if (Files.isRegularFile(path)) {
                    // 5. Формируем путь для нового файла в целевой директории
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    // 6. Копируем файл из исходной директории в целевую
                    Files.copy(path, resolve);
                }
            }
        }
    }
}


/*
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям
и копировать файлы из одной директории в другую (только файлы, директории игнорируй).
Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().

Требования:
•	Программа должна считать из консоли путь к директории.
•	В программе должны быть использованы соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
•	Программа должна копировать файлы из одной директории в другую согласно условию.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/
