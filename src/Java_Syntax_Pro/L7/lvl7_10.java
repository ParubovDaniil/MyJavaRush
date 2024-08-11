package Java_Syntax_Pro.L7;
/*
Борьба за доступ
*/
public class lvl7_10 {
    public static void main(String[] args) {
        lvl7_10_Person person = new lvl7_10_Person("Иван", "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());
    }
}
/*
*
Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.

Требования:
•	Код должен компилироваться.
•	Нужно изменить минимальное необходимое количество модификаторов доступа в классе Person.*/