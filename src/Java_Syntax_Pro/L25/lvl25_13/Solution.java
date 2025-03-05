package Java_Syntax_Pro.L25.lvl25_13;

/*
Максимально простой код-2
*/

public class Solution {
   /* public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat extends NormalCat {

        public NakedCat() {
            super();
        }
    }
    public static class NormalCat {
        public NormalCat() {
            super();
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NakedCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}*/
}
/*
* Упрости код — удали все конструкторы и вызовы конструкторов суперклассов, которые автоматически добавятся при компиляции.

Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat — Is-a: http://en.wikipedia.org/wiki/Is-a
Требования:
•	Класс NormalCat должен быть потомком класса NakedCat.
•	Класс SiamCat должен быть потомком класса NormalCat.
•	Упрости код класса NakedCat.
•	Упрости код класса NormalCat.*/