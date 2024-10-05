package Java_Syntax_Pro.L14;

public class lvl14_16 {
}

class Solution16 {

    public static void main(String[] args) {
        Tpm.JavarushQuest[] JavarushQuest = Tpm.JavarushQuest.values();
        for (Tpm.JavarushQuest day : JavarushQuest)
            System.out.println(day.ordinal());
    }
}

/*
Перечислим квесты Javarush
*/
class Tpm {
    public enum JavarushQuest {
        JAVA_SYNTAX,
        JAVA_CORE,
        JAVA_MULTITHREADING,
        JAVA_COLLECTIONS,
        CS_50,
        ANDROID,
        GAMES
    }
}

/*
*
В enum JavarushQuest хранится список квестов.
* Твоя задача — получить массив всех элементов в методе main (используй метод values())
* и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.

Требования:
•	В методе main получи список всех констант из enum JavarushQuest с помощью метода values().
•	В методе main выведи порядковый номер каждого элемента с новой строки, используя метод ordinal().*/