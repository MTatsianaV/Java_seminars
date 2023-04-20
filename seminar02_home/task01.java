package seminar02_home;

/* public class Task_1 {
Вам дается строка S и целочисленный массив индексов int index[s.length].
Напишите программу, которая перетасует символы в S таким образом,
что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
Пример: s = “cba”, index = [3,2,1] 
result “abc”
public static void main(String[] args) {
}
public String shuffle(final String s, final int[] index){} */
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        System.out.print("Введите массив индексов через запятую: ");
        String [] index_s = sc.nextLine().split(",");
        int [] new_index = new int [index_s.length];
        for (int i = 0; i < index_s.length; i++) {
            new_index[i] = Integer.parseInt(index_s[i]) - 1;
        }
        String result = shuffle(s, new_index);
        System.out.println(result);
        sc.close();
    }     
    public static String shuffle(final String s, final int[] index) {
        if (s.length() != index.length) System.out.print("Длины строк и массива индексов не совпадают");      
        char[] new_s = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            new_s[index[i]] = s.charAt(i);
        }
        return new String(new_s);
    }
}
