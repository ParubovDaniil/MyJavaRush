package Java_Syntax_Pro.L24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class lvl24_6 {}

/*
Коты
*/

class Solution6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            if (string.isEmpty()){
                break;
            }
            System.out.println(CatFactory.getCatByKey(string));
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}

/*
*
Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
Для этого нужно:

Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
Для каждого параметра (имени кота):
создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
вывести на экран cat.toString().
Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные после ввода пустой строки.
•	Программа должна выводить на экран описание каждого кота (cat.toString).
•	Программа должна создавать объект класса Cat для каждого введенного имени кота (строки, считанной с клавиатуры) c помощью метода getCatByKey.*/