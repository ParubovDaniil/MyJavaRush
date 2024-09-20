package Java_Syntax_Pro.L10;
/*
Проверка URL-адреса
*/
public class lvl10_12 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }
    public static String checkProtocol(String url) {
        String http = "http:";
        String https = "https:";
        boolean hp = url.regionMatches(0,http,0,5);
        boolean hps = url.regionMatches(0,https,0,6);
        if (hp){
            return "http";
        }else if (hps) {
            return "https";
        }else
        return "неизвестный";
    }
    public static String checkDomain(String url) {
        boolean dotRu = url.endsWith(".ru");
        boolean dotCom = url.endsWith(".com");
        boolean dotOrg = url.endsWith(".org");
        boolean dotCc = url.endsWith(".cc");
        boolean dotNet = url.endsWith(".net");
        if (dotRu){
            return "ru";
        }else if (dotCom) {
            return "com";
        }else if (dotOrg) {
            return "org";
        }else if (dotCc) {
            return "cc";
        }else if (dotNet) {
            return "net";
        }else
        return "неизвестный";
    }
}
/*
* В этой задаче тебе нужно выполнить проверку URL-адреса.

Простая схема URL-адреса выглядит так:
<сетевой протокол>://<название ресурса>.<домен>

Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса, полученного входящим параметром,
и возвращает результат проверки — строку название сетевого протокола.

А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса, полученного входящим параметром,
и возвращает результат проверки — строку название домена.

Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".

Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".

main не принимает участие в тестировании.

Требования:
•	Нужно, чтобы метод checkProtocol(String) был реализован согласно условию.
•	Нужно, чтобы метод checkDomain(String) был реализован согласно условию.*/