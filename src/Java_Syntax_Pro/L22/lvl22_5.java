package Java_Syntax_Pro.L22;

public class lvl22_5 {
}

/*
Определимся с животным
*/

class Solution5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cow) {
            return "Корова";
        } else if (o instanceof Dog) {
            return "Собака";

        } else if (o instanceof Whale) {
            return "Кит";

        } else if (o instanceof Pig) {
            return "Неизвестное животное";

        }else
        return "Неизвестное животное";

    }


    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}

/*
*
Напиши метод, который определяет, объект какого класса ему передали,
* и возвращает результат: одно из значений — «Корова», «Кит», «Собака», «Неизвестное животное».

Требования:
•	Программа должна выводить текст на экран.
•	В классе Solution должен быть статический класс Cow.
•	В классе Solution должен быть статический класс Dog.
•	В классе Solution должен быть статический класс Whale.
•	В классе Solution должен быть статический класс Pig.
•	Метод getObjectType() должен возвращать одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное"
в зависимости от переданного объекта. Например, "Корова" для объектов типа Solution.Cow.*/