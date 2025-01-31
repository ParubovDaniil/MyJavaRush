package Java_Syntax_Pro.L18;
/*
Питомцы бывают разные
*/

public class lvl18_7 {}

 class Solution7 {
    public static void main(String[] args) {
        Cat01 cat = new Cat01();
        cat.printInfo();
        Dog01 dog = new Dog01();
        dog.printInfo();
    }
}
class Pet1 {
    public void printInfo(){
        System.out.println("Я домашний питомец.");
    }
}
class Dog01 extends Pet1 {
        public static final String DOG = "Я люблю людей.";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
    //напишите тут ваш код
}
class Cat01 extends Pet1 {
    public static final String CAT = "Я не люблю людей.";
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(CAT);
    }
    //напишите тут ваш код
}


/*

Класс Pet является родительским классом для классов Cat и Dog.
В нем реализован метод printInfo(), который сообщает, что данный объект является питомцем.
В классах Cat и Dog переопредели метод printInfo(), дополнив его функционал следующим образом:

вначале вызови метод printInfo() родительского класса;
потом дополнительно выведи в консоли "Я не люблю людей" для класса Cat или "Я люблю людей" для класса Dog.
Пример вывода для класса Cat:
Я домашний питомец.
Я не люблю людей.

Пример вывода для класса Dog:
Я домашний питомец.
Я люблю людей.

Требования:
•	Метод printInfo() должен быть переопределен в классе Cat.
•	Метод printInfo() должен быть переопределен в классе Dog.
•	В методе printInfo() класса Cat должен вызываться printInfo() родительского класса.
•	В методе printInfo() класса Dog должен вызываться printInfo() родительского класса.
•	Метод printInfo() класса Cat должен выводить в консоли текст согласно условию.
•	Метод printInfo() класса Dog должен выводить в консоли текст согласно условию.*/