package seminar02;
/* Дана строка, в которой через пробел перечислены цифры. 
На следующей строке вводится цифра. 
Определите индексы первого и последнего её вхождения.
Sample Input:
4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
4
Sample Output:
0
28 */
import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив чисел через пробел: ");
        String text = sc.nextLine();
        System.out.println("Введите искомое число: ");
        String num = sc.next();
        System.out.println(text.indexOf(num));
        System.out.println(text.lastIndexOf(num));
        sc.close();
    }
}
