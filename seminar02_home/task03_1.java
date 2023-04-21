package seminar02_home;

/*public class Task_3 '*' {

Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
Требуется перехватить все возможные ошибки и вывести их в логгер.
После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
public static void main(String[] args) {
}
public String findJewelsInStones(String jewels, String stones){
return "";
}
} */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class task03_1 {
    private static final Logger log = Logger.getLogger(task03_1.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte inputByte = 0;
        try {
            System.out.print("Введите число в формате byte: ");
            inputByte = sc.nextByte();
        } catch (InputMismatchException e) {
            log.warning("Ошибка ввода: " + e.getMessage());
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            writer.write(String.valueOf(inputByte));
        } catch (IOException e) {
            log.warning("Ошибка записи в файл: " + e.getMessage());
        }
        System.out.println("Число успешно записано в файл.");
    }
}