package Java_Syntax_Pro.L17;

import java.util.Calendar;
import java.util.Date;

/*
Лишь бы не в понедельник :)
*/

public class lvl17_1 {
}

class Solution {

    static Date birthDate = new Date(99, 10, 30);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код

        switch (date.getDay()) {
            case 0:
                return "Воскресенье";
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
        }
    return null;
    }
}
/*
*
Проинициализируй переменную birthDate объектом Date с датой своего рождения.
Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.

Требования:
•	Переменная birthDate должна быть проинициализирована при объявлении.
•	Метод getDayOfWeek(Date date) должен возвращать русское название дня недели.*/