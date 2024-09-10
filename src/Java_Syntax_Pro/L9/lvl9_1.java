package Java_Syntax_Pro.L9;
import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;
/*
Утильный класс: часть 1
*/
public class lvl9_1 {
    public static double sin(double a) {
        //напишите тут ваш код
        return toDegrees(Math.sin(a));
    }
    public static double cos(double a) {
        //напишите тут ваш код
        return toDegrees(Math.cos(a));
    }
    public static double tan(double a) {
        //напишите тут ваш код
        return toDegrees(Math.tan(a));
    }
}
/*
*
Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно, полученного как параметр. Угол задан в градусах.
В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.
Требования:
•	Реализуй метод sin(double) согласно условию.
•	Реализуй метод cos(double) согласно условию.
•	Реализуй метод tan(double) согласно условию.*/