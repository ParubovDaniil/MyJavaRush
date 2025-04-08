package Java_Syntax_Pro.L25.lvl25_28;

public class Earth implements Planet {
    private static Earth instance;

    private Earth() {
        // Приватный конструктор, чтобы предотвратить создание экземпляра класса извне.
    }

    public static Earth getInstance() {
        // Ленивая инициализация: экземпляр создается только при первом вызове метода getInstance().
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("LazySingleton is doing something!");
    }

    public static void main(String[] args) {
        // Получаем экземпляр Singleton
        Earth singleton = Earth.getInstance();

        // Вызываем метод экземпляра
        singleton.doSomething();

        // Получаем еще один экземпляр
        Earth anotherSingleton = Earth.getInstance();

        // Проверяем, что это один и тот же экземпляр
        System.out.println(singleton == anotherSingleton); // Выведет true
    }
}