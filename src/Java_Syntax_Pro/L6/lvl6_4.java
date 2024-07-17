package Java_Syntax_Pro.L6;

public class lvl6_4 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        int dlina = firstArray.length + secondArray.length;
        resultArray = new int[dlina];
        int a = firstArray.length;
        for (int i = 0; i < a; i++) {
            resultArray[i] = firstArray[i];
            System.out.print(resultArray[i] + ", ");
        }
        int b = secondArray.length;
        for (int i = 0; i < b; i++) {
            resultArray[firstArray.length + i] = secondArray[i];
            System.out.print(resultArray[firstArray.length + i] + ", ");
        }
    }
}
/*
* Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
Программа должна правильно обрабатывать массивы любой длины.
Требования:
•	В классе Solution должна быть публичная статическая переменная firstArray типа int[], проинициализированная массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная secondArray типа int[], проинициализированная массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная resultArray типа int[].
•	Реализуй метод main(String[]) согласно условию.*/