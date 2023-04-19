package seminar01;
/* Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
Входные данные:
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
Выходные данные:
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.
Sample Input 1:
3 2 4
Sample Output 1:
YES
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
} */

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину шоколадки: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Введите длинну шоколадки: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("Введите количество долек: ");
        int k = Integer.parseInt(sc.nextLine());
        if (k > m*n) {
            System.out.printf("Количество долек больше шоколадки!");          
        } else {
            if (k%n == 0 || k%m == 0) {
                System.out.printf("Yes!"); 
            }
            else System.out.printf("No!"); 
        }
        sc.close();
    }
}
