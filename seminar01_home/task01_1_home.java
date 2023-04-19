package seminar01_home;
/* Вычислить:
1. n-ое треугольного число (сумма чисел от 1 до n), 
2. n! (произведение чисел от 1 до n)
*Перейти по ссылке, реализовать формулу на Java. */

import java.util.Scanner;

public class task01_1_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number_n = Integer.parseInt(sc.nextLine());
        int res_triangular = triangular_n(number_n);
        System.out.println(res_triangular);        
        int res_factorial = factorial_n(number_n);
        System.out.println(res_factorial);
        sc.close();
    }
    static int factorial_n(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factorial_n(n - 1);
    }
    static int triangular_n(int n) {
        if (n == 1) return 1;
        return n + triangular_n(n - 1);
    }    
}