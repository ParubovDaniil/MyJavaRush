package Java_Syntax_Pro.L8;
/*
Странное деление
*/
public class lvl8_6 {
    public static void main(String[] args) {
        div(0.0,0.0);
        }

    public static void div(double a, double b){
        System.out.println(b/a);   }
}
/*
*
В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
Код метода div() изменять нельзя.

Требования:
•	В методе main() должен вызываться метод div().
•	Результатом вызова метода div() должен быть вывод в консоли "NaN".
•	Код метода div() не изменяй.*/