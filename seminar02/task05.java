package seminar02;

/* Вводится строка, определите, каких символов в ней больше: цифр или букв? 
Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. 
Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". 
Если же их равное количество, то выведите слово "Equal".
Sample Input:
34Hi56
Sample Output:
Digit
 */
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        char[] my_text = sc.nextLine().toCharArray();
        int countOfDigit = 0, countOfLetter = 0;
        for (int i = 0; i < my_text.length; i++) {
            System.out.println(my_text[i]);
            if (Character.isDigit(my_text[i])) countOfDigit += 1;
            if (Character.isLetter(my_text[i])) countOfLetter += 1;
        }
        if (countOfDigit > countOfLetter) System.out.println("Digit");
        else if (countOfDigit < countOfLetter) System.out.println("Letter");
        else System.out.println("Equal");
        sc.close();
    }
}
