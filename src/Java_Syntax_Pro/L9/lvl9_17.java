package Java_Syntax_Pro.L9;
/*
Инкременты
*/

public class lvl9_17 {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);
        System.out.println(b);
    }
}
/*
* Внеси исправления в метод main(), чтобы он выводил в консоли число 20.
В методе можно изменять только постинкремент на преинкремент и наоборот, а также постдекремент на предекремент и наоборот.
Требования:
•	Исправь метод main() согласно условию.
* */