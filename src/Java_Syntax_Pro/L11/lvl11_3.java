package Java_Syntax_Pro.L11;
public class lvl11_3 { }
class Skyscraperss {
    private int floorsCount;
    private String developer;

    public Skyscraperss(){
        floorsCount = 5;
        developer = "JavaRushDevelopment";
    }
    public Skyscraperss(int floorsCount,String developer){
        this.floorsCount = floorsCount;
        this.developer = developer;
    }
    public static void main(String[] args) {
        Skyscraperss skyscraper = new Skyscraperss();
        Skyscraperss skyscraperUnknown = new Skyscraperss(50, "Неизвестно");
    }
}
/*
Давай построим бизнес-центр, который состоит из двух зданий, один из которых только начинаем строить, а второй — на этапе планирования, поэтому о нем мало что известно.
Тебе нужно будет создать два конструктора: один с параметрами, второй — без. Они оба должны инициализировать поля floorsCount и developer.

Требования:
•	В классе Skyscraper должно быть два публичных конструктора.+
•	В классе Skyscraper должен быть конструктор без параметров.+
•	В классе Skyscraper должен быть конструктор с параметрами типа int и типа String.+
•	В классе Skyscraper должно быть приватное не статическое поле типа int с названием floorsCount.+
•	В классе Skyscraper должно быть приватное не статическое поле типа String с названием developer.+
•	В конструкторе без параметров поля должны инициализироваться значениями "5" и "JavaRushDevelopment".
•	В конструкторе c параметрами поля должны инициализироваться аргументами этого конструктора.
* */