package Java_Syntax_Pro.L11;
/*
Построим новый жилой комплекс JavaRush Towers
*/
public class lvl11_2 {
}
class Skyscrapers {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public Skyscrapers(){
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Skyscrapers(int i){
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT+i);
    }
    public Skyscrapers(String str){
        System.out.print(SKYSCRAPER_WAS_BUILD_DEVELOPER+str);
    }
        public static void main(String[] args) {
            Skyscrapers skyscraper = new Skyscrapers();
            Skyscrapers skyscraperTower = new Skyscrapers(50);
            Skyscrapers skyscraperSkyline = new Skyscrapers("JavaRushDevelopment");
    }
}
/*
* Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
Объявляет о результате постройки.
Объявляет о результате и указывает количество этажей.
Объявляет о результате и указывает застройщика.
Пример вывода:
Небоскреб построен.
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment
Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.
Требования:
•	В классе Skyscraper должно быть три публичных конструктора.
•	В классе Skyscraper должен быть конструктор без параметров.
•	В классе Skyscraper должен быть конструктор с параметром типа int.
•	В классе Skyscraper должен быть конструктор с параметром типа String.
•	В конструкторе без параметров вывод должен соответствовать примеру из условия.
•	В конструкторе с параметром типа int вывод должен соответствовать примеру из условия.
•	В конструкторе с параметром типа String вывод должен соответствовать примеру из условия.
*/