package seminar03;
    /*
    Создать список типа ArrayList
    Поместить в него как строки, так и целые числа.
    Пройти по списку, найти и удалить целые числа.
     */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class task03 {
    
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add("5");
        list.add(7);
        list.add(71);
        list.add("привет");
        list.add(5.1);
        list.add(null);
        System.out.println(list);
        removeInteger2(list);
        System.out.println(list);
    }

    static void removeInteger(List list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number){
                list.remove(i);
                i--;
            }
        }
    }

    static void removeInteger2(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object instanceof Integer){
                iterator.remove();
            }
        }
    }
}