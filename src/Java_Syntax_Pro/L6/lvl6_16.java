package Java_Syntax_Pro.L6;
import java.util.Arrays;
/*
Делим массив
*/
public class lvl6_16 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int[]firstHalfarray;
        int[]secondHalfarray;
        if (array.length%2==1){
            int half = array.length/2;
            firstHalfarray = Arrays.copyOfRange(array,0,half+1);
            secondHalfarray = Arrays.copyOfRange(array,half+1,array.length);
            result[0] = Arrays.copyOf(firstHalfarray,firstHalfarray.length);
            result[1] = Arrays.copyOf(secondHalfarray,secondHalfarray.length);
        }
        else {
            int half = array.length/2;
            firstHalfarray = Arrays.copyOfRange(array,0,half);
            secondHalfarray = Arrays.copyOfRange(array,half,array.length);
            result[0] = Arrays.copyOf(firstHalfarray,firstHalfarray.length);
            result[1] = Arrays.copyOf(secondHalfarray,secondHalfarray.length);
        }
        System.out.println(Arrays.deepToString(result));
    }
}
/*
Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result.
Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
При тестировании значения полей класса Solution будут разными, учти это.

Требования:
•	Реализуй метод main(String[]) согласно условию.
* */
