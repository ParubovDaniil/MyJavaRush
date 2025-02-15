package Java_Syntax_Pro.L23;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class lvl23_19 {
}


/*
Писатель в файл с консоли
*/

class Solution19 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String way = sc.nextLine();
        Path path = Path.of(way);
        try (FileOutputStream fos = new FileOutputStream(path.toString());
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos))) {
            Scanner viewConsole = new Scanner(System.in);
            while (true) {
                String imp = viewConsole.nextLine();
                if (imp.equals("exit")){
                    break;
                }
                bufferedWriter.write(imp);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
*     public static void main(String[] args) {
        try (Scanner consoleScanner = new Scanner(System.in);
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(consoleScanner.nextLine()))) {

            String line;
            while (!(line = consoleScanner.nextLine()).equals("exit")) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace(); // Или более подходящая обработка исключения
        }
    }
}*/
/*
*
В этой задаче тебе нужно:

Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего считывать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.*/