package Java_Syntax_Pro.L11;
import java.util.Calendar;

/*
Текущий год
*/
public class lvl11_18 {}
class Solutionss {

    private int currentYear;

    public  Solutionss() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solutionss solutionss = new Solutionss();
        System.out.println(solutionss.getCurrentYear());
    }
}
/*
* В классе Solution есть поле currentYear, которое должно инициализироваться
значением текущего года(Calendar.getInstance().get(Calendar.YEAR)) при создании нового объекта типа Solution.
Тебе нужно найти ошибку и исправить её, чтобы при создании объекта класса Solution поле currentYear правильно инициализировалось.

Требования:
•	В классе Solution должно быть приватное не статическое поля currentYear типа int.
•	В классе Solution должен быть геттер getCurrentYear для поля currentYear.
•	При создании объекта класса Solution, currentYear должно инициализироваться значением текущего года (используй метод Calendar.getInstance().get(Calendar.YEAR)).*/