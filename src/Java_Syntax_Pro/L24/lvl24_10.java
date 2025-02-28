package Java_Syntax_Pro.L24;

public class lvl24_10 {
}

/*
Куриная фабрика
*/

class Solution10 {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country) {
                case Country.BELARUS: {
                    return new BelarusianHen();
                }
                case Country.MOLDOVA: {
                    return new MoldovanHen();
                }
                case Country.RUSSIA: {
                    return new RussianHen();
                }
                case Country.UKRAINE: {
                    return new UkrainianHen();
                }
                default: {
                    return null;
                }
            }
        }
    }
    static abstract class Hen {
        public abstract int getCountOfEggsPerMonth();

        public String getDescription() {
            return "Я - курица.";
        }
    }

    static class RussianHen extends Hen {

        @Override
        public int getCountOfEggsPerMonth() {
            return 10;
        }

        public String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    static class UkrainianHen extends Hen {
        @Override
        public int getCountOfEggsPerMonth() {
            return 20;
        }

        public String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    static class MoldovanHen extends Hen {
        @Override
        public int getCountOfEggsPerMonth() {
            return 30;
        }

        public String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    static class BelarusianHen extends Hen {
        @Override
        public int getCountOfEggsPerMonth() {
            return 40;
        }

        public String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

}

interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}

/*
* Давай напишем Фабрику (Factory) по производству кур (Hen):

Создай класс Hen.+
Сделай его абстрактным.+
Добавь в класс абстрактный метод int getCountOfEggsPerMonth().+
Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".+
Создай класс RussianHen, который наследуется от Hen.+
Создай класс UkrainianHen, который наследуется от Hen.+
Создай класс MoldovanHen, который наследуется от Hen.+
Создай класс BelarusianHen, который наследуется от Hen.+
В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
В каждом из четырех последних классов напиши свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
Все созданные классы должны быть в отдельных файлах.
Требования:
•	Класс Hen должен быть абстрактным.+
•	Класс Hen должен содержать абстрактный метод int getCountOfEggsPerMonth().+
•	В классе Hen должен быть реализован метод String getDescription(), который возвращает строку "Я - курица.".+
•	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от класса Hen и быть созданы в отдельных файлах.+
•	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать метод getCountOfEggsPerMonth, который должен возвращать количество яиц в месяц от данного типа куриц.
•	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять метод getDescription родительского класса таким образом, чтобы возвращаемая ими строка имела вид: <getDescription() родительского класса> + < Моя страна - Sssss. Я несу N яиц в месяц.> где Sssss - название страны, а N - количество яиц в месяц.
•	Метод getHen должен быть реализован в классе HenFactory и возвращать тип кур для переданной в него страны.*/