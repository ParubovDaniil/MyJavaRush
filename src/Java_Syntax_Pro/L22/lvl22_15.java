package Java_Syntax_Pro.L22;

public class lvl22_15 {}

/*
Корова — тоже животное
*/

class Solution15 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Любое";
        }
    }

}
/*
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.

Требования:
•	Класс Animal должен быть абстрактным.
•	Класс Cow не должен быть абстрактным.
•	Класс Cow должен наследоваться от класса Animal.
•	Класс Cow должен реализовать абстрактный метод из класса Animal.
•	Метод getName() класса Cow должен возвращать любое имя коровы.
*/