package Java_Syntax_Pro.L24;
import java.util.ArrayList;
import java.util.List;
public class lvl24_17 {}

/*
Клининговый центр
*/

 class Solution17 {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //написать тут вашу реализацию пунктов 1-4
        for (Apartment apartment :
                apartments) {
            if (apartment instanceof OneRoomApt){
                ((OneRoomApt) apartment).clean1Room();
            }
            if (apartment instanceof TwoRoomApt){
                ((TwoRoomApt) apartment).clean2Rooms();
            }
            if (apartment instanceof ThreeRoomApt){
                ((ThreeRoomApt) apartment).clean3Rooms();
            }
        }
    }
    /*
    *     public static void cleanAllApartments(List<Apartment> apartments) {
        apartments.stream()
                .filter(OneRoomApt.class::isInstance)
                .forEach(apt -> ((OneRoomApt) apt).clean1Room());

        apartments.stream()
                .filter(TwoRoomApt.class::isInstance)
                .forEach(apt -> ((TwoRoomApt) apt).clean2Rooms());

        apartments.stream()
                .filter(ThreeRoomApt.class::isInstance)
                .forEach(apt -> ((ThreeRoomApt) apt).clean3Rooms());
    }*/

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
/*
* В этой задаче тебе нужно:

Реализовать метод cleanAllApartments().
Пройтись по списку объектов apartments:
для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room();
для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms();
для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms().
Использовать instanceof.
Требования:
•	Метод cleanAllApartments должен принимать список аппартаметов в качестве параметра.
•	В методе cleanAllApartments для всех однокомнатных аппартаментов (OneRoomApt), содержащихся в списке, необходимо вызвать метод clean1Room().
•	В методе cleanAllApartments для всех двухкомнатных аппартаментов (TwoRoomApt), содержащихся в списке, необходимо вызвать метод clean2Rooms().
•	В методе cleanAllApartments для всех трехкомнатных аппартаментов (ThreeRoomApt), содержащихся в списке, необходимо вызвать метод clean3Rooms().
•	Классы OneRoomApt, TwoRoomApt, ThreeRoomApt должны поддерживать (реализовывать) интерфейс Apartment.*/