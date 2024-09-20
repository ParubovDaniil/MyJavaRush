package Java_Syntax_Pro.L10;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
StringTokenizer
*/
public class lvl10_15 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }
    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String token = "";
        int i = 0;
        for (i = 0; tokenizer.hasMoreTokens(); i++) {
            token = tokenizer.nextToken();
        }
        StringTokenizer tok = new StringTokenizer(query,delimiter);
        String [] array = new String[i];
        i = 0;
        for (i = 0; tok.hasMoreTokens(); i++) {
            token = tok.nextToken();
            array[i]=token;
        }
        return array;
    }
}
/*
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().

Требования:
•	Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
•	Нужно, чтобы метод getTokens(String, String) возвращал массив типа String, заполненный согласно условию задачи.*/