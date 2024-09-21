package Java_Syntax_Pro.L11;
/*
С крышей или без? Вот в чем вопрос
*/
public class lvl11_7 {}
class Bugatti {
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getBody() {
        return body;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public Bugatti(){}
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

}
/*
Ты сделал предзаказ на новенькую Bugatti ровно полгода назад. Сейчас июнь, и было бы неплохо все-таки ездить на кабриолете. Но ты забыл, в каком кузове заказывал машину.
Твоя задача — добавить функциональность для получения текущей конфигурации и изменения её при необходимости. Для этого создай геттеры и сеттеры.
Требования:
•	В классе Bugatti должно быть три поля: String color, int year, String body.+
•	В классе Bugatti должен быть конструктор по умолчанию.+
•	В классе Bugatti должен быть публичный геттер getBody для поля body.
•	В классе Bugatti должен быть публичный сеттер setBody(String) для поля body.
*/
