package seminar04_home;
/* 
Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам. 
*/
import java.util.LinkedList;
import java.util.ListIterator;

public class task01 {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");

        LinkedList<String> reversedList = reverse(myLinkedList);

        System.out.println("Было: " + myLinkedList);
        System.out.println("Стало: " + reversedList);
    }

    public static <T> LinkedList<T> reverse(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        ListIterator<T> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            T element = iterator.previous();
            reversedList.add(element);
        }

        return reversedList;
    }
}
