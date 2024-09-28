package Java_Syntax_Pro.L13;

public class lvl13_1 {
}
class Solution1 {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Byte byteValueBox = new Byte(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer intValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);
    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);
    Character charValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
/*
Автоупаковка
*/
/*
В классе Solution представлены 8 переменных примитивных типов с именами вида типValue.
Для каждой из этих переменных необходимо создать объекты-обертки и присвоить им имена вида типValueBox.
Для создания объектов-оберток используй метод Тип.valueOf(примитив).

Пример переменной объекта-обертки: Integer integerValueBox = ....;

Требования:
•	В классе Solution должны быть 8 переменных примитивных типов данных с именами вида типValue.
•	В классе Solution должны быть 8 объектов типа класс-обертка примитивного типа с именами вида типValueBox.
•	При создании объектов-оберток должны использоваться существующие переменные примитивных типов и метод Тип.valueOf(примитив).*/