package seminar04_home;

/* 
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
Используйте итератор.
*/
import java.util.Iterator;
import java.util.LinkedList;

public class task03 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        int sumOfMyList = 0;
        Iterator<Integer> iter = myList.iterator();
        while (iter.hasNext()) {
            sumOfMyList += iter.next();
        }
        System.out.println("Сумма всех элементов: " + sumOfMyList);
    }
}
