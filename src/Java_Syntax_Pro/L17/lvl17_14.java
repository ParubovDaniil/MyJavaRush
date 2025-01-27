package Java_Syntax_Pro.L17;

import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class lvl17_14 {}

/*
Ой как много методов!
*/

class Solution14 {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        return instant.plus(minutes, ChronoUnit.MINUTES);
    }

    static public Instant plusHours(Instant instant, long hours) {
        return instant.plus(hours, ChronoUnit.HOURS);
    }

    static public Instant plusDays(Instant instant, long days) {
        return instant.plus(days, ChronoUnit.DAYS);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        return instant.minus(minutes, ChronoUnit.MINUTES);
    }

    static public Instant minusHours(Instant instant, long hours) {
        return instant.minus(hours, ChronoUnit.HOURS);
    }

    static public Instant minusDays(Instant instant, long days) {
        return instant.minus(days, ChronoUnit.DAYS);
    }
}
/*
* В классе Solution реализуй шесть методов:

в методе plusMinutes нужно увеличить параметр instant на minutes минут и вернуть результат;
в методе plusHours нужно увеличить параметр instant на hours часов и вернуть результат;
в методе plusDays нужно увеличить параметр instant на days дней и вернуть результат;
в методе minusMinutes нужно уменьшить параметр instant на minutes минут и вернуть результат;
в методе minusHours нужно уменьшить параметр instant на hours часов и вернуть результат;
в методе minusDays нужно уменьшить параметр instant на days дней и вернуть результат.
Требования:
•	Метод plusMinutes нужно реализовать согласно условию.
•	Метод plusHours нужно реализовать согласно условию.
•	Метод plusDays нужно реализовать согласно условию.
•	Метод minusMinutes нужно реализовать согласно условию.
•	Метод minusHours нужно реализовать согласно условию.
•	Метод minusDays нужно реализовать согласно условию.*/