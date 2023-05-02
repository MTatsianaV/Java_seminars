package seminar05_home;

/* 
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации. 
123456 Иванов 321456 Васильев 234561 Петрова 234432 Иванов 654321 Петрова 345678 Иванов 
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class task01 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("231-145", "Иванов");
        phoneBook.add("456-789", "Петров");
        phoneBook.add("589-412", "Сидоров");
        phoneBook.add("365-478", "Ковалев");
        phoneBook.add("896-415", "Жуков");
        phoneBook.add("546-852", "Федоров");
        phoneBook.add("896-417", "Жуков");

        System.out.println(phoneBook.getByPhoneNumber("231-145"));
        System.out.println();
        System.out.println(phoneBook.getByLastName("Жуков"));
        System.out.println(phoneBook.getAll());
        System.out.println();
    }
}
