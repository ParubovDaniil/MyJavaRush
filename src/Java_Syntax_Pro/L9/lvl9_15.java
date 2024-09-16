package Java_Syntax_Pro.L9;
/*
Логические операторы
*/
public class lvl9_15 {
    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25;
        boolean secondCondition = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
/*
* Внеси исправления в метод taskForCondition(), чтобы он выводил в консоли число 30. Изменять можно только логические операторы: && на & и || на |.
Требования:
•	Нужно, чтобы метод taskForCondition() выводил число 30.
•	В методе taskForCondition() не меняй ничего, кроме логических операторов.*/