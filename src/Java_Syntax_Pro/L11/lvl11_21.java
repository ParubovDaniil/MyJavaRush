package Java_Syntax_Pro.L11;

public class lvl11_21 {}

class Cara {
    private String model;
    private int year;
    private String color;

    public void initialize(String mod, int ye, String col) {
        this.model = mod;
        this.year = ye;
        this.color = col;
    }

    public static void main(String[] args) {
        Cara car = new Cara();
        car.initialize("Космич", 1970, "красный");
    }
}
/*
* Давай создадим каталог новых моделей авто у нас на производстве.
Для этого нам нужно создать один метод initialize,
который будет инициализировать такие поля объекта типа Car: модель, год выпуска, цвет.

Требования:
•	В классе Car должно быть приватное поле model типа String.
•	В классе Car должно быть приватное поле year типа int.
•	В классе Car должно быть приватное поле color типа String.
•	В классе Car не нужно объявлять какие-либо конструкторы.
•	В классе Car должен быть не статический метод public void initialize с параметрами типа String, int, String.
•	Инициализация полей model, year, color должна производиться в методе initialize(String model, int year, String color)*/