package Java_Syntax_Pro.L19;
import java.util.ArrayList;

/*
Две реализации одного интерфейса
*/
public class lvl19_1 {}

 class Solution1 {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        //напишите тут ваш код
        list.add(runnable);
    }

    public static void runList() {
        //напишите тут ваш код
        for (Runnable element: list)
            element.run();
    }
}
class Plane implements Runnable {

    @Override
    public void run() {
        System.out.println("Plane is running!");
    }
}
class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}
interface Runnable {
    void run();
}
/*
*
В интерфейсе Runnable объявлен метод run() и есть две его реализации: в классе Car и в классе Plane.
В классе Solution есть публичное статическое поле ArrayList<Runnable> list, а также два публичных статических метода:
addToList(Runnable), который добавляет в список list элемент, полученный в качестве входного параметра,
и метод runList(), который вызывает метод run() у каждого элемента списка list.
Твоя задача — реализовать эти методы.

Метод main() не участвует в тестировании.

Требования:
•	В публичном статическом методе void addToList(Runnable) нужно добавлять в список list элемент, полученный в качестве входящего параметра.
•	В публичном статическом методе void runList() нужно вызывать метод run() у каждого элемента списка list.*/