package Java_Syntax_Pro.L17;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/*
Освоение нового API
*/
public class lvl17_6 {
}
class Solution6 {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        return LocalDate.of(2020, Month.SEPTEMBER,12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        return LocalDate.ofYearDay(2020,256);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код

        return LocalDate.ofEpochDay(18517);
    }
}
/*
В классе Solution реализуй 4 метода:

метод nowExample должен вернуть текущую дату;
остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
Требования:
•	Метод nowExample должен вернуть текущую дату.
•	Метод ofExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.of.
•	Метод ofYearDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofYearDay.
•	Метод ofEpochDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofEpochDay.*/