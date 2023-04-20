package seminar02_home;

/*На первой строке записывается натуральное число n - количество строчек в книге. 
Затем вводится n строк - строки книги. 
потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. 
Потом вводится m строк - вида "продукт1 - продукт2", 
где продукт1 - продукт, на который у человека аллергия и 
продукт2 - продукт, на который следует заменить продукт1. 
Гарантируется что любой продукт состоит из 1 слова. 
Название продуктов написаны строчными буквами. 
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
На окончания не обращайте внимание. 
ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, 
то и замена тоже должна начинаться с большой буквы!
Sample Input:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко

Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни. */
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк в книге: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] recipes = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите рецепт №" + (i+1) + ": ");
            recipes[i] = sc.nextLine();
        }
        System.out.println("Введите количество аллергенных продуктов: ");
        int m = Integer.parseInt(sc.nextLine());
        String[] allergy = new String[m];
        String[] replace = new String[m];
        //Map<String, String> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Введите через дефис, алергенный продукт №" + (i+1) + " и на какой продукт его следует заменить: ");
            String[] s = sc.nextLine().split(" - ");
            allergy[i] = s[0];
            replace[i] = s[1];
/*             if (Character.isUpperCase(replace[i].charAt(0))) { // если первая буква замены заглавная, 
                                                                     //делаем такую же первую букву у замены в карте
                map.put(allergy[i], replace[i]);
            } else { // иначе первую букву замены делаем строчной
                map.put(allergy[i], replace[i].toLowerCase());
            } */
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                recipes[i].replace(allergy[j], replace[j]);


                /* recipes[i] = recipes[i].replaceAll(allergy[j], map.get(allergy[j])); // заменяем продукт на замену из карты
                recipes[i] = recipes[i].replace(allergy[j].substring(0, 1).toUpperCase() + allergy[j].substring(1), // заменяем продукт с заглавной буквы, если нужно
                                                map.get(allergy[j]).substring(0, 1).toUpperCase() + map.get(allergy[j]).substring(1));
            */ }
            System.out.println(recipes[i]);
        }





        sc.close();
    }
}

