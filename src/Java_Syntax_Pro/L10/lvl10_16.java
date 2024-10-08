package Java_Syntax_Pro.L10;
/*
String.format()
*/
public class lvl10_16 {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут %s. Я буду зарабатывать $%d в месяц.";
        return String.format(phrase, name, salary);
    }
}
/*
Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.

Для этого используй метод String.format().

Требования:
•	Нужно, чтобы метод format(String, int) использовал метод String.format().
•	Нужно, чтобы метод format(String, int) возвращал строку согласно условию задачи.*/