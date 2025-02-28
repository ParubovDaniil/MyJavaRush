package Java_Syntax_Pro.L24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl24_13 {
}

/*
User, Loser, Coder and Proger
*/

class Solution13 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while ((key = reader.readLine()) != null) {
            if (key.isEmpty()) {
                break;
            }
            if (!(key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"))) {
                break;
            }
            {
                //создаем объект, пункт 2
                switch (key) {
                    case "user":
                        doWork(new Person.User());
                        break;
                    case "loser":
                        doWork(new Person.Loser());
                        break;
                    case "coder":
                        doWork(new Person.Coder());
                        break;
                    case "proger":
                        doWork(new Person.Proger());
                        break;
                }
                //вызываем doWork

            }
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }
        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}

interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }

}
/*
* Давай напишем программу, которая определит, чем заняться тому или иному человеку.
Для этого нужно:

Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
Для каждой введенной строки нужно:
Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
Передать этот объект в метод doWork.
Написать реализацию метода doWork, который:
Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
Вызывает метод doNothing(), если person имеет тип Loser.
Вызывает метод writeCode(), если person имеет тип Coder.
Вызывает метод enjoy(), если person имеет тип Proger.
Требования:
•	Метод main должен считывать строки с клавиатуры.
•	Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не совпадает с одной из ожидаемых (user, loser, coder, proger).
•	Для каждой корректной (user, loser, coder, proger) введенной строки должен быть вызван метод doWork с соответствующим объектом класса Person в качестве параметра.
•	В классе Solution должен быть реализован метод doWork с одним параметром типа Person.
•	Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
•	Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
•	Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
•	Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.*/