package Java_Syntax_Pro.L13;
import java.util.ArrayList;
import java.util.Arrays;
/*
Прощай, Паскаль
*/
public class lvl13_14 {}

class Solution14 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
    programmingLanguages.remove(programmingLanguages.indexOf("Pascal"));
    }
}
/*
* В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

Требования:
•	В методе main должен удаляться Pascal из списка programmingLanguages.*/