package Java_Syntax_Pro.L24;

public class lvl24_15 {}

/*
Computer
*/

class Solution15 {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }
}
interface CompItem{
    String getName();
}
class Keyboard implements CompItem{
    @Override
    public String getName() {
        return "Keyboard";
    }
}
class Mouse implements CompItem{
    @Override
    public String getName() {
        return "Mouse";
    }
}
class Monitor implements CompItem{
    @Override
    public String getName() {
        return "Monitor";
    }
}
class Computer{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}

/*
* Давай соберем компьютер. Вот что тебе нужно сделать:

Создай интерфейс CompItem.
Добавь в него метод String getName().
Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
Создай класс Computer.
В класс Computer добавь приватное поле keyboard типа Keyboard.
В класс Computer добавь приватное поле mouse типа Mouse.
В класс Computer добавь приватное поле monitor типа Monitor.
Создай конструктор с тремя параметрами в классе Computer используя комбинацию клавиш Alt+Insert (для Windows) внутри класса (команда Constructor).
Внутри конструктора инициализируйте все три поля (переменных) класса в соответствии с переданными параметрами.
Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert (для Windows) и выбери команду Getter).
Все созданные классы и интерфейс должны быть в отдельных файлах.
Требования:
•	Интерфейс CompItem должен существовать в отдельном файле.
•	В интерфейсе CompItem должен быть объявлен метод getName() с типом возвращаемого значения String и без параметров.
•	Классы Keyboard, Monitor и Mouse должны реализовывать интерфейс CompItem, а также существовать в отдельных файлах.
•	Метод getName в классах, реализующих интерфейс CompItem, должен возвращать простое имя класса, например, "Keyboard" для класса Keyboard.
•	Класс Computer должен содержать по одному приватному полю типа Keyboard, Mouse, Monitor, а также существовать в отдельном файле.
•	Конструктор класса Computer должен принимать 3 параметра (keyboard, mouse, monitor) и корректно инициализировать соответствующие поля класса.
•	Для полей keyboard, mouse и monitor Computer должны быть созданы геттеры (getKeyboard, getMouse, getMonitor), которые будут возвращать соответствующие поля класса Computer.*/