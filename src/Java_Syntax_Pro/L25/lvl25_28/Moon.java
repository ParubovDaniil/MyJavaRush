package Java_Syntax_Pro.L25.lvl25_28;

public class Moon implements Planet{
    private static Moon instance;

    private Moon() {
        // Приватный конструктор, чтобы предотвратить создание экземпляра класса извне.
    }

    public static Moon getInstance() {
        // Ленивая инициализация: экземпляр создается только при первом вызове метода getInstance().
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("LazySingleton is doing something!");
    }

    public static void main(String[] args) {
        // Получаем экземпляр Singleton
        Moon singleton = Moon.getInstance();

        // Вызываем метод экземпляра
        singleton.doSomething();

        // Получаем еще один экземпляр
        Moon anotherSingleton = Moon.getInstance();

        // Проверяем, что это один и тот же экземпляр
        System.out.println(singleton == anotherSingleton); // Выведет true
    }
}