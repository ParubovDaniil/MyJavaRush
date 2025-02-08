package Java_Syntax_Pro.L22;

public class lvl22_30 {}


/*
Родитель класса CTO
*/

 class Solution30 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }
    static class Worker{
        public void workHard(){}
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Worker implements Businessman {

    }
}
/*
* Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.

Требования:
•	Класс Solution должен содержать интерфейс Businessman с методом void workHard().
•	Класс Solution должен содержать не абстрактный класс CTO.
•	Класс CTO должен реализовывать интерфейс Businessman.
•	Класс CTO не должен содержать методов.
•	Класс Solution должен содержать дополнительный класс.
•	Класс CTO должен наследоваться от дополнительного класса.
•	Дополнительный класс должен содержать один метод.*/