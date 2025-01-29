package Java_Syntax_Pro.L18;
import java.util.ArrayList;

/*
Космическая одиссея ч.1
*/
public class lvl18_3 {}

class Solution3 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        //напишите тут ваш код
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());

    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
class Dog extends Astronaut {
    public String getInfo(){
        return "Собака";
    }
}
class Human extends Astronaut{
    public String getInfo(){
        return "Человек";
    }
}
class Cat extends Astronaut{
    public String getInfo(){
        return "Кот";
    }
}
class Astronaut {
    public String getInfo(){
        return "Неизвестный астронавт";
    }
}
/*
Перед тем, как космический корабль отправится бороздить просторы Вселенной,
необходимо пригласить на борт экипаж, который будет состоять из 2 людей, 1 собаки и 1 кота.
В методе createCrew() добавь необходимое количество экземпляров соответствующих классов в список astronauts.

Подсказка:
Чтобы добавить объекты разных классов в один список, им нужен общий предок. Унаследуй интересующие тебя классы от Astronaut. Кто угодно может стать исследователем космоса :)

Требования:
•	Классы Human, Dog и Cat должны наследоваться от Astronaut.
•	В список astronauts должно быть добавлено два объекта типа Human.
•	В список astronauts должен быть добавлен один объект типа Dog.
•	В список astronauts должен быть добавлен один объект типа Cat.*/