package Java_Syntax_Pro.L12;
/*
Студент
*/
public class lvl12_26 {}

class Solution26 {
    public static void main(String[] args) {
        Student student = new Student("Амиго");
        System.out.println(student.name);
    }
}
class Student {
    public String name;
    public Student(String name){
        this.name=name;
    }
}
/*
Метод main класса Solution создает объект класса Student с конкретным именем, но программа не компилируется.
Тебе нужно исправить ошибку в классе Student, чтобы программа компилировалась, и при запуске в консоль выводилось имя студента.

Требования:
•	Метод main не изменяй.
•	В классе Student должен быть конструктор с одним параметром.
•	Конструктор должен инициализировать поле name полученным аргументом.
*/