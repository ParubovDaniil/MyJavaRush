package Java_Syntax_Pro.L9;
/*
Swap по-новому
*/
public class lvl9_12 {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
    int z =x;
    x = y;
    y = z;
    /*
        x ^= y;
        y ^= x;
        x ^= y;
    * */
    }
}

/*
* В классе Pair реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
Можно использовать только операции:

Исключающее или.
Присваивание.
Исключающее или с присваиванием.
Не оставляй комментарии, не меняй остальной код.
Требования:
•	В классе Pair должен присутствовать метод swap().
•	В классе Pair в методе swap() используй только разрешенные операции.
•	Вызов метода swap() должен поменять значения полей x и y.
•	Не изменяй никакой код, кроме метода swap().
* */
