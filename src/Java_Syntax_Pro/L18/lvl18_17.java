package Java_Syntax_Pro.L18;

public class lvl18_17 {}
class Aircraft implements Flyable1 {
    @Override
    public int getMaxSpeed() {
        return 1200;
    }
}
class Eagle implements Flyable1 {
    @Override
    public int getMaxSpeed() {
        return 180;
    }
}
class Raven implements Flyable1 {
    @Override
    public int getMaxSpeed() {
        return 48;
    }
}
interface Flyable1 {
      int getMaxSpeed();
}

/*
Классы Eagle (Орел), Raven (Ворон) и Aircraft (Самолет) имплементируют интерфейс Flyable,
который содержит дефолтную реализацию метода int getMaxSpeed() и возвращает значение 80.
Такая реализация неправильная, так как реальная максимальная скорость Орла — 180 км/ч, Ворона — 48, а самолета — 1200.

Тебе нужно убрать дефолтную реализацию метода getMaxSpeed() из интерфейса Flyable (сам метод нужно оставить) и имплементировать его в каждом из классов.
Для каждого класса укажи правильное значение максимальной скорости.

Требования:
•	Метод int getMaxSpeed() интерфейса Flyable не должен быть default.
•	Метод int getMaxSpeed() класса Eagle должен возвращать 180.
•	Метод int getMaxSpeed() класса Raven должен возвращать 48.
•	Метод int getMaxSpeed() класса Aircraft должен возвращать 1200.*/