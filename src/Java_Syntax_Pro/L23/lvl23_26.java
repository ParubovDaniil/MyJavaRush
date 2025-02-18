package Java_Syntax_Pro.L23;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lvl23_26 {
}

/*
Сортировка четных чисел из файла
*/

class Solution26 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String way = scanner.nextLine();
        Path path = Path.of(way);
        List<Integer> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path.toString());
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis))) {
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    list.add(Integer.valueOf(line));
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            list.stream()
                    .filter(l -> l % 2 == 0)
                    .sorted()
                    .forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
* В этой задаче тебе нужно:

Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Требования:
•	Программа должна считывать данные с консоли.
•	Программа должна создавать FileInputStream для введенной с консоли строки.
•	Программа должна выводить данные на экран.
•	Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла — FileInputStream.*/