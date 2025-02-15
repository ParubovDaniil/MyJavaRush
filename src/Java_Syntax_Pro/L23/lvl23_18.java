package Java_Syntax_Pro.L23;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class lvl23_18 {}

/*
Чтение файла
*/

 class Solution18 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String way = scanner.nextLine();
        Path path = Path.of(way);
        try(FileInputStream fIo = new FileInputStream(path.toString());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fIo))) {
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: "+ e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода/вывода: "+ e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}

/*
* try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите путь к файлу:");
            String filePath = scanner.nextLine();
            try {
                Files.lines(Paths.get(filePath)).forEach(System.out::println);
            } catch (IOException e) {
                System.err.println("Ошибка ввода/вывода: " + e.getMessage());
            }
* */
/*
*
В этой задаче тебе нужно:

Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Требования:
•	Программа должна считывать c консоли путь к файлу.
•	Программа должна выводить на экран содержимое файла.
•	Поток чтения из файла (FileInputStream) должен быть закрыт.
•	BufferedReader также должен быть закрыт.*/