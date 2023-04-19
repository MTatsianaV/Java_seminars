package seminar01;
/* В первый день спортсмен пробежал x километров, 
а затем он каждый день увеличивал пробег на 10% от предыдущего значения. 
По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
Входные данные:
Программа получает на вход действительные числа x и y
Выходные данные:
Программа должна вывести одно натуральное число.
Sample Input:
10
20
Sample Output:
9
import java.util.Scanner;
class MyProgram{
public static void main(String[] args){
}
}
 */

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("В первый день спортсмен пробежал: ");
        double x = Integer.parseInt(sc.nextLine());
        System.out.println("Максимальный дневной пробег: ");
        int y = Integer.parseInt(sc.nextLine());        
        int count = 1;
        while (x < y) {
            x *= 1.1;            
            count += 1;
        }
        System.out.println(count);
        sc.close();
    }
}
