package Java_Syntax_Pro.L25.lvl25_7;

/*
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, String value,int b) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }public static void printMatrix(int m, int n, String value,int ... a) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }public static void printMatrix(int m, int n, String value,double c) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }public static void printMatrix(int m, int n, String value, float g) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }public static void printMatrix(int m, int n, String value, String f) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }public static void printMatrix(int m, int n, String value, char jh) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, String value, char jh,String f) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, String value, char jh,short s) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
}
/*
*
Перегрузи метод printMatrix() 8 различными способами, чтобы в итоге у тебя получилось 10 различных методов printMatrix().

Требования:
•	В классе Solution должны быть реализованы 10 методов printMatrix() с различными аргументами.
•	Класс Solution должен быть public.
•	Все методы класса Solution должны быть статическими.
•	Все методы класса Solution должны быть публичными.*/