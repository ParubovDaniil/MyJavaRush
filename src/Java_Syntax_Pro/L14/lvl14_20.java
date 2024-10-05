package Java_Syntax_Pro.L14;

public class lvl14_20 {
}

class Solution20 {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        switch (monthIndex) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default:monthString = "Недействительный месяц";
        }
        return monthString;
    }
}
/*
В классе Solution есть метод getMonthByIndex(int), который возвращает название месяца по его номеру, начиная с 1.
Твоя задача — переписать метод, используя только оператор switch и ключевые слова case, break и default.
Требования:
•	Метод getMonthByIndex(int) должен возвращать имя месяца по его номеру.
•	В методе getMonthByIndex(int) должен использоваться только оператор множественного выбора switch.*/