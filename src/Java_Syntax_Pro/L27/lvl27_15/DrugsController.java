package Java_Syntax_Pro.L27.lvl27_15;

import java.util.HashMap;
import java.util.Map;

public class DrugsController {
    public static Map<Drug, Integer> allDrugs = new HashMap<Drug, Integer>();   // <Лекарство, Количество>

    static {
        Drug panadol = new Drug();
        panadol.setName("Панадол");
        allDrugs.put(panadol, 5);

        Drug analgin = new Drug();
        analgin.setName("Анальгин");
        allDrugs.put(analgin, 18);

        Drug placebo = new Drug();
        placebo.setName("Плацебо");
        allDrugs.put(placebo, 1);
    }

    public synchronized void buy(Drug drug, int count) {
        String name = Thread.currentThread().getName();
        if (!allDrugs.containsKey(drug)) {
            System.out.println("Нет в наличии");
        }
        Integer currentCount = allDrugs.get(drug);
        if (currentCount < count) {
            System.out.println(String.format("%s хочет %s %d шт. В наличии - %d", name, drug.getName(), count, currentCount));
        } else {
            allDrugs.put(drug, (currentCount - count));
            System.out.println(String.format("%s купил(а) %s %d шт. Осталось - %d", name, drug.getName(), count, (currentCount - count)));
        }
    }

    public synchronized void sell(Drug drug, int count) {
        System.out.println(Thread.currentThread().getName() + " Закупка " + drug.getName() + " " + count);
        if (!allDrugs.containsKey(drug)) {
            allDrugs.put(drug, 0);
        }
        Integer currentCount = allDrugs.get(drug);
        allDrugs.put(drug, (currentCount + count));
    }
}
/*
* Реализуй интерфейс Runnable в классах Apteka и Person.
Все нити должны работать пока не isStopped.
Логика для Apteka: drugsController должен сделать продажу (вызвать метод void sell(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 300 мс.
Логика для Person: drugsController должен сделать покупку (вызвать метод void buy(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 100 мс.
Расставь synchronized там, где это необходимо.

Требования:
•	Класс Solution должен содержать public static поле drugsController типа DrugsController.
•	Класс Solution должен содержать public static поле isStopped типа boolean.
•	Класс Solution должен содержать private static void метод waitAMoment(), который должен ждать 100 мс.
•	Класс Apteka должен реализовывать интерфейс Runnable.
•	Нить Apteka должна работать пока isStopped = false.
•	Нить Apteka должна использовать drugsController для продажи случайного лекарства (getRandomDrug) в количестве (getRandomCount).
•	Нить Apteka должна ждать 300мс между продажами, используя метод waitAMoment().
•	Класс Person должен реализовывать интерфейс Runnable.
•	Нить Person должна работать пока isStopped = false.
•	Нить Person должна использовать drugsController для покупки случайного лекарства (getRandomDrug) в количестве (getRandomCount).
•	Нить Person должна ждать 100мс между покупками, используя метод waitAMoment().
•	Методы класса DrugsController должны быть synchronized.*/