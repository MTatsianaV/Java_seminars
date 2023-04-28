package seminar04;

import java.util.*;

/* 
Реализовать консольное приложение, которое: 
Принимает от пользователя и “запоминает” строки. 
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней. 
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class task03 {
    public static void main(String[] args) {
        ex2();
    }

    static void ex2() {
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work) {
            System.out.print("введите команду: ");
            String line = sc.nextLine();
            switch (line) {
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("До новых встреч!");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
        sc.close();
    }
}
