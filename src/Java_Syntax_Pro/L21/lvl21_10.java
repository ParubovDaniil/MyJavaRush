package Java_Syntax_Pro.L21;

/*
Неприступный кот
*/

public class lvl21_10 {}

class Solution10 {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}
/*
* Скрой все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.

Требования:
•	Переменная name класса Cat должна быть скрыта.
•	Переменная age класса Cat должна быть скрыта.
•	Переменная weight класса Cat должна быть скрыта.
•	В Cat должны быть private и public методы.*/