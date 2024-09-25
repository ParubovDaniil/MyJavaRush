package Java_Syntax_Pro.L12;
/*
Одинаковые машины
*/
public class lvl12_6 {
}
class Car {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
/*
В далеком-далеком прошлом все машины называли одинаково.
Но вот в один прекрасный день директору завода по производству автомобилей надоело однообразие,
и он выдал распоряжение: давать разные названия моделям авто.
Итак, как ты уже догадался, твоя задача — помочь главному инженеру исправить программу по производству машин так,
чтобы каждому объекту-машине можно было присвоить уникальное имя.

Требования:
•	Поле modelName класса Car должно быть не статическим.
•	Должны быть исправлены геттер и сеттер для поля modelName.
*/