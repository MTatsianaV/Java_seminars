package seminar01_home;

/* Вводится массив (сначала количество элементов, потом сами элементы). 
Найдите сумму его элементов с чётными индексами и выведите её. 
А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
} */
import java.util.Scanner;

public class task04_task6_home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size_array = sc.nextInt();
        int [] arr = new int[size_array];
        int sum_numbers = 0;
        for (int i = 0; i < size_array; i++) {
            System.out.println("Введите значение " + i + "-го элемента: ");
            arr[i] = sc.nextInt();
            if (i%2==0) sum_numbers += arr[i];            
        } 
        System.out.println("Ответ: " + sum_numbers);
        for (int i = 0; i < size_array; i++) {
            if (i%2==0) System.out.println(arr[i]);            
        }   
        sc.close();
    }
}
