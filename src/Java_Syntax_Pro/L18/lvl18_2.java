package Java_Syntax_Pro.L18;

public class lvl18_2 {}

/*
Геометрия для чайников
*/
class Solution2 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
class Circle extends Shape {
    //напишите тут ваш код
    @Override
    public void printInfo(){
        System.out.println("Круг");
    }
}
class Triangle extends Shape {
    //напишите тут ваш код
    @Override
    public void printInfo(){
        System.out.println("Треугольник");
    }
}
class Shape {
    public void printInfo(){
        System.out.println("Геометрическая фигура");
    }
}
class Rectangle extends Shape {
    //напишите тут ваш код
    @Override
    public void printInfo(){
        System.out.println("Прямоугольник");
    }
}

/*
*
Классы Triangle, Rectangle и Circle — геометрические фигуры, поэтому они и унаследованы от класса Shape.
Переопредели в них метод printInfo(), чтобы в консоли выводилось название конкретной фигуры:
Для Triangle — "Треугольник";
Rectangle — "Прямоугольник";
Circle — "Круг".

Метод main() в тестировании участия не принимает.

Требования:
•	Класс Shape не изменяй.
•	Классы геометрических фигур должны быть унаследованы от Shape.
•	В классах геометрических фигур должен быть переопределен метод printInfo().
•	Вызов метода printInfo() у объекта геометрической фигуры должен выводить в консоли ее название.*/