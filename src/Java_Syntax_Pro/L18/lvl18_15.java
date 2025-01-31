package Java_Syntax_Pro.L18;

import java.util.ArrayList;
import java.util.List;

/*
Вилларибо и Виллабаджо.
*/
public class lvl18_15 {
}

interface MusicalInstrument {
    void play();
}

class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет гитара.");
    }
}

class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет орган.");
    }
}

class Violin implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет скрипка.");
    }
}

class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет пианино.");
    }
}

class Solution15 {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        //напишите тут ваш код
        for (MusicalInstrument m :
                orchestra) {
            m.play();

        }
    }
}

/*
В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.

Для этого:

в методе createKeyboardOrchestra() добавь в список orchestra один орган и три пианино;
в методе createStringedOrchestra() добавь в список orchestra две скрипки и одну гитару;
метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.
Требования:
•	Метод createKeyboardOrchestra() должен добавлять в список orchestra один объект класса Organ и три объекта Piano.
•	Метод createStringedOrchestra() должен добавлять в список orchestra два объекта класса Violin и один объект Guitar.
•	Метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.*/