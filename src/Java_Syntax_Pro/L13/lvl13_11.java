package Java_Syntax_Pro.L13;
import java.util.Arrays;

/*
Сортировка пузырьком
*/
public class lvl13_11 {}

class Solution11 {

    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        Arrays.sort(numbers);
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
/*
Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька".
Перепиши код, чтобы вместо списка ArrayList<Integer> numbers использовался массив int[] numbers.
Методы main() и print() не принимают участие в проверке.

Требования:
•	Поле numbers должно быть типа int[].
•	Поле numbers должно инициализироваться десятью числами при создании.
•	Метод sort() должен сортировать элементы массива int[] numbers по возрастанию.*/