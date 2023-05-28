package seminar06;

import java.util.*;

public class Cat {
    private String name;
    private int age;
    private String owner;
    private String poroda;
    private List<String> healthHistory;

    public Cat(String name, int age, String owner, String poroda) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.poroda = poroda;
        healthHistory = new ArrayList<>();
    }

    public String toString() {
        return "name: " + name + ", age: " + age + ", owner: " + owner + ", poroda: " + poroda;
    }

    public void addInHistory(String message) {
        healthHistory.add(message);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && owner.equals(cat.owner) && poroda.equals(cat.poroda);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7 * age + 11 * owner.hashCode() + 17 * poroda.hashCode();
    }

}
