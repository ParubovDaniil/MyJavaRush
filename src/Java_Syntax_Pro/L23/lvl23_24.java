package Java_Syntax_Pro.L23;
import java.awt.*;

public class lvl23_24 {}

/*
Один метод в классе
*/

class Solution24 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
       Color getColor();

       Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
/*
* Реализуй интерфейс Animal в классе Fox.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что методы удалять нельзя.

Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В классе Fox должен быть реализован только один метод — getName.
•	Интерфейс Animal изменять нельзя.
•	Дополнительные классы или интерфейсы создавать нельзя.*/