package Java_Syntax_Pro.L18;

public class lvl18_1 {}

class Solution1 {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.move();
    }
}
class Animal {
    public void move(){
        System.out.println("Я бегу!");
    }
}
/*
Правильное движение
*/

class Bat extends Animal {
    //напишите тут ваш код
    @Override
    public void move(){
        System.out.println("Я лечу!");
    }
}
/*
* Класс Bat (летучая мышь) унаследован от класса Animal. Все логично, вот только при вызове метода move() у объекта класса Bat выведется в консоли "Я бегу!".
Зачем бежать, если ты умеешь летать?
Переопредели метод move() для класса Bat, чтобы он выводил в консоли "Я лечу!".
Метод main() в тестировании участия не принимает.

Требования:
•	Класс Animal не изменяй.
•	Класс Bat должен быть унаследован от Animal.
•	В классе Bat должен быть переопределен метод move().
•	Вызов метода move() у объекта класса Bat должен выводить в консоли "Я лечу!".*/