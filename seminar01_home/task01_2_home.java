package seminar01_home;
/* Вывести все простые числа от 1 до 1000 */

public class task01_2_home {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
