package Java_Syntax_Pro.L19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Наставники JavaRush
*/
public class lvl19_3 {}
class JavaRushMentor {
    private String name;

    public JavaRushMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ментор по имени - " + name;
    }
}

 class Solution3 {
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("Джон Бобров"),
                new JavaRushMentor("Риша"),
                new JavaRushMentor("Эллеонора Керри"),
                new JavaRushMentor("Ханс Нудлс"),
                new JavaRushMentor("Ким"),
                new JavaRushMentor("Хулио Сиеста"),
                new JavaRushMentor("Диего"),
                new JavaRushMentor("Лага Билаабо")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}
class NameComparator implements Comparator<JavaRushMentor>{
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        return o1.getName().length()-o2.getName().length();
    }
    //напишите тут ваш код

}

/*
* В классе Solution есть статическое поле mentors, которое заполняется менторами JavaRush (объектами типа JavaRushMentor) в методе main().
У ментора (класс JavaRushMentor) есть имя (поле name).
В программе нужно отсортировать менторов по длине имени в возрастающем порядке (от самого короткого до самого длинного).

Чтобы отсортировать всех менторов в списке mentors используется метод
Collections.sort(ArrayList<JavaRushMentor>, Comparator<JavaRushMentor>),
в который передается список менторов mentors и компаратор сортировки.

Твоя задача — реализовать этот компаратор.
Для этого в классе NameComparator нужно имплементировать интерфейс
Comparator<JavaRushMentor> и реализовать метод int compare(JavaRushMentor mentor1, JavaRushMentor mentor2),
который возвращает числовое значение со следующими условиями:

отрицательное число, если длина имени ментора mentor1 меньше длины имени ментора mentor2;
положительное число, если длина имени ментора mentor1 больше длины имени ментора mentor2;
0, если длины имен менторов mentor1 и mentor2 одинаковы.
Метод main() не принимает участие в тестировании.

Требования:
•	В классе NameComparator нужно реализовать интерфейс Comparator<JavaRushMentor>.
•	В классе NameComparator нужно создать публичный метод int compare(JavaRushMentor, JavaRushMentor).
•	Метод compare(JavaRushMentor, JavaRushMentor) нужно реализовать согласно условию.*/