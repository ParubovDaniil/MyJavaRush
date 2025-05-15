package Java_Syntax_Pro.L27.lvl27_21;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String fileName1 = scanner1.nextLine();
        String fileName2 = scanner1.nextLine();
        allLines.clear();
        forRemoveLines.clear();
        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {
            String line;
            // Считываем данные из первого файла в список allLines
            while ((line = reader1.readLine()) != null) {
                allLines.add(line);
            }
            // Считываем данные из второго файла в список forRemoveLines
            while ((line = reader2.readLine()) != null) {
                forRemoveLines.add(line);
            }
            new Solution().joinData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void joinData() throws CorruptedDataException {
            // Если в allLines содержатся все строки из forRemoveLines,
            // то удаляем их из allLines.
            if (allLines.containsAll(forRemoveLines)) {
                allLines.removeAll(forRemoveLines);
            } else {
                // Иначе очищаем весь список allLines и выбрасываем исключение.
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }

/*
* Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.

Требования:
•	Класс Solution должен содержать public static поле allLines типа List<String>.
•	Класс Solution должен содержать public static поле forRemoveLines типа List<String>.
•	Класс Solution должен содержать public void метод joinData() который может бросать исключение CorruptedDataException.
•	Программа должна считывать c консоли имена двух файлов.
•	Программа должна считывать построчно данные из первого файла в список allLines.
•	Программа должна считывать построчно данные из второго файла в список forRemoveLines.
•	Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержатся все строки из списка forRemoveLines.
•	Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержатся все строки из списка forRemoveLines.
•	Метод joinData должен вызываться в main.*/