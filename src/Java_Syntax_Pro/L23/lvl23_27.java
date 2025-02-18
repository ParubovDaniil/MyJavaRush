package Java_Syntax_Pro.L23;

import java.util.ArrayList;
import java.util.List;

public class lvl23_27 {
}


/*
Репка
*/

class Solution27 {
    public static void main(String[] args) {
        List<Person1> plot = new ArrayList<Person1>();
        plot.add(new Person1("Репка", "Репку"));
        plot.add(new Person1("Дедка", "Дедку"));
        plot.add(new Person1("Бабка", "Бабку"));
        plot.add(new Person1("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

class Person1 implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person1(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person1 second) {
        System.out.println(name + " за " + second.getNamePadezh());
    }
}

interface RepkaItem {
    public String getNamePadezh();
}

class RepkaStory {
    static void tell(List<Person1> items) {
        Person1 first;
        Person1 second;
        for (int i = items.size() - 1; i > 0; i--) {
            second = items.get(i - 1);
            first = items.get(i);
            first.pull(second);
        }
    }
}
/*
* Давай напишем программу по мотивам сказки "Репка":

Реализуй интерфейс RepkaItem в классе Person.
В классе Person реализуй метод pull(Person person), который выводит фразу типа '<name> за <person>'.
Пример:
Бабка за Дедку
Дедка за Репку

Исправь логическую ошибку цикла в методе tell класса RepkaStory.
Выполни метод main и наслаждайся сказкой!
Требования:
•	Интерфейс RepkaItem должен быть реализован в классе Person.
•	В классе Person должен быть реализован метод pull() c одним параметром типа Person.
•	Метод pull в классе Person должен выводить на экран фразу типа '<name> за <person>'. Например: Бабка за Дедку.
•	В результате выполнения метода main() на экран должен быть выведен краткий вариант сказки про Репку.*/