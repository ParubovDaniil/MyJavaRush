package Java_Syntax_Pro.L9;
import java.util.concurrent.TimeUnit;

/*
Таймер
*/
public class lvl9_10 {
    public static void main(String[] args) throws InterruptedException {
        setTimer(0,0,0,0,0);
    }

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        int day = days;
        int hour = hours;
        int minute = minutes;
        int second = seconds;
        int milli = millis;
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(day);
        TimeUnit.HOURS.sleep(hour);
        TimeUnit.MINUTES.sleep(minute);
        TimeUnit.SECONDS.sleep(second);
        TimeUnit.MILLISECONDS.sleep(milli);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}

/*
В классе Solution реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время,
используя соответствующие методы java.util.concurrent.TimeUnit.
Требования:
•	Метод setTimer(int, int, int, int, int) должен быть реализован согласно условию.
* */