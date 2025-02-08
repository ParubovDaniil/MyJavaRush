package Java_Syntax_Pro.L22;

public class lvl22_21 {}

/*
Класс Human и интерфейсы CanRun, CanSwim
*/

class Solution21 {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
    public abstract class Human implements CanRun, CanSwim {

    }
    public interface CanRun{
        void run();
    }
    public interface CanSwim{
        void swim();
    }

}
/*
Напиши public класс Human (человек) и public интерфейсы CanRun (бежать/ездить), CanSwim(плавать).
Добавь в каждый интерфейс по oдному методу.
Добавь эти интерфейсы классу Human, но не реализуй методы.
Объяви класс Human абстрактным.

Требования:
•	Класс Solution должен содержать интерфейс CanRun с одним методом.
•	Класс Solution должен содержать интерфейс CanSwim с одним методом.
•	Класс Solution должен содержать класс Human.
•	Класс Human должен реализовывать интерфейсы CanRun и CanSwim.
•	Класс Human должен быть абстрактным.
•	У класса Human не должно быть методов.*/