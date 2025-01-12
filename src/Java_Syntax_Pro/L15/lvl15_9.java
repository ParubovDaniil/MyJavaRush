package Java_Syntax_Pro.L15;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
Оборачивание исключений
*/

public class lvl15_9 { }
class FileUtils {

    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаем содержимое файла " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записываем данные в файл " + filePath);
    }
}

 class Solution9 {
    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
* В методе copyFile перехвати исключения, которые бросают методы readFile и writeFile.
Перехваченные исключения оберни в RuntimeException и пробрось дальше.

Требования:
•	В методе copyFile должны перехватываться FileNotFoundException и FileSystemException.
•	Все перехваченные исключения нужно оборачивать в RuntimeException и пробрасывать дальше.
•	У метода copyFile не должно быть исключений в секции throws.*/