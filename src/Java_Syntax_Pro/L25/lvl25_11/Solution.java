package Java_Syntax_Pro.L25.lvl25_11;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat(0,0,0);
        System.out.println(cat.x + " " + cat.y + " " + cat.age + " " + cat.tailLength);
    }
}

class Pet {
    int x = 5, y = 5;
    int weight = 10;

    public Pet(int x, int y) {
        System.out.println(x + " " + y);
        this.x = x;
        this.y = y;
    }
}

class Cat extends Pet {
    int tailLength = 8;
    int age;

    public Cat(int x, int y, int age) {
        super(x, y);
        System.out.println(x + " " + y + " " + age);
        this.age = age;
    }
}