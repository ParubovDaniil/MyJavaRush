package Java_Syntax_Pro.L25.lvl25_34;


/*
ООП. Hryvnia — тоже деньги
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        public double amount = 123d;

        @Override
        Money getMoney() {
            return this; // Возвращаем сам объект Hryvnia
        }
        @Override
        public Object getAmount() {
            return amount; // Переопределяем getAmount, чтобы вернуть значение amount
        }
    }
}
/*
*
Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.

Требования:
•	Класс Hryvnia должен быть потомком класса Money.
•	В классе Hryvnia должен быть реализован метод getAmount.
•	Метод getAmount в классе Hryvnia должен возвращать значение поля amount.
•	При выполнении программы не должны возникать исключения или ошибки.*/