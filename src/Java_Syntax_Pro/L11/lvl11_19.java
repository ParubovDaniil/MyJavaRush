package Java_Syntax_Pro.L11;
public class lvl11_19 {}
class Keyboard {
}
class SystemUnit {
}
class Mouse {
}
class Monitor {
}
class Computer {
    public Computer(){
        Keyboard keyboard = new Keyboard();
        SystemUnit systemUnit = new SystemUnit();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
    }

}
/*
Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь.
В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.

Требования:
•	В отдельных файлах должны быть публичные классы Computer, Keyboard, Monitor, Mouse, SystemUnit.
•	В конструкторе класса Computer нужно создать 4 объекта разных "комплектующих".
*/