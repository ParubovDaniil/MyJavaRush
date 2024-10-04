package Java_Syntax_Pro.L14;
import java.util.HashMap;
/*
Успеваемость студентов
*/
public class lvl14_9 {}
 class Solution9 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Серёга", 2.0);
        grades.put("st2", 3.0);
        grades.put("st3", 4.0);
        grades.put("st4", 5.0);
        grades.put("st5", 6.0);

    }
}
/*
В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его средняя оценка.
Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
Значения можешь выбрать любые.

Требования:
•	В классе Solution нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
•	В классе Solution должен быть публичный статический метод addStudents с типом возвращаемого значения void.
•	Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.*/