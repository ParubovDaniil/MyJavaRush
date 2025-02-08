package Java_Syntax_Pro.L22;

public class lvl22_14 {}

/*
«Исправь код», часть 2
*/

 class Solution14 {
    public static void main(String[] args) {

    }
    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();

    }
}
/*
*
Исправь код, чтобы программа компилировалась.

Требования:
•	Класс Pet должен быть статическим.
•	Класс Pet должен иметь два метода.
•	Метод getChild() должен быть абстрактным.
•	Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.*/