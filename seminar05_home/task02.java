package seminar05_home;

/* 
Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, 
Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. 
Для сортировки использовать TreeMap.
 */
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class task02 {
    public static void main(String[] args) {

        String line = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,\n"
                + " Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова,\n"
                + " Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников,\n"
                + " Петр Петин, Иван Ежов.";
        line = line.replace(".", "");
        line = line.replace(",", "");
        String[] employees = line.split(" ");

        TreeMap<String, Integer> nameFrequencyMap = new TreeMap<>();

        Arrays.stream(employees)
                .forEach(name -> {
                    if (nameFrequencyMap.containsKey(name)) {
                        nameFrequencyMap.put(name, nameFrequencyMap.get(name) + 1);
                    } else {
                        nameFrequencyMap.put(name, 1);
                    }
                });

        nameFrequencyMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
