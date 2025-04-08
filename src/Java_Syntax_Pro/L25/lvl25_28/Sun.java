package Java_Syntax_Pro.L25.lvl25_28;

public class Sun implements Planet{
    private static Sun instance;

    private Sun() {
        // Приватный конструктор, чтобы предотвратить создание экземпляра класса извне.
    }

    public static Sun getInstance() {
        // Ленивая инициализация: экземпляр создается только при первом вызове метода getInstance().
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("LazySingleton is doing something!");
    }

    public static void main(String[] args) {
        // Получаем экземпляр Singleton
        Sun singleton = Sun.getInstance();

        // Вызываем метод экземпляра
        singleton.doSomething();

        // Получаем еще один экземпляр
        Sun anotherSingleton = Sun.getInstance();

        // Проверяем, что это один и тот же экземпляр
        System.out.println(singleton == anotherSingleton); // Выведет true
    }
}