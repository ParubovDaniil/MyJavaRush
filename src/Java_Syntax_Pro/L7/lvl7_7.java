package Java_Syntax_Pro.L7;
/*
Добро пожаловать! Но не всем.
*/
public class lvl7_7 {
    public static void main(String[] args) {

    }
    public static void signIn(String username){
        //напишите тут ваш код
        if (username == "user"){
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
/*
* Перед тобой метод signIn(), который приветствует пользователей сайта. Сейчас он приветствует всех пользователей, а должен только зарегистрированных.
Имена всех незарегистрированных пользователей — "user".
Добавь проверку имени пользователя в начало метода signIn().
Если имя "user", прерви выполнение метода, используя ключевое слово return.
Требования:
•	Если имя пользователя "user", метод signIn() должен прекратить работу, не выводя ничего в консоли.
•	Если имя пользователя не "user", метод signIn() должен продолжать работу и вывести строки приветствия в консоли.

* */