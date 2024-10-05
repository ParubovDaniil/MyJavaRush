package Java_Syntax_Pro.L14;

/*
Четыре сезона
*/
public class lvl14_15 {}



class Solution15 {

    public static void main(String[] args) {
        System.out.println(Enum.Season.WINTER);
        System.out.println(Enum.Season.SPRING);
        System.out.println(Enum.Season.SUMMER);
        System.out.println(Enum.Season.AUTUMN);

    }
}
class Enum {

   public enum Season{
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN;
    }
}
/*

Нужно создать набор значений (enum) для времен года. Для этого нужно в отдельном файле создать enum Season и объявить в нем 4 значения.
В методе Solution выведи все перечисления с новой строки.

Требования:
•	В отдельном файле создай публичный enum Season и добавь значения: WINTER, SPRING, SUMMER, AUTUMN.
•	В классе Solution выведи в консоли каждый сезон с новой строки. Используй перечисления напрямую: например, Season.WINTER.*/