package Java_Syntax_Pro.L16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*
Получение информации по API
*/

public class lvl16_22 {
}

class Solution22 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        //напишите тут ваш код
        InputStream input = url.openStream();
        try (InputStreamReader ios = new InputStreamReader(input);
             BufferedReader bufferedReader = new BufferedReader(ios)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Выводим каждую строку на экран
            }
        } catch (
                IOException ioException) {
            System.out.println("какая-то ошибк" + ioException.getMessage());
        }
    }
}
/*
*
Твоя задача — обратиться к публичному API в интернете и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, получать данные и выводить их на экран.

Подсказки:

Используй метод openStream() класса URL.
Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр:
https://javarush.com/api/1.0/rest/projects
Требования:
•	Программа должна выводить полученную информацию на экран.
•	В программе должен вызываться метод openStream() класса URL.*/