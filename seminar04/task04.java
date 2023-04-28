package seminar04;

import java.util.*;

/* 
1) Написать метод, который принимает массив элементов, 
помещает их в стэк и выводит на консоль содержимое стэка. 
2) Написать метод, который принимает массив элементов, 
помещает их в очередь и выводит на консоль содержимое очереди.
 */
public class task04 {
    public static void main(String[] args) {
        ex3();
    }

    static void ex3() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack: " + stack);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue: " + queue);
        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }  
    }
}
