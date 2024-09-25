package Java_Syntax_Pro.L12;
/*
Солнечная система — наш дом
*/
public class lvl12_1 {
}
class Solution {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около "+solarSystem.age+" лет.");
        System.out.println("В Солнечной системе "+solarSystem.planetsCount+" известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из "+solarSystem.starsCount+" звезды.");
        System.out.println("Звезды по имени "+solarSystem.starName+".");
        System.out.println("Расстояние к центру галактики составляет "+solarSystem.galacticCenterDistance+" световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
class SolarSystem {

    public static long age = 4_568_200_000L;

    public static int planetsCount = 8;

    public static int starsCount = 1;

    public static String starName = "Солнце";

    public static int galacticCenterDistance = 27170;


}
/*
Программа выводит на экран основные факты о Солнечной системе.
Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem, но результат работы программы при этом не изменился.

Ожидаемый вывод:
Человечество живет в Солнечной системе.
Ее возраст около 4568200000 лет.
В Солнечной системе 8 известных планет.
Как и большинство звездных систем, состоит из 1 звезды.
Звезды по имени Солнце.
Расстояние к центру галактики составляет 27170 световых лет.
Каждый обитатель Солнечной системы должен знать эту информацию!

Требования:
•	Программа должна выводить на экран текст, указанный в примере.
•	При выводе текста нужно использовать все переменные класса SolarSystem.
*/