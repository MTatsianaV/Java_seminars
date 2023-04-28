package seminar04_home;
/* 
Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. 
*/

public class task02 {
    public static void main(String[] args) {
        home_2();
    }

    static void home_2() {
        MyLinkedList<String> newLinkedList = new MyLinkedList<>();
        newLinkedList.enqueue("12");
        newLinkedList.enqueue("hello");
        newLinkedList.enqueue("25");
        newLinkedList.enqueue("Wow!");
        newLinkedList.enqueue("???");
        newLinkedList.enqueue("-25.11");
        System.out.println(newLinkedList.dequeue());
        System.out.println(newLinkedList.first());
    }
}
