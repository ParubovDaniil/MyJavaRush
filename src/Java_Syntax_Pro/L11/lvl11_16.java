package Java_Syntax_Pro.L11;

public class lvl11_16 {}

class Solutions {// НЕ ЗАБУДЬ

    public static void showWeather(City city) {
        System.out.println("В городе "+city.getName()+" сегодня температура воздуха "+ city.getTemperature());
    }

    public static void main(String[] args) {
    City city = new City("Дубай",2);
    showWeather(city);
    }
}
class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}
/*
У класса City есть два поля - название города и текущая температура воздуха.
Также в классе Solution есть метод showWeather: он выводит в консоли информацию о погоде в городе,
который передан в качестве аргумента метода. Реализуй метод showWeather, который должен выводить в консоли информацию в таком формате:
В городе "название города" сегодня температура воздуха "температура в городе"
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

Пример вывода:
В городе Дубай сегодня температура воздуха 40

Требования:
•	Не изменяй класс City.
•	В классе Solution должен быть метод showWeather с параметром City.
•	Метод showWeather должен использовать геттеры класса City.
•	Метод showWeather должен выводить текст в консоли в соответствии условию.*/