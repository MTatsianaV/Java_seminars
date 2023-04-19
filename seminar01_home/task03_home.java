package seminar01_home;

/* Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет. */
import java.util.Scanner;

public class task03_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую цифру первого числа: ");
        int q1 = sc.nextInt();
        System.out.print("Введите вторую цифру второго числа: ");
        int w2 = sc.nextInt();
        System.out.print("Введите сумму: ");
        int sum = sc.nextInt();
        int count = 0;
        for (int i = q1 * 10; i < q1*10 + 10; i += 1) {
            for (int j = 0 + w2; j < 100; j += 10) {
                if (i + j == sum) {
                    System.out.println(i + "+" + j + "=" + sum);
                    count +=1;
                } 
            }
        }
        if (count == 0) System.out.println("Решения нет!");
        sc.close();
    }
}
