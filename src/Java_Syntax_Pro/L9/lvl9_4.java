package Java_Syntax_Pro.L9;

/*
Randomizer
*/
public class lvl9_4 {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return (int) (Math.random() * 99);
    }
}

/*
*
В этой задаче тебе предстоит реализовать метод generateNumber(), который будет возвращать случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().

Требования:
•	В классе Solution должен быть публичный статический метод generateNumber() с типом возвращаемого значения int.
•	Реализуй метод generateNumber() согласно условию.*/