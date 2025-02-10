package Java_Syntax_Pro.L23;

public class lvl23_4 {}

/*
Selectable и Updatable
*/

class Solution4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
    class Screen implements Selectable,Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
/*
*
Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable. Не забудь реализовать методы!

Требования:
•	Класс Screen должен реализовывать (implements) интерфейс Selectable.
•	Класс Screen должен реализовывать (implements) интерфейс Updatable.
•	В классе Screen должны быть реализованы методы интерфейса Selectable.
•	В классе Screen должны быть реализованы методы интерфейса Updatable.*/