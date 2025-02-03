package Java_Syntax_Pro.L19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
Будущее за электрокарами
*/

public class lvl19_13 {}


class Solution13 {

    public static void main(String[] args) {
        var cars = new ArrayList<Car1>();
        Collections.addAll(cars,
                new Car1("Range Rover", false),
                new Car1("Model S", true),
                new Car1("Navigator", false),
                new Car1("Model 3", true),
                new Car1("Camaro", false),
                new Car1("Escalade", false),
                new Car1("Mustang", false),
                new Car1("Model X", true),
                new Car1("X5", false),
                new Car1("Model Y", true));

        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }

    public static Stream<Car1> onlyElectricCars(ArrayList<Car1> cars) {
        //напишите тут ваш код

        return cars.stream()
                .filter(Car1::isElectric);
    }
}
class Car1 {
    private String model;
    private boolean isElectric;

    public Car1(String model, boolean isElectric) {
        this.model = model;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Car " + model + ", electric - " + isElectric;
    }
}
/*Современный мир отказывается от двигателей внутреннего сгорания, и эра электрокаров не за горами.
Нужно, чтобы наша программа могла отфильтровать электрокары от всех остальных автомобилей.
Для этих целей есть метод onlyElectricCars(ArrayList<Car>), который фильтрует список автомобилей,
получаемых в качестве входящего параметра. Этот метод возвращает поток отфильтрованных данных,
 а именно — поток автомобилей, у которых поле isElectric равно true. В этом тебе поможет метод filter() объекта типа Stream<Car>.

Метод main() не принимает участие в тестировании.

Требования:
•	В публичном статическом методе onlyElectricCars(ArrayList<Car>) нужно вызывать метод filter() объекта типа Stream<Car>.
•	Нужно, чтобы метод onlyElectricCars(ArrayList<Car>) возвращал поток электрокаров.*/