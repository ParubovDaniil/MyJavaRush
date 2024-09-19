package Java_Syntax_Pro.L10;
/*
Двоично-шестнадцатеричный конвертер
*/
public class lvl10_8 {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        } else {
            // Проверка на символы меньше 0 или больше 1
            char[] charArray = binaryNumber.toCharArray();
            for (int i = 0; i < binaryNumber.length(); i++) {
                if (charArray[i] != '1' && charArray[i] != '0') {
                    return "";
                }
            }
            // Проверка на символы меньше 0 или больше 1

            // Добавляем 0
            int lengthParametr = binaryNumber.length();
            int remainder = binaryNumber.length() % 4;
            if (lengthParametr % 4 != 0) {
                if (remainder == 1) {
                    binaryNumber = "000" + binaryNumber;
                } else if (remainder == 2) {
                    binaryNumber = "00" + binaryNumber;
                } else if (remainder == 3) {
                    binaryNumber = "0" + binaryNumber;
                }
            }
            // Добавляем 0

            //Перевожу в десятичную
            int decimalNumber = 0;
            char rightBitChar = 0;
            int rightBit = 0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                rightBitChar = binaryNumber.charAt(binaryNumber.length() - i - 1);
                rightBit = Character.getNumericValue(rightBitChar);
                decimalNumber = decimalNumber + rightBit * ((int) Math.pow(2, i));
            }
            //Перевожу в десятичную

            //Перевожу в шестнадцатиричную
            String HEX = "0123456789abcdef";
            String hexaDecimal = "";//4e8
            while (decimalNumber != 0) {
                hexaDecimal = HEX.charAt(decimalNumber % 16) + hexaDecimal;
                decimalNumber = decimalNumber / 16;//78 4
            }
            return hexaDecimal;
            // Перевожу в шестнадцатиричную
        }
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        } else {
            // Проверка на символы кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре)
            char[] charArray = hexNumber.toCharArray();
            for (int i = 0; i < hexNumber.length(); i++) {
                if (charArray[i] != '0' && charArray[i] != '1' && charArray[i] != '2' && charArray[i] != '3' && charArray[i] != '4'
                        && charArray[i] != '5' && charArray[i] != '6' && charArray[i] != '7' && charArray[i] != '8' && charArray[i] != '9'
                        && charArray[i] != 'a' && charArray[i] != 'b' && charArray[i] != 'c' && charArray[i] != 'd' && charArray[i] != 'e'
                        && charArray[i] != 'f') {
                    return "";
                }
            }
            // Проверка на символы кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре)

            //Перевод в десятичную систему
            String HEX = "0123456789abcdef";
            int decimalNumber = 0;
            for (int i = 0; i < hexNumber.length(); i++) {
                decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
            }
            if (decimalNumber == 0) {
                return "0";  // Возврат "0", если входной hex был "0"
            }
            String binaryNumb = "";
            if (decimalNumber > 0) {
                while (decimalNumber != 0) {
                    binaryNumb = (decimalNumber % 2) + binaryNumb;
                    decimalNumber = decimalNumber / 2;
                }
            }
            return binaryNumb;
        }
    }
}
/*
*
Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа, полученное в качестве входящего параметра,
из двоичной системы счисления в шестнадцатеричную и возвращать его строковое представление.
А публичный статический метод toBinary(String) наоборот — из строкового представления шестнадцатеричного числа в строковое представление двоичного числа.
Методы работают только с не пустыми строками.
Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.
Если входящий параметр метода toBinary(String) содержит любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.
Твоя задача — реализовать эти методы.
Один из алгоритмов перевода строкового представления двоичного числа в строковое представление шестнадцатеричного числа следующий:
Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
Если это не так, то добавляем нужное количество 0 в начало строки.
Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
Например:
двоичное представление — "100111010000", где "1001" — "9", "1101" — "d", "0000" — "0",
шестнадцатеричное представление — "9d0".
Один из алгоритмов перевода строкового представления шестнадцатеричного числа в строковое представление двоичного числа следующий:
Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.
Например:
шестнадцатеричное представление — "9d0", где "9" — "1001", "d" — "1101", "0" — "0000",
двоичное представление — "100111010000".
Метод main() не принимает участие в тестировании.
Требования:
•	Нужно, чтобы метод toHex(String) был реализован согласно условию.
•	Нужно, чтобы метод toBinary(String) был реализован согласно условию.
•	Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
•	Методы Integer.toHexString(int) и Long.toHexString(int) использовать нельзя.
•	Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
•	Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
•	Объект типа BigInteger использовать нельзя.
•	Объект типа BigDecimal использовать нельзя.*/