package Java_Syntax_Pro.L25.lvl25_19;

/*
Значения по умолчанию
*/

public class Solution {
    public int intVar ;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);
    }
}
/*

* В этой задаче тебе нужно:

Создать 7 нестатических public полей класса:
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String

Убедиться, что они инициализируются дефолтными значениями.
Вывести их значения в заданном порядке в методе main()
Требования:
•	В классе Solution должно быть объявлено поле intVar типа int.
•	В классе Solution должно быть объявлено поле doubleVar типа double.
•	В классе Solution должно быть объявлено поле DoubleVar типа Double.
•	В классе Solution должно быть объявлено поле booleanVar типа boolean.
•	В классе Solution должно быть объявлено поле ObjectVar типа Object.
•	В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
•	В классе Solution должно быть объявлено поле StringVar типа String.
•	Метод main должен выводить значения полей на экран (каждое — с новой строки или через пробел) в заданном порядке.

* Инициализировать переменные не нужно.*/