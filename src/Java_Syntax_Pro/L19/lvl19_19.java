package Java_Syntax_Pro.L19;

import java.util.Optional;
import java.util.stream.Stream;

/*
Самый дешевый автомобиль
*/
public class lvl19_19 {}

class Solution19 {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car6("Model S", 94_490),
                new Car6("Model 3", 50_690),
                new Car6("Model X", 99_690),
                new Car6("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car6("X5", 110_000),
                new Car6("X3", 54_000),
                new Car6("X1", 40_000),
                new Car6("X6", 125_000)
        );

        Optional<Car6> cheapestCar = getCheapestCar(tesla);
        cheapestCar.ifPresent(System.out::println);

        Optional<Car6> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
        cheaperCar.ifPresent(System.out::println);
    }

    public static Optional<Car6> getCheapestCar(Stream<Car6> cars) {
        //напишите тут ваш код
        return cars.min((s1, s2) -> Integer.compare(s1.getPrice(), s2.getPrice()));
    }

    public static Optional<Car6> getCheaperCar(Stream<Car6> cars, Car6 cheapestCar) {
        //напишите тут ваш код
        return cars.filter(car -> car.getPrice()<cheapestCar.getPrice()).findFirst();
    }
}

class Car6 {
    private String name;
    private Integer price;

    public Car6(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
/*
У автомобиля, представленного классом Car, есть две характеристики: название - поле name, цена - поле price.
В классе Solution выполняются две операции поиска:

метод getCheapestCar(Stream<Car>) ищет самый дешевый автомобиль в одном списке;
метод getCheaperCar(Stream<Car>, Car) в другом списке ищет автомобиль дешевле, чем полученный в методе getCheapestCar(Stream<Car>).
Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
Подсказка:
Для поиска элемента с минимальным искомым значением в потоке данных используй метод min(),
а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных данных используй метод findFirst().

Метод main() не принимает участие в тестировании.

Требования:
•	В публичном статическом методе getCheapestCar(Stream<Car>) нужно вызывать метод min() объекта типа Stream<Car>.
•	В публичном статическом методе getCheaperCar(Stream<Car>, Car) нужно вызывать метод findFirst() объекта типа Stream<Car>.
•	Метод getCheapestCar(Stream<Car>) нужно реализовать согласно условию.
•	Метод getCheaperCar(Stream<Car>, Car) нужно реализовать согласно условию.*/