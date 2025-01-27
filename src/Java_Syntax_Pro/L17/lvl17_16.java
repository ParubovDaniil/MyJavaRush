package Java_Syntax_Pro.L17;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Временная глобализация
*/

public class lvl17_16 {}


class Solution16 {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        globalTime = localDateTime.atZone(zoneId);
        System.out.println(globalTime);
    }
}

/*
*
В методе main присвой значение переменной globalTime, используя переменные localDateTime и zoneId.

Требования:
•	Метод main должен присвоить значение переменной globalTime, используя переменные localDateTime и zoneId.*/