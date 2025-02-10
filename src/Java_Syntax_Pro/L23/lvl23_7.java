package Java_Syntax_Pro.L23;

/*
Баг в initializeIdAndName
*/

public class lvl23_7 {}

 class Solution7 {
     public static void main(String[] args) throws Exception {
     }

     interface SimpleObject<T> {
         SimpleObject<T> getInstance();
     }

     class StringObject implements SimpleObject<String> {//допишите здесь ваш код

         {
         }

         @Override
         public SimpleObject<String> getInstance() {
             return null;
         }
     }
 }
/*

В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.

Требования:
•	Класс StringObject должен реализовывать интерфейс SimpleObject.
•	Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
•	В классе StringObject реализуй метод getInstance интерфейса SimpleObject.
•	Дополнительные классы или интерфейсы создавать нельзя.. */