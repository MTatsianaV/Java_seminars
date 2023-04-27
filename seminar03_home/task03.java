package seminar03_home;
/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class task03 {
    public static void main(String[] args) {
        ArrayList<String> listOfPlanets = new ArrayList<String>();
        CreateListOfPlanets(listOfPlanets, 10);
        System.out.println(listOfPlanets);
        System.out.println(SumOfPlanets(listOfPlanets));
    }

    static void CreateListOfPlanets(List<String> list, int size_list) {
        String[] planetNames = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун",
                "Плутон" };
        Random rand = new Random();
        for (int i = 0; i < size_list; i++) {
            int index = rand.nextInt(planetNames.length);
            list.add(planetNames[index]);
        }
    }

    static Set<String> SumOfPlanets(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String planet : list) {
            set.add(planet + "->" + Collections.frequency(list, planet));
        }
        return set;
    }
}
