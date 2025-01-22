package Java_Syntax_Pro.L17;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Чиним формат
*/
public class lvl17_3 {}



class Solution3 {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}
/*
Исправь ошибку, чтобы программа вывела "2010-01-06".
Инициализацию переменной date не меняй.

Требования:
•	Программа должна вывести: 2010-01-06
•	Должна быть исправлена одна ошибка.
*/