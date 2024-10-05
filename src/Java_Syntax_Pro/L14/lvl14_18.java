package Java_Syntax_Pro.L14;
/*
Следующий месяц, пожалуйста
*/
public class lvl14_18 {}

class Solution18 {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        if (!(month.ordinal() == 11)) {
            int index = month.ordinal();
            Month newMonth = Month.values()[index + 1];
            return newMonth;
        }else
            return Month.values()[0];
    }
}
 class Mnt {
    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
}
/*
В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц,
а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
Метод main не участвует в проверке.

Требования:
•	Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
•	В методе getNextMonth должны использоваться методы ordinal() и values().*/