package seminar03_home;
/*
Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее арифметическое из этого списка. 
Collections.max()
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class task02 {
    public static void main(String[] args) {
        List<Integer> list = createList(15, 1, 99);
        System.out.println(list);
        System.out.println("Минимальное значение: " + Collections.min(list));
        System.out.println("Максимальное значение: " + Collections.max(list));
        System.out.printf("Среднее арифмитическое: " + "%.2f", AverageOfList(list));    
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
        }
        return result;
    }
    
    static double AverageOfList(List<Integer> list){
        int sum = 0;
        for (int number : list) {
          sum += number;
        }
        double average = (double) sum / list.size();
        return average;
    }
}
