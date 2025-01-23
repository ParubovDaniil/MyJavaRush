package Java_Syntax_Pro.L17;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
Выход из зацикленности
*/

public class lvl17_5 {}
class Solution5 {
    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1);
            System.out.print(".");
        }
        System.out.print("Финиш");
    }
}
/*
*
Цикл while должен был завершиться за 31 итерацию, но почему-то зациклился. Найди и исправь ошибку.

Требования:
•	Исправь одну ошибку, чтобы программа успешно завершилась.*/