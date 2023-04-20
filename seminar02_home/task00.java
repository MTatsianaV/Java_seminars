package seminar02_home;

/* public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {
}
public String findJewelsInStones(String jewels, String stones) {
return "";
}
}
 */
import java.util.Scanner;

public class task00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите обозначение драгоценных камней: ");
        char[] jewels = sc.nextLine().toCharArray();
        System.out.print("Введите перечень всех имеющихся камней: ");
        char[] stones = sc.nextLine().toCharArray();
        for (int i = 0; i < jewels.length; i++) {
            int count = 0;
            for (int j = 0; j < stones.length; j++) {
                if (jewels[i] == stones[j]) count +=1;
            }
            System.out.print(jewels[i]); 
            System.out.print(count);   
        }
        sc.close();
    }
}
