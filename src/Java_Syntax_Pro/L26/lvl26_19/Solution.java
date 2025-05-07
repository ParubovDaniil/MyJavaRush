package Java_Syntax_Pro.L26.lvl26_19;

/*
А без interrupt слабо?
*/

public class Solution {
     public static volatile boolean finish = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
        t.interrupt();
    }

    public static void ourInterruptMethod() {
        finish = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!finish) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
/*
* Разберись, как работает программа.
Реализуй метод ourInterruptMethod таким образом, чтобы он прерывал нить TestThread. Исправь остальной код программы, если это необходимо.
* Нельзя использовать метод interrupt.

Требования:
•	В классе Solution должен быть публичный статический метод ourInterruptMethod без параметров.
•	Метод run должен выводить надпись "he-he" каждые пол секунды, пока не будет вызван метод ourInterruptMethod.
•	Необходимо изменить условие цикла while в методе run.
•	Метод main должен создавать объект типа Thread передавая в конструктор объект типа TestThread.
•	Метод main должен вызывать метод start у объекта типа Thread.
•	Метод main должен вызывать метод ourInterruptMethod.*/