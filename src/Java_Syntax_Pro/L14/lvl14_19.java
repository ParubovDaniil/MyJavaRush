package Java_Syntax_Pro.L14;

public class lvl14_19 {}

/*
Месяцы в сезоне
*/
class En {
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
        DECEMBER;
        //напишите тут ваш код
        public static Month[] getWinterMonths() {
            return new Month[]{DECEMBER, JANUARY, FEBRUARY};
        }

        public static Month[] getSpringMonths() {
            return new Month[]{MARCH, APRIL, MAY};
        }

        public static Month[] getSummerMonths() {
            return new Month[]{JUNE, JULY, AUGUST};
        }

        public static Month[] getAutumnMonths() {
            return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
        }
    }
}

/*
В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths() которые будут возвращать массив с тремя месяцами.

Требования:
•	Публичный статический метод getWinterMonths() должен возвращать массив с зимними месяцами.
•	Публичный статический метод getSpringMonths() должен возвращать массив с весенними месяцами.
•	Публичный статический метод getSummerMonths() должен возвращать массив с летними месяцами.
•	Публичный статический метод getAutumnMonths() должен возвращать массив с осенними месяцами*/