package Java_Syntax_Pro.L12;
/*
Земля: техническая характеристика
*/
public class lvl12_2 {
}
class Planet {

    public  String name;

    public  long age;

    public  int speed;

    public  int area;

    public void printInformation() {
        System.out.println("Имя планеты: " + name + ".");
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Орбитальная скорость: " + speed + " км/ч.");
        System.out.println("Общая площадь: " + area + " кв. км.");
    }
}
class Solution2 {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
/*
* Сделай все переменные класса Planet не статическими.
После этого внеси необходимые правки в метод main.

Требования:
•	Все переменные класса Planet должны быть не статическими.
•	В методе main должны присваиваться значения всем переменным объекта Planet earth.*/