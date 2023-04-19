package seminar01_home;

/* Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные:
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные:
Выведите ответ на задачу.
Sample Input:
6 1 2 2 3 3 3
Sample Output:
1
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
}  */
import java.util.Scanner;

public class task05_task7_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size_array = sc.nextInt();
        int[] arr = new int[size_array];
        for (int i = 0; i < size_array; i++) {
            System.out.print("Введите значение " + i + "-го элемента: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size_array; i++) {
            int count = 0;
            for (int j = 0; j < size_array; j++) {
                if (i != j && arr[i] == arr[j]) count += 1;
            }
            if (count == 0) System.out.print(" -> " + arr[i]);
        }
        sc.close();
    }
}
