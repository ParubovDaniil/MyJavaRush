package Java_Syntax_Pro.L14;
import java.util.ArrayList;
import java.util.HashMap;
/*
ArrayList vs HashMap
*/
public class lvl14_12 {}
class Solution12 {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }
    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        HashMap<Integer,String> hashMap = new HashMap<>();
        for (int i = 0; i <programmingLanguages.size() ; i++) {
            hashMap.put(i,programmingLanguages.get(i));
        }

        return hashMap;
    }
}
/*
В классе Solution есть метод getProgrammingLanguages, который возвращает список языков программирования.
Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>. Ключом в этой коллекции будет индекс элемента в ArrayList.

Требования:
•	В классе Solution должен быть публичный статический метод getProgrammingLanguages с типом возвращаемого значения HashMap<Integer, String>.
•	Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
*/