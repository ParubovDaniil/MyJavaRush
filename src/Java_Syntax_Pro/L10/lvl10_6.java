package Java_Syntax_Pro.L10;

/*
Двоичный конвертер
*/
public class lvl10_6 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }
//1111111111111111111111111111111
    public static String toBinary(int decimalNumber) {
        String binaryNumb = "";
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                binaryNumb = (decimalNumber % 2) + binaryNumb;
                decimalNumber = decimalNumber / 2;
            }
            return binaryNumb;
        }
        return "";
    }
    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()){
            return 0;
        }else{
        int decimalNumber = 0;
        char rightBitChar = 0;
        int rightBit = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            rightBitChar = binaryNumber.charAt(binaryNumber.length() - i - 1);
            rightBit = Character.getNumericValue(rightBitChar);
            decimalNumber = decimalNumber + rightBit * ((int)Math.pow(2,i));
        }
        return decimalNumber;
    }}
}
/*
* Публичный статический метод toBinary(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в двоичную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления двоичного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в представление двоичного числа следующий:
while(десятичное число не равно 0) {
двоичное представление = остаток от деления десятичного числа на 2 + двоичное представление
десятичное число = десятичное число / 2
}

Один из алгоритмов перевода представления двоичного числа в десятичное число следующий:
for (int i = 0; i < длины двоичного представления; i++) {
десятичное число = десятичное число + число из двоичного представления * на 2 в степени i
}

Изначально берется крайнее правое число из двоичного представления. С каждой итерацией цикла берется следующее число ближе к началу двоичного представления.

Подсказка: чтобы возвести число к степени можно использовать метод Math.pow(число, степень).
Метод main() не принимает участие в тестировании.

Требования:
•	Нужно, чтобы метод toBinary(int) был реализован согласно условию.
•	Нужно, чтобы метод toDecimal(String) был реализован согласно условию.
•	Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
•	Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
•	Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
•	Объект типа BigInteger использовать нельзя.
•	Объект типа BigDecimal использовать нельзя.*/