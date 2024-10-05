package Java_Syntax_Pro.L14;

public class lvl14_22 {
}

class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        switch (countOfCorner) {
            case 3:
                shape = "Треугольник";
                break;
            case 4:
                shape = "Четырехугольник";
                break;
            case 5:
                shape = "Пятиугольник";
                break;
            case 6:
                shape = "Шестиугольник";
                break;
            case 7:
                shape = "Семиугольник";
                break;
            case 8:
                shape = "Восьмиугольник";
                break;
            default:
                shape = "Другая фигура";
        }
        return shape;

    }
}
/*
В классе Solution есть метод getShapeNameByCountOfCorners(int), который возвращает название многоугольника в зависимости от количества углов.
Твоя задача — переписать метод, используя только оператор switch.

Требования:
•	Результат работы метода getShapeNameByCountOfCorners(int) не должен измениться.
•	В методе getShapeNameByCountOfCorners(int) должен использоваться только оператор switch.*/