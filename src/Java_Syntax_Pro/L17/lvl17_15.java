package Java_Syntax_Pro.L17;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/*
Тренировка временных зон
*/
public class lvl17_15 {}



 class Solution15 {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
        TreeSet<String> st = new TreeSet<>(ZoneId.getAvailableZoneIds());
        return st;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код
        ZoneId beijingZone = ZoneId.of("Asia/Shanghai");
        ZonedDateTime beijingDateTime = ZonedDateTime.now(beijingZone);
        return beijingDateTime;
    }
}
/*
*
Что общего у всех временных зон и Пекина?
Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)

Реализуй два метода:

в методе getSortedZones верни множество TreeSet всех временных зон;
в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").
Требования:
•	Метод getSortedZones должен вернуть множество всех временных зон.
•	Метод getBeijingDateTime должен вернуть текущую дату и время в Пекине.*/