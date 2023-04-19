package seminar01;
/* Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.
Входные данные
Заданы три целых числа а, b, с, где a > b
Выходные данные
Выведите единственное число - ответ на задачу.
Sample Input:
20
1
2
Sample Output:
20  18  16  14  12  10  8   6   4   2
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
}
 */

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Введите последнее число: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Введите размер шага: ");
        int c = Integer.parseInt(sc.nextLine());
        while (b <= a) {
            System.out.println(a);            
            a -= c;
        }        
        sc.close();
    }
}
