package Java_Syntax_Pro.L19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Сортировка по возрасту
*/
public class lvl19_2 {}


class Solution {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Иванов", 22),
                new Student("Петров", 18),
                new Student("Сидоров", 19)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
 class AgeComparator implements Comparator<Student> {
     @Override
     public int compare(Student o1, Student o2) {
         if (o1.getAge()> o2.getAge()){
             return -1;
         } else if (o1.getAge()<o2.getAge()) {
             return 1;
         } else return 0;
     }
     //напишите тут ваш код
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент - " + name +
                ", возраст - " + age +
                '.';
    }
}
/*В классе Solution есть статическое поле students, которое заполняется студентами (объектами типа Student) в методе main().
У студента (класс Student) есть имя (поле name) и возраст (поле age).
Нужно отсортировать в программе студентов по возрасту в убывающем порядке (от старшего к младшему).
Для этого используется метод Collections.sort(ArrayList<Student>, Comparator<Student>),
в который передается список студентов students и компаратор сортировки по убыванию возраста.

Твоя задача — реализовать этот компаратор.
Для этого в классе AgeComparator нужно имплементировать интерфейс Comparator<Student>
и реализовать метод int compare(Student student1, Student student2), который возвращает числовое значение со следующими условиями:

отрицательное число, если возраст студента student1 больше возраста студента student2;
положительное число, если возраст студента student1 меньше возраста студента student2;
0, если возраст студентов student1 и student2 одинаковый.
Метод main() не принимает участие в тестировании.

Требования:
•	В классе AgeComparator нужно реализовать интерфейс Comparator<Student>.
•	В классе AgeComparator нужно создать публичный метод int compare(Student, Student).
•	Метод compare(Student, Student) нужно реализовать согласно условию.
* */