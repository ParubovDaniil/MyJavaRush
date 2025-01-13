package Java_Syntax_Pro.L15;

public class lvl15_13 {}

/*
Готовим коктейли
*/

 class Solution13 {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        String nameMethod;
        int lineNumber;
        String nameClass;
        String nameFile;
        for(StackTraceElement info: stackTrace)
        {
        nameMethod = info.getMethodName();
        lineNumber = info.getLineNumber();
        nameClass = info.getClassName();
        nameFile = info.getFileName();
            System.out.printf(OUTPUT_FORMAT,nameMethod,lineNumber,nameClass,nameFile);
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}

/*
Метод printStackTrace принимает в качестве параметра массив stackTrace. Нужно вывести информацию о каждом элементе массива в формате:
"Метод <имя метода> вызван из строки <номер строки> класса <имя класса> в файле <имя файла>."
Информацию о каждом элементе выводи с новой строки.

Пример:
Метод addJuice вызван из строки 24 класса com.javarush.task.pro.task14.task1414.Solution в файле Solution.java.

Требования:
•	Метод printStackTrace должен выводить информацию о каждом элементе массива stackTrace.*/