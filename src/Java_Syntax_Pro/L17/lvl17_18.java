package Java_Syntax_Pro.L17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Простой шаблон
*/
public class lvl17_18 {}

 class Solution18 {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dateTimeFormatter.format(localDateTime);
        System.out.println(text);
    }
}
/*
В методе main выведи на экран переменную localDateTime в таком виде:
19.03.2020г. 5ч.4мин

Требования:
•	Метод main должен вывести в консоли значение переменной localDateTime согласно шаблону.*/