package Java_Syntax_Pro.L18;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Космическая одиссея ч.2
*/

public class lvl18_4 {}
class Solution4 {
    public static ArrayList<Astronaut1> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        //напишите тут ваш код
       pilot((Human1) astronauts.get(0));
       pilot((Human1) astronauts.get(1));
       createDirection((Dog1) astronauts.get(2));
       research((Cat1) astronauts.get(3));
    }

    public static void pilot(Human1 human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog1 dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat1 cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human1());
        astronauts.add(new Human1());
        astronauts.add(new Dog1());
        astronauts.add(new Cat1());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut1 astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
class Dog1 extends Astronaut1 {
    public String getInfo() {
        return "Собака";
    }
}
class Human1 extends Astronaut1 {
    public String getInfo() {
        return "Человек";
    }
}
class Cat1 extends Astronaut1 {
    public String getInfo() {
        return "Кот";
    }
}
class Astronaut1 {
    public String getInfo() {
        return "Неизвестный астронавт";
    }
}
/*
Все члены экипажа космического корабля находятся на борту, корабль успешно вышел в открытый космос.
Команде пора приступить к выполнению своих обязанностей:
Людям — пилотировать корабль, Собаке — заниматься навигацией, а Коту — исследовать открытый космос.

Распредели обязанности членов экипажа в методе runWorkingProcess().

Для этого достань из списка astronauts всех людей (ты знаешь, под какими индексами они находятся) и передай их в качестве аргументов методу pilot(Human human), собаку передай в метод createDirection(Dog dog), а кота — в метод research(Cat cat).
Другие методы не изменяй.

Подсказка:
Список astronauts содержит объекты типа Astronaut. Чтобы вызвать методы pilot(), createDirection() и research(), сначала объект Astronaut нужно привести к правильному типу.

Требования:
•	Метод runWorkingProcess() должен вызывать pilot(Human human) 2 раза. В качестве аргументов передать все объекты типа Human из списка astronauts.
•	Метод runWorkingProcess() должен вызывать createDirection(Dog dog) 1 раз. В качестве аргумента передать объект типа Dog из списка astronauts.
•	Метод runWorkingProcess() должен вызывать research(Cat cat) 1 раз. В качестве аргумента передать объект типа Cat из списка astronauts.*/