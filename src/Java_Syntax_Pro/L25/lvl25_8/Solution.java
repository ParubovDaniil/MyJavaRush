package Java_Syntax_Pro.L25.lvl25_8;

/*
ООП - Перегрузка - убираем лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(long l) {
        System.out.println("Я буду Java прогером!");
    }
}
/*
*
Посмотри на реализации метода print() в коде и определи, какой из них будет вызван.
Удали все лишние реализации метода print().

Требования:
•	В классе Solution кроме метода main должен остаться только один метод print (с правильным параметром).
•	Метод print() должен быть публичным.
•	Метод print() должен быть статическим.
•	Программа должна выводить на экран строку "Я буду Java прогером!".*/