package Java_Syntax_Pro.L25.lvl25_17;

import java.util.HashMap;
import java.util.Map;


/*
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static{
        labels.put(1.0,"Misha");
        labels.put(2.0,"Misha");
        labels.put(3.0,"Misha");
        labels.put(4.0,"Misha");
        labels.put(5.0,"Misha");
    }
}
/*
В статическом блоке инициализируй labels пятью различными парами ключ-значение.

Требования:
•	В классе Solution должен быть только один метод — main().
•	В классе Solution должно быть объявлено статическое поле labels типа Map.
•	Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
•	Метод main должен выводить содержимое labels на экран.*/