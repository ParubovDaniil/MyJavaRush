package Java_Syntax_Pro.L3;
import java.util.Scanner;

/*
Тепло или холодно
*/
public class lvl3_1 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner temperature = new Scanner(System.in);
        int i = temperature.nextInt();
        if (i < 0)
            System.out.println(cold);
        else
            System.out.println(warm);
    }
}
