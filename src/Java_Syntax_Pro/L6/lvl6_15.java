package Java_Syntax_Pro.L6;
import java.util.Arrays;
/*
Заполняем массив
*/
public class lvl6_15 {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;
    public static void main(String[] args) {
        int polovina = array.length/2;
        if (array.length %2 == 0){
            Arrays.fill(array,0,polovina,valueStart);
            Arrays.fill(array,polovina,array.length,valueEnd);
        }else {
            Arrays.fill(array,0,polovina+1,valueStart);
            Arrays.fill(array,polovina+1,array.length,valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
*
Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd.
Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса Solution будут разными, учти это.
Требования:
Реализуй метод main(String[]) согласно условию.*/