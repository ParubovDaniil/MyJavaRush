package Java_Syntax_Pro.L12;
import java.util.ArrayList;
import java.util.List;
public class lvl12_23 {}
/*
Почувствуй себя деканом
*/

class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        ArrayList<String> copy = new ArrayList<String>(students);
        for (String student : copy) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }
    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
/*
У нас есть группа в университете и метод, который должен отчислять конкретного студента, но он почему-то не работает.
Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.

Требования:
•	В классе UniversityGroup должно быть публичное не статическое поле students типа List<String>.
•	В классе UniversityGroup должен быть публичный не статический метод exclude(String) с типом возвращаемого значения void.
•	Метод exclude должен удалять из списка переданного студента.
*/