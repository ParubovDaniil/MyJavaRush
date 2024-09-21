package Java_Syntax_Pro.L11;

public class lvl11_8 {}
class Programmer {
    private int salary = 1000;
    public void setSalary(int salary) {
        if (salary>this.salary) {
            this.salary = salary;
        }
    }
    public int getSalary() {
        return salary;
    }
}
/*
У нас есть класс Programmer, в котором есть очень важное поле — salary.
Наша задача следующая: нужно добавить возможность получить и изменить значение этого поля, используя геттер и сеттер.
Но есть нюанс: зарплату можно только повышать.
Поэтому тебе нужно добавить проверку в сеттер: если значение аргумента больше текущего значения, то поле salary изменяем, иначе — игнорируем.

Требования:
•	В классе Programmer должно быть не статическое private int поле salary.+
•	В классе Programmer должен быть публичный геттер для поля salary.+
•	В классе Programmer должен быть публичный сеттер для поля salary.+
•	Сеттер должен изменять значение поля salary, только если входящий аргумент больше текущего значения.+
*/