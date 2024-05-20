package Java_Syntax_Pro.L3;
import java.util.Scanner;

/*
Призывная кампания
*/
public class lvl3_2 {    public static void main(String[] args) {
    String militaryCommissar = ", явитесь в военкомат";
    //напишите тут ваш код
    Scanner name = new Scanner(System.in);
    Scanner age = new Scanner(System.in);
    String str = name.nextLine();
    int i = age.nextInt();
    if (i >= 18 && i<=28)
        System.out.println(str + militaryCommissar);
}
}

