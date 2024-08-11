package Java_Syntax_Pro.L8;
/*
Бесконечность не предел
*/
public class lvl8_5 {
    public static void main(String[] args) {
        div(0,0000001);
        div(0,-0000001);
        //напишите тут ваш код
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
/*
*
В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
Код метода div() изменять нельзя.

Требования:
•	В методе main() метод div() должен вызываться 2 раза.
•	Результатом двух вызовов метода div() должен быть вывод в консоли "Infinity" и "-Infinity".
•	Код метода div() не изменяй.*/