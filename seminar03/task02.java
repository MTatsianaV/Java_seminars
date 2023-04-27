package seminar03;

/* 
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class task02 {
    public static void main(String[] args) {
        ex1();
    }
    static void ex1(){
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort1(list);
        System.out.println(list);
        sort2(list);
        System.out.println(list);
    }
    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return result;
    }
    static void sort1(List<Integer> list){
        Collections.sort(list);
    }
    static void sort2(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());
    }
}