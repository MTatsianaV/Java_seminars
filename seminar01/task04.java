package seminar01;
/* Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
n! = 1∙2∙3∙…∙ n.
Sample Input:
5
Sample Output:
120
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
} */

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number_n = Integer.parseInt(sc.nextLine());
        int res = factor(number_n);
        System.out.println(res);
        sc.close();
    }
    static int factor(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factor(n - 1);
    }
}
