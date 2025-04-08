package Java_Syntax_Pro.L25.lvl25_27;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }

    public void info(Number s) {
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName()));
    }

    public void info(String s) {
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
    }
}
/*
* Для решения этой задачи:

Два раза перегрузи в классе Tree метод info(Object s) так, чтобы получилось три метода: info(Object s), info(Number s), info(String s).
Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
Например, для метода info(Number s) результат может быть таким: "Дерево № 123 , метод Number, параметр Short".
Требования:
•	В классе Tree должен быть реализован метод info(Object s).
•	В классе Tree должен быть реализован метод info(Number s).
•	В классе Tree должен быть реализован метод info(String s).
•	Метод info(Number s) должен выводить на экран строку, аналогичную строке из метода info(Object s), заменив лишь фразу("метод Object" на "метод Number").
•	Метод info(String s) должен выводить на экран строку, аналогичную строке из метода info(Object s), заменив лишь фразу("метод Object" на "метод String").*/