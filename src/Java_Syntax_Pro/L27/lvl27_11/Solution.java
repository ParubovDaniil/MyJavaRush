package Java_Syntax_Pro.L27.lvl27_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args.length == 0) return; // нет аргументов, выходим
        try {
            synchronized (allPeople) {
                switch (args[0]) {
                    case "-c": // CREATE: -c name1 sex1 bd1 name2 sex2 bd2 ..

                        int enumerationOfParameters = 0;
                        if (args.length >= 4) {
                            if ((args.length - 1) % 3 == 0) {
                                enumerationOfParameters = (args.length - 1) / 3;
                            }
                            String name = null;
                            String sex = null;
                            String bd = null;
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                            for (int i = 0; i < enumerationOfParameters; i++) {
                                name = args[1 + i * 3];
                                sex = args[2 + i * 3];
                                bd = args[3 + i * 3];
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
                        }

                        break;

                    case "-i": // READ: -i id

                        if (args.length >= 2) {

                            List<Integer> list = new ArrayList<>();
                            for (int i = 1; i < args.length; i++) {
                                if (Integer.parseInt(args[i]) < allPeople.size() && Integer.parseInt(args[i]) >= 0) {
                                    list.add(Integer.parseInt(args[i]));
                                }
                            }

                            try {
                                for (int i = 0; i < list.size(); i++) {
                                    int id = list.get(i);
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
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Неверный формат id: " + e.getMessage());
                            }

                        }
                        break;

                    case "-u": // UPDATE: -u id name sex bd

                        if (args.length >= 5) {
                            int enumerationOfParametersUpdate = 0;
                            if ((args.length - 1) % 4 == 0) {
                                enumerationOfParametersUpdate = (args.length - 1) / 4;
                            }
                            int id = 0;
                            String name = null;
                            String sex = null;
                            String bd = null;
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                            try {
                                for (int i = 0; i < enumerationOfParametersUpdate; i++) {
                                    id = Integer.parseInt(args[1 + i * 4]);
                                    name = args[2 + i * 4];
                                    sex = args[3 + i * 4];
                                    bd = args[4 + i * 4];
                                    Date newBirthDate = sdf.parse(bd);
                                    Person person = allPeople.get(id);
                                    person.setName(name);
                                    person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
                                    person.setBirthDate(newBirthDate);
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Неверный формат id: " + e.getMessage());
                            } catch (ParseException e) {
                                System.out.println("Неверный формат даты: " + e.getMessage());
                            }

                        }
                        break;

                    case "-d": // DELETE (логическое удаление): -d id1 id2 id3 id4 ...

                        if (args.length >= 2) {
                            List<Integer> list = new ArrayList<>();
                            for (int i = 1; i < args.length; i++) {
                                if (Integer.parseInt(args[i]) < allPeople.size() && Integer.parseInt(args[i]) >= 0) {
                                    list.add(Integer.parseInt(args[i]));
                                }
                            }

                            try {
                                for (int i = 0; i < list.size(); i++) {
                                    int id = list.get(i);

                                    Person person = allPeople.get(id);
                                    // Логическое удаление: обнуляем поля объекта
                                    person.setName(null);
                                    person.setSex(null);
                                    person.setBirthDate(null);

                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Неверный формат id: " + e.getMessage());
                            }

                        }
                        break;

                    default:
                        System.out.println("Неверная операция. Допустимые операции: -c, -r, -u, -d");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
* CrUD Batch - multiple Creation, Updates, Deletion.

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u - обновляет соответствующие данные людей с заданными id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке.
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople.
Порядок вывода данных соответствует вводу данных.
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример вывода для параметра -і с двумя id:
Миронов м 15-Apr-1990
Миронова ж 25-Apr-1997

Требования:
•	Класс Solution должен содержать public static volatile поле allPeople типа List<Person>.
•	Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
•	При параметре -с программа должна добавлять всех людей с заданными параметрами в конец списка allPeople, и выводить id каждого (index) на экран.
•	При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
•	При параметре -d программа должна логически удалять людей с заданными id в списке allPeople.
•	При параметре -i программа должна выводить на экран данные о всех людях с заданными id по формату указанному в задании.
•	Метод main класса Solution должен содержать оператор switch по значению args[0].
•	Каждый case оператора switch должен иметь блок синхронизации по allPeople.*/