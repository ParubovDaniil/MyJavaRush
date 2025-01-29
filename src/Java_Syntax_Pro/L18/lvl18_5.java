package Java_Syntax_Pro.L18;

import java.util.ArrayList;

/*
Космическая одиссея ч.3
*/
public class lvl18_5 {}

class Solution5 {
    public static ArrayList<Astronaut2> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        //напишите тут ваш код
        for (Astronaut2 a2 :
                astronauts) {
            if (a2 instanceof Human2){
                pilot((Human2) a2);
            } else if (a2 instanceof Dog2) {
                createDirection((Dog2) a2);
            } else if (a2 instanceof Cat2) {
                research((Cat2) a2);
            }
        }
    }

    public static void pilot(Human2 human) {
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog2 dog) {
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat2 cat) {
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human2());
        astronauts.add(new Human2());
        astronauts.add(new Dog2());
        astronauts.add(new Cat2());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut2 astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
class Dog2 extends Astronaut2 {
    public String getInfo() {
        return "Собака";
    }
}
class Human2 extends Astronaut2 {
    public String getInfo() {
        return "Человек";
    }
}
class Cat2 extends Astronaut2 {
    public String getInfo() {
        return "Кот";
    }
}
class Astronaut2 {
    public String getInfo() {
        return "Неизвестный астронавт";
    }
}

/*
Сделаем наш предыдущий пример более правильным и универсальным.
Порядок, в котором добавляются астронавты в список astronauts, не всегда будет известен.
Чтобы правильно распределить задачи членам экипажа, необходимо определить, кем является астронавт.
Для этого в методе runWorkingProcess() перебери всех астронавтов в цикле, используя оператор instanceof определи,
кем является астронавт и передай его в качестве аргумента соответствующему методу:
Human — в метод pilot(Human human);
Dog — в метод createDirection(Dog dog);
Cat — в метод research(Cat cat).

Метод runWorkingProcess() должен работать корректно независимо от количества астронавтов и порядка их добавления в astronauts.

Требования:
•	Метод runWorkingProcess() должен вызывать pilot(Human human) для каждого объекта Human из списка astronauts.
•	Метод runWorkingProcess() должен вызывать createDirection(Dog dog) для каждого объекта Dog из списка astronauts.
•	Метод runWorkingProcess() должен вызывать research(Cat cat) для каждого объекта Cat из списка astronauts.*/