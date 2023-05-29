package seminar06_home;

import java.util.*;

public class Notebook {
    private String brand;
    private String model;
    private int ramSize;
    private int storageCapacity;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, String model, int ramSize, int storageCapacity, String operatingSystem,
            String color) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public boolean matches(Map<String, Object> filters) {
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            switch (key) {
                case "brand":
                    if (!brand.equals(value)) {
                        return false;
                    }
                    break;
                case "ramSize":
                    if (ramSize < (int) value) {
                        return false;
                    }
                    break;
                case "storageCapacity":
                    if (storageCapacity < (int) value) {
                        return false;
                    }
                    break;
                case "operatingSystem":
                    if (!operatingSystem.equals(value)) {
                        return false;
                    }
                    break;
                case "color":
                    if (!color.equals(value)) {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notebook> notebooks = Arrays.asList(
                new Notebook("Lenovo", "ThinkPad X1 Carbon", 16, 512, "Windows 10 Pro", "Black"),
                new Notebook("Apple", "MacBook Pro", 8, 256, "macOS", "Silver"),
                new Notebook("Dell", "XPS 13", 16, 512, "Ubuntu", "White"),
                new Notebook("HP", "Spectre x360", 16, 1_000, "Windows 10 Home", "Rose Gold"),
                new Notebook("Microsoft", "Surface Laptop 3", 8, 128, "Windows 10 Home", "Platinum"));

        Map<String, String> filterCriteria = new LinkedHashMap<>();
        String inputKey = "";
        while (!inputKey.equals("q")) {
            System.out.println(
                    "Выберите параметр для фильтрации (brand, model, ramSize, storageCapacity, operatingSystem, color) или q для выхода: ");
            inputKey = scanner.next();

            if (!isValidKey(inputKey)) {
                System.out.println("Неверный параметр. Попробуйте еще раз.");
            } else if (!inputKey.equals("q")) {
                System.out.println("Введите значение параметра: ");
                String inputValue = scanner.next();
                filterCriteria.put(inputKey, inputValue);
            }
        }

        System.out.println("Выбранные параметры: " + filterCriteria);

        Map<String, Object> filters = new HashMap<>();
        for (Map.Entry<String, String> entry : filterCriteria.entrySet()) {
            String key1 = entry.getKey();
            String value1 = entry.getValue();

            switch (key1) {
                case "brand":
                case "operatingSystem":
                case "color":
                    filters.put(key1, value1);
                    break;
                case "ramSize":
                case "storageCapacity":
                    filters.put(key1, Integer.parseInt(value1));
                    break;
            }
        }

        List<Notebook> filteredNotebooks = filterNotebooks(notebooks, filters);

        System.out.println("Подходящие ноутбуки: ");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook.getBrand() + " " + notebook.getModel());
        }
    }

    public static List<Notebook> filterNotebooks(List<Notebook> notebooks, Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            if (notebook.matches(filters)) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    public static boolean isValidKey(String key) {
        return key.equals("brand") || key.equals("model") || key.equals("ramSize")
                || key.equals("storageCapacity") || key.equals("operatingSystem")
                || key.equals("color") || key.equals("q");
    }
}
