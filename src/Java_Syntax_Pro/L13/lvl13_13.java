package Java_Syntax_Pro.L13;
import java.util.ArrayList;

/*
Солнечная система
*/
public class lvl13_13 {}

class  Solution13 {
        public static ArrayList<String> planets = new ArrayList<>();

        public static void main(String[] args) {
            addPlanets();
            print();
            createNewPlanet("Звезда Смерти");
            print();
        }

        public static void createNewPlanet(String planetName) {
            int temp = 0;
            for (int i = 0; i <planets.size() ; i++) {
                if (planets.get(i).equals("Земля")){
                    temp=i;
                    break;
                }
            }
            planets.add(temp+1,planetName);
        }

        public static void addPlanets() {
            planets.add("Меркурий");
            planets.add("Венера");
            planets.add("Земля");
            planets.add("Марс");
            planets.add("Юпитер");
            planets.add("Сатурн");
            planets.add("Уран");
            planets.add("Нептун");
        }

        public static void print() {
            for (int i = 0; i < planets.size(); i++) {
                System.out.println(String.format("%s — %d-я планета от Солнца", planets.get(i), (i + 1)));
            }
            System.out.println();
        }
    }
    /*
В 3020 году ученые научились выращивать новые планеты, одну из которых отправили в космос на орбиту Солнца.
Эта планета находится между Землей и Марсом.
Реализуй метод createNewPlanet(String), который должен добавлять переданную планету в список planets сразу после Земли. Посмотри, как изменился порядок следования планет.
Методы main(), addPlanets() и print() не принимают участие в проверке.

Требования:
•	Метод createNewPlanet(String) должен добавлять переданную планету в список planets на следующую позицию после Земли.*/