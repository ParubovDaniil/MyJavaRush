package Java_Syntax_Pro.L16;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/*
Получение информации по API
*/

public class lvl16_23 {}

 class Solution23 {
     public static void main(String[] args) throws IOException {

         URL url = new URL("http://httpbin.org/post");

         //напишите тут ваш код

         URLConnection connection = url.openConnection();

         connection.setDoOutput(true);

         try (OutputStream output = connection.getOutputStream()) {  // try-with-resources для автоматического закрытия
             String jsonString = "{\"key\":\"value\"}";
             byte[] data = jsonString.getBytes(StandardCharsets.UTF_8);
             output.write(data);
         }
         // читаем данные
         try (InputStream input = connection.getInputStream();
              BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
             String line;
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
         }
     }
 }
/*

Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, отправляя туда данные, получать ответные данные и выводить их на экран.

Подсказки:

Используй метод openConnection() класса URL.
Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
Если не знаешь, какой API использовать, бери http://httpbin.org/post.
Требования:
•	Программа должна выводить полученную информацию на экран.
•	В программе должен вызываться метод openConnection() класса URL.
•	В программе должны вызываться методы setDoOutput(true), getOutputStream() и getInputStream() класса URLConnection.*/