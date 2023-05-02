package seminar05;

import java.util.*;

/* 
Взять набор строк, например, Мороз и солнце день чудесный 
Еще ты дремлешь друг прелестный Пора красавица проснись. 
Написать метод, который отсортирует эти слова по длине с помощью TreeMap. 
Строки с одинаковой длиной не должны “потеряться”.
 */
public class task04 {
    public static void main(String[] args) {
        String line = " Мороз и солнце день чудесный\n" 
        + "Еще ты дремлешь друг прелестный\n" 
        + "Пора красавица проснись. ";
        ex3(line);
    }

    static void ex3(String line) {
        line = line.replace(".", "");
        line = line.replace("\n", " ");
        String[] words = line.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
