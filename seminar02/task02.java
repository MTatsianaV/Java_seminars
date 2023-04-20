package seminar02;
/* Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. 
Затем вводится строка, в которой перечислены слова, которые написаны в газете.
Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
Sample Input:
а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:
7
5
 */
public class task02 {
    public static void main(String[] args) {
        String letter_Masha = "а", letter_Misha = "в";
        String words = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        String[] splitWords = words.split(" ");
        int count1 = 0, count2 = 0;
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].indexOf(letter_Masha) !=-1) count1 +=1;
            if (splitWords[i].indexOf(letter_Misha) !=-1) count2 +=1;
            System.out.println(splitWords[i]);
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
