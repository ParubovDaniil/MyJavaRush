package Java_Syntax_Pro.L11;
/*
Создадим небоскреб
*/
public class lvl11_1 {}
class Skyscraper {
    public Skyscraper(){
        System.out.print("Небоскреб построен.");
    }
    public static void main(String[] args) {
        Skyscraper Skyscraper = new Skyscraper();
    }
}
/*
* Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
* Для этого тебе нужно вызвать конструктор класса Skyscraper в методе main и в теле конструктора вывести в консоль текст "Небоскреб построен.".

Требования:
•	В классе Skyscraper должен быть публичный конструктор без параметров.
•	В методе main тебе нужно создать один объект класса Skyscraper.
•	В конструкторе класса Skyscraper должен выводиться текст "Небоскреб построен." в консоль.*/