package seminar01_home;

/* Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить */
import java.util.Scanner;

public class task02_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        System.out.println("Выберите операцию: ");
        System.out.println("1 - сложить");
        System.out.println("2 - умножить");
        System.out.println("3 - отнять");
        System.out.println("4 - разделить");
        int operation = sc.nextInt();
        sc.close();
        double result;
        if (operation == 1) result = num1 + num2;
        else if (operation == 2) result = num1 * num2;
        else if (operation == 3) result = num1 - num2;
        else if (operation == 4) result = num1 / num2;
        else {
            System.out.println("Неверная операция.");
            return;
        }
        System.out.println("Результат: " + result);
    }
}
