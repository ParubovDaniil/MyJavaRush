package Java_Syntax_Pro.L9;
import java.util.Random;
/*
Magic 8 ball
*/

public class lvl9_5 {
    public static void main(String[] args) {
        System.out.println("Заработаю ли я себе на BMW?");
        System.out.println(MagicBall.getPrediction());
    }
}
class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random random = new Random();
        String []str = new String[]{CERTAIN,DEFINITELY,MOST_LIKELY,OUTLOOK_GOOD,ASK_AGAIN_LATER,TRY_AGAIN,NO,VERY_DOUBTFUL};
        int i = random.nextInt(7+1);
        if (i == 0 && i < 7+1){
            return str[i];
        }
        return null;
    }
}
/*
* В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, который будет работать как шар предсказаний.
Он случайным образом возвращает фразу-ответ на заданный вопрос.
В методе getPrediction() нужно использовать метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
0 -> Бесспорно
1 -> Определённо да
2 -> Вероятнее всего
3 -> Хорошие перспективы
4 -> Спроси позже
5 -> Попробуй снова
6 -> Мой ответ — нет
7 -> Весьма сомнительно
Иначе вернуть null.
Требования:
•	Реализуй метод getPrediction() согласно условию.*/