package Java_Syntax_Pro.L19;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Из потока данных в список
*/
public class lvl19_20 {}

class Solution20 {

    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);

        getPositiveNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        return numbers
                .filter(number -> number > 0)
                .collect(toList());
    }
}
/*
* Для решения этой задачи необходимо, чтобы метод getPositiveNumbers(Stream<Integer>) преобразовывал входящий поток чисел в список чисел больше нуля.
Реализуй его, используя метод collect() объекта типа Stream<Integer>. В качестве параметра передай нужный коллектор (объект типа Collector<List<Integer>>). Такой объект можно получить, вызвав статический метод toList() класса Collectors.

Метод main() не принимает участие в тестировании.

Требования:
•	В публичном статическом методе getPositiveNumbers(Stream<Integer>) нужно вызывать статический метод toList() класса Collectors.
•	Метод getPositiveNumbers(Stream<Integer>) нужно реализовать согласно условию.*/