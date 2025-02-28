package Java_Syntax_Pro.L24;

public class lvl24_5 {}

/*
Building и School
*/

class Solution5 {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School
        return new School();
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        return new Building();
    }

    static class School extends Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
/*
* В этой задаче тебе нужно:

Правильно расставить наследование между Building (здание) и School (здание школы).
Подумать, объект какого класса должны возвращать методы getSchool и getBuilding.
Изменить null на объект класса Building или School.
Сигнатуры методов getSchool() и getBuilding() не меняй.

Требования:
•	Класс School должен наследоваться от класса Building.
•	Метод getSchool() должен возвращать новую школу (School).
•	Метод getBuilding() должен возвращать новое здание (Building).
•	Класс School должен быть статическим.
•	Класс Building должен быть статически*/