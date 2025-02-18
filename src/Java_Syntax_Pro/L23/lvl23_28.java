package Java_Syntax_Pro.L23;

public class lvl23_28 {
}

/*
Битва роботов
*/

class Solution28 {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}

class Robot extends AbstractRobot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

abstract class AbstractRobot implements Attackable, Defensable {
    private int hitCount;

    public abstract String getName(); // Добавили абстрактный метод

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = (hitCount % 4) + 1; // Упрощенный вариант с циклом (ARM, HEAD, LEG, CHEST)

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.CHEST;
        }

        return attackedBodyPart;
    }

    @Override
    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = (hitCount % 4) + 1; // Упрощенный вариант с циклом (HEAD, LEG, ARM, CHEST)

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }

    public AbstractRobot() {
        hitCount = 0;
    }
}

interface Defensable {
    BodyPart defense();
}

interface Attackable {
    BodyPart attack();
}


final class BodyPart {
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST = new BodyPart("грудь");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}

/*
* Для начала разберись в том, что делает код: это будет непросто.
Затем измени код согласно новой архитектуре и добавь новую логику:

Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot в AbstractRobot.
Отредактируй класс Robot, учитывая AbstractRobot.
Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь").
Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
Требования:
•	Класс AbstractRobot должен быть абстрактным.
•	Класс AbstractRobot должен реализовывать интерфейсы Attackable и Defensable.
•	Класс Robot должен наследоваться от класса AbstractRobot.
•	Логика поведения роботов должна быть вынесена в класс AbstractRobot.
•	В классе BodyPart должна содержаться и быть инициализирована final static переменная CHEST типа BodyPart.
•	Новую часть тела (BodyPart) нужно добавить в логику методов attack и defense в классе AbstractRobot.*/