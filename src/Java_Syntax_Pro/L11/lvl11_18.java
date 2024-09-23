package Java_Syntax_Pro.L11;

public class lvl11_18 {}
class Solutio {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }


}
/*
В классе Coordinate есть 2 геттера и 2 сеттера, но значения переменным сеттеры не устанавливают.
Разберись, почему так происходит и исправь. Метод main не участвует в проверке.

Требования:
•	В классе Coordinate должно быть два приватных не статических поля x, y типа int.
•	В классе Coordinate должен быть геттер getX для поля x.
•	В классе Coordinate должен быть геттер getY для поля y.
•	В классе Coordinate должен быть сеттер setX(int) для поля x.
•	В классе Coordinate должен быть сеттер setY(int) для поля y.
•	Сеттеры должны инициализировать соответствующие поля.
*/