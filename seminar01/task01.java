package seminar01;

/* Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. 
На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
Программа должна вывести одно натуральное число.
Sample Input 1:
10
3
2
Sample Output 1:
8
class MyProgram{
public static void main(String[] args){
}
} */

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту шеста: ");
        int h = Integer.parseInt(sc.nextLine());
        System.out.println("Улитка поднимается вверх на: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Улитка спускается вниз на: ");
        int b = Integer.parseInt(sc.nextLine());
        int res = a; int count = 1;
        while (res < h) {
            res = res - b + a;
            count += 1;
        }
        System.out.println(count);
        sc.close();
    }
}
