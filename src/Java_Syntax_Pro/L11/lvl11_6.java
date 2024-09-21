package Java_Syntax_Pro.L11;
/*
Кто тут наследник?
*/
public class lvl11_6 {}
class Solution {
    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar();
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
    }
}
class HybridCar extends Car {
    public HybridCar() {
        super("HybridCar");

    }
}
class Car {
    public Car(String type) {
        System.out.println("Привет. Я " + type);
    }
}
class GasCar extends Car {
    public GasCar() {
        super("GasCar");

    }
}
class ElectricCar extends Car {
    public ElectricCar() {
    super("ElectricCar");
    }
}

/*
Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя), используя super("тип автомобиля").
Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.

Вывод должен быть следующий (последовательность может быть любая):
Привет. Я ElectricCar
Привет. Я GasCar
Привет. Я HybridCar

Требования:
•	Классы ElectricCar, GasCar, HybridCar должны наследоваться от класса Car.+
•	Тело конструктора класса Car не изменяй.+
•	Наследники класса Car должны вызывать конструктор базового класса с соответствующим аргументом.
•	В методе main должно быть создано 3 объекта классов HybridCar, GasCar и ElectricCar.
•	Вывод должен соответствовать условию.
*/