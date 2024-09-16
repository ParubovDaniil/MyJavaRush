package Java_Syntax_Pro.L9;
/*
Степень двойки
*/

public class lvl9_13 {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }
    }
}
/*
* Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
Требования:
•	В методе getPowerOfTwo(int) необходимо возвращать степень двойки.
•	В методе getPowerOfTwo(int) должен использоваться оператор побитового сдвига влево.
* */