package Java_Syntax_Pro.L11;

public class lvl11_17 {}

class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(5);
        Antarctica antarctica = new Antarctica(5);
        Australia australia = new Australia(5);
        Eurasia eurasia = new Eurasia(5);
        NorthAmerica northAmerica = new NorthAmerica(5);
        SouthAmerica southAmerica = new SouthAmerica(5);

    }
}
class Africa{
    private final int area;

    public Africa(int area) {
        this.area = area;
    }
}
class Antarctica{
    private final int area;

    public Antarctica(int area) {
        this.area = area;
    }
}
class Australia{
    public Australia(int area) {
        this.area = area;
    }

    private final int area;

}
class Eurasia{
    public Eurasia(int area) {
        this.area = area;
    }

    private final int area;

}
class NorthAmerica{
    private final int area;

    public NorthAmerica(int area) {
        this.area = area;
    }
}
class SouthAmerica{
    public SouthAmerica(int area) {
        this.area = area;
    }

    private final int area;

}
/*
Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс. В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.

Требования:
•	В отдельных файлах создай публичные классы Africa, Antarctica, Australia, Eurasia, NorthAmerica, SouthAmerica.
•	В каждом из созданных классов должно быть private final int поле area.
•	В каждом из созданных классов должен быть публичный конструктор с аргументом типа int, который будет инициализировать поле area.
•	В методе main класса Earth создай 6 разных материков и передай в них значения площадей.

*/