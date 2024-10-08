package Java_Syntax_Pro.L14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
Успеваемость студентов-2
*/
public class lvl14_10 {
}

class Solution10 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String key : grades.keySet()) {
            System.out.println(key);
        }
    }

    public static Double getAverageMark() {
        double d = 0;
        ArrayList<Double> result = new ArrayList<>();
        for (String key: grades.keySet())
        {
           result.add(grades.get(key));
        }
        System.out.println(result);
        double sum = 0.0;
        for (Double number : result) {
            sum += number; // Сложение каждого элемента
        }
        double average = 0.0;
        if (!result.isEmpty()) { // Проверяем, что список не пустой
            average = sum / result.size(); // Делим сумму на количество элементов
        }
        return average;
    }
}
/*
В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его средняя оценка.
На этот раз твоя задача — реализовать методы:

printStudents, который выводит только имена всех студентов (ключ коллекции);
getAverageMark, который возвращает средний балл всех студентов.
Требования:
•	В классе Solution нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
•	Метод printStudents должен выводить всех студентов (имя и фамилия) из коллекции grades с новой строки.
•	Метод getAverageMark должен возвращать средний балл всех студентов из коллекции grades.*/