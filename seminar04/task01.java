package seminar04;

import java.util.*;

/* 
Замерьте время, за которое в ArrayList добавятся 10000 элементов.
Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните результаты.
 */
public class task01 {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0() {
        List<Integer> list_Arr = new ArrayList<>();
        List<Integer> list_Link = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list_Arr.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
        long timeStart2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list_Link.add(0, i);
        }
        long timeFinish2 = System.currentTimeMillis();
        System.out.println(timeFinish2 - timeStart2);
    }
}
