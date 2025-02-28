package Java_Syntax_Pro.L24;
import java.util.ArrayList;
import java.util.List;
public class lvl24_19 {}

/*
Валюты
*/

class Solution19 {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
            allMoney.add(new Hryvnia(2000));
            allMoney.add(new USD(700));
            allMoney.add(new Ruble(7000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
class Hryvnia extends Money{

    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
class Ruble extends Money{

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
class USD extends Money{

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public abstract String getCurrencyName();

    public double getAmount() {
        return amount;
    }
}
/*
* Расширь функциональность программы, которая позволит производить манипуляции с валютами.

В существующем абстрактном классе Money создай приватное поле amount типа double.
Создай публичный геттер для поля amount(public double getAmount()), чтобы к этому полю можно было получить доступ извне класса Money.
В отдельных файлах создай классы Hryvnia, Ruble и USD, которые будут являться потомками класса Money.
В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() который будет возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, который принимает один параметр и вызывает конструктор базового класса (super) с этим параметром.
Заполни список allMoney объектами всех возможных в рамках условия задачи и функциональности программы валют.
Требования:
•	В классе Money должно содержаться приватное поле amount типа double.
•	В классе Money должен быть реализован публичный конструктор с одним параметром типа double, который устанавливает значение переменной amount согласно переданному параметру.
•	В классе Money должен быть реализован публичный метод getAmount(), который будет возвращать значение поля amount.
•	Классы Hryvnia, Ruble и USD должны быть потомками класса Money и существовать в отдельных файлах.
•	В классах Hryvnia, Ruble и USD должен быть реализован метод getCurrencyName().
•	Метод getCurrencyName() должен возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
•	В классах Hryvnia, Ruble и USD должен быть реализован публичный конструктор с одним параметром типа double, который устанавливает значение поля amount класса Money путем вызова конструктора класса родителя c тем же параметром.*/