package Java_Syntax_Pro.L12;
/*
Объекты внутренних и вложенных классов
*/

import Java_Syntax_Pro.L12.Outer.Inner;

public class lvl12_9 {
}
class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
class Solution9 {
    public static void main(String[] args) {
        Outer.Nested on = new Outer.Nested();
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();
    }
}
/*
В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса Solution создай по одному объекту каждого из них.

Требования:
•	В методе main класса Solution должен быть создан объект класса Inner.
•	В методе main класса Solution должен быть создан объект класса Nested.
•	Класс Outer изменять нельзя.*/