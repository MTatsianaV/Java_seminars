package seminar03_home;
/*
Пусть дан произвольный список целых чисел, 
удалить из него четные числа
 */

import java.util.ArrayList;
import java.util.List;

public class task01 {

    public static void main(String[] args) {
        List<Integer> list = createList(15, 1, 99);
        System.out.println(list);
        removeEven(list);
        System.out.println(list);
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
        }
        return result;
    }

    static void removeEven(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
}