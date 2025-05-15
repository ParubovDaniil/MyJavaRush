package Java_Syntax_Pro.L27.lvl27_6;

/*
Синхронизированный президент
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}
/*
* И снова Singleton паттерн - синхронизация в статическом блоке.
Внутри класса OurPresident в статическом блоке создай синхронизированный блок.
Внутри синхронизированного блока инициализируй president.

Требования:
•	Класс OurPresident должен содержать приватное статическое поле OurPresident president.
•	Класс OurPresident должен содержать публичный статический метод OurPresident getOurPresident().
•	Класс OurPresident должен содержать приватный конструктор.
•	Класс OurPresident должен содержать статический блок.
•	Внутри статического блока класса OurPresident должен быть синхронизированный блок.
•	Внутри синхронизированного блока должно быть проинициализировано поле president.*/