package Java_Syntax_Pro.L9;
import java.util.Scanner;
/*
Минимальный элемент массива
*/
public class lvl9_3 {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }
    public static int min(int[] ints) {
        return Math.min(ints[9],Math.min(ints[8],Math.min(ints[7],Math.min(ints[6],Math.min(ints[5],Math.min(ints[4],Math.min(ints[3],Math.min(ints[2],Math.min(ints[0], ints[1])))))))));
    }
    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[]array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
/*
* В этой задаче тебе нужно:
Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).
Требования:
•	Программа должна считывать числа с клавиатуры.+
•	Класс Solution должен содержать только три метода.+
•	Метод getArrayOfTenElements() должен считать с клавиатуры 10 чисел, потом вернуть массив размером 10 элементов, заполненный считанными числами.+
•	Метод min(int[]) должен вернуть минимальный элемент массива, используя метод min(int, int) класса Math.
•	Метод main() должен вызывать метод getArrayOfTenElements().
•	Метод main() должен вызывать метод min(int[]).*/