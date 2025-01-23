package Java_Syntax_Pro.L17;

import java.time.LocalTime;

/*
Нужно просто посчитать
*/
public class lvl17_10 {
}


class Solution10 {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        if (base.getHour()==LocalTime.MIDNIGHT.getHour()) {
            System.out.println(base);
        }
        return  base.plusHours(6);
        // return base.plusMinutes(288);

    }
}
/*
Цикл while в методе main должен отработать ровно четыре раза, чтобы на экран вывелись 4 строки.
Изменения можно вносить только в метод amazingMethod.

Требования:
•	Метод amazingMethod должен быть изменен так, чтобы при запуске программа вывела 4 строки.
*/