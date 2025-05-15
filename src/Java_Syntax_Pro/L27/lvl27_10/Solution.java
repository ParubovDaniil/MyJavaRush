package Java_Syntax_Pro.L27.lvl27_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        // Добавляем двух людей по умолчанию
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  // id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  // id=1
    }

    public static void main(String[] args) {
        if (args.length == 0) return; // нет аргументов, выходим

        String operation = args[0];

        switch (operation) {
            case "-c": // CREATE: -c name sex bd
                if (args.length >= 4) {
                    String name = args[1];
                    String sex = args[2];
                    String bd = args[3];
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    try {
                        Date birthDate = sdf.parse(bd);
                        Person person;
                        if (sex.equals("м")) {
                            person = Person.createMale(name, birthDate);
                        } else {
                            person = Person.createFemale(name, birthDate);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                    } catch (ParseException e) {
                        System.out.println("Ошибка при разборе даты: " + e.getMessage());
                    }
                }
                break;

            case "-r": // READ: -r id
                if (args.length >= 2) {
                    try {
                        int id = Integer.parseInt(args[1]);
                        Person person = allPeople.get(id);
                        // Если объект логически удалён, его поля будут null
                        if (person.getName() == null) {
                            System.out.println("Запись отсутствует");
                        } else {
                            String gender = person.getSex() == Sex.MALE ? "м" : "ж";
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            String bd = sdf.format(person.getBirthDate());
                            System.out.println(person.getName() + " " + gender + " " + bd);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат id: " + e.getMessage());
                    }
                }
                break;

            case "-u": // UPDATE: -u id name sex bd
                if (args.length >= 5) {
                    try {
                        int id = Integer.parseInt(args[1]);
                        String name = args[2];
                        String sex = args[3];
                        String bd = args[4];
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        Date newBirthDate = sdf.parse(bd);
                        Person person = allPeople.get(id);
                        person.setName(name);
                        person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
                        person.setBirthDate(newBirthDate);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат id: " + e.getMessage());
                    } catch (ParseException e) {
                        System.out.println("Неверный формат даты: " + e.getMessage());
                    }
                }
                break;

            case "-d": // DELETE (логическое удаление): -d id
                if (args.length >= 2) {
                    try {
                        int id = Integer.parseInt(args[1]);
                        Person person = allPeople.get(id);
                        // Логическое удаление: обнуляем поля объекта
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат id: " + e.getMessage());
                    }
                }
                break;

            default:
                System.out.println("Неверная операция. Допустимые операции: -c, -r, -u, -d");
        }
    }
}
/*
* CRUD - Create, Read, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-r id
-u id name sex bd
-d id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -r:
Миронов м 15-Apr-1990

Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main - String[] args).
Например, при запуске программы c параметрами:
-c name sex bd
получим в методе main
args[0] = "-c"
args[1] = "name"
args[2] = "sex"
args[3] = "bd"
Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле Program arguments в меню Run -> Edit Configurations.

Требования:
•	Класс Solution должен содержать public static поле allPeople типа List<Person>.
•	Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
•	При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
•	При запуске программы с параметром -r программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.
•	При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
•	При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.*/