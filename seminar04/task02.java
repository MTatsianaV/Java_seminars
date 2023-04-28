package seminar04;

import java.util.*;

/* 
Реализовать консольное приложение, которое: 
Принимает от пользователя строку вида text~num 
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num. 
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка. 
 */
public class task02 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work) {
            System.out.print("Введите команду: ");
            String command = sc.nextLine();
            String[] splitLine = command.split("~");
            switch (splitLine[0]) {
                case "print":
                    System.out.println(list.remove(Integer.parseInt(splitLine[1])));
                    break;
                case "exit":
                    System.out.println("До новых встреч!");
                    work = false;
                    break;
                default:
                    list.add(Integer.parseInt(splitLine[1]), splitLine[0]);
            }
        }
        sc.close();
    }

}
