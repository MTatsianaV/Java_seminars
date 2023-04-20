package seminar02;

/* Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. 
Найдите, сколько раз в тексте встречается введённый символ в любом регистре. 
Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.
Sample Input:
Good morning my dear friend. My fish.
m
Sample Output:
3
 */
public class task04 {
    public static void main(String[] args) {
        String text = "Good morning my dear friend. My fish.";
        String litter = "m";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (litter.equalsIgnoreCase(String.valueOf(text.charAt(i))))
                count += 1;
        }
        System.out.println(count);
    }
}
