package Java_Syntax_Pro.L19;

import java.util.Optional;
import java.util.stream.Stream;

/*
Самый дорогой автомобиль
*/
public class lvl19_18 {
}

class Solution18 {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car5("Model S", 94_490),
                new Car5("Model 3", 50_690),
                new Car5("Model X", 99_690),
                new Car5("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car5("X5", 110_000),
                new Car5("X3", 54_000),
                new Car5("X7", 143_000),
                new Car5("X6", 125_000)
        );

        Optional<Car5> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car5> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car5> getMostExpensiveCar(Stream<Car5> cars) {
        //напишите тут ваш код
        return cars.max((s1, s2) -> Integer.compare(s1.getPrice(), s2.getPrice()));
    }

    public static Optional<Car5> getMoreExpensiveCar(Stream<Car5> cars, Car5 mostExpensiveCar) {
        //напишите тут ваш код
        Stream stream = cars.filter(car5 -> car5.getPrice() > mostExpensiveCar.getPrice());
        return stream.findFirst();
    }
}
/*
*     public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
        return cars.max((car1, car2) -> car1.getPrice() - car2.getPrice());
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice()).findFirst();
    }
}*/

class Car5 {
    private String name;
    private Integer price;

    public Car5(String name, Integer price) {
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

метод getMostExpensiveCar(Stream<Car>) ищет самый дорогой автомобиль в одном списке;
метод getMoreExpensiveCar(Stream<Car>, Car) в другом списке ищет автомобиль дороже, чем полученный в методе getMostExpensiveCar(Stream<Car>).
Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
Подсказка:
Для поиска элемента с максимальным искомым значением в потоке данных используй метод max(),
а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных данных используй метод findFirst().

Метод main() не принимает участие в тестировании.

Требования:
•	В публичном статическом методе getMostExpensiveCar(Stream<Car>) нужно вызывать метод max() объекта типа Stream<Car>.
•	В публичном статическом методе getMoreExpensiveCar(Stream<Car>, Car) нужно вызывать метод findFirst() объекта типа Stream<Car>.
•	Метод getMostExpensiveCar(Stream<Car>) нужно реализовать согласно условию.
•	Метод getMoreExpensiveCar(Stream<Car>, Car) нужно реализовать согласно условию.*/