package HW_2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInput {
    private TreeMap<String, String> opList;
    private TreeMap<String, String> typeList;
    private TreeMap<Integer, String[]> paramList;

    public UserInput() {
        typeList = new TreeMap<>();
        typeList.put("1", "кот");
        typeList.put("2", "тигр");
        typeList.put("3", "собака");
        typeList.put("4", "волк");
        typeList.put("5", "курица");
        typeList.put("6", "аист");
        opList = new TreeMap<>();
        opList.put("1", "добавить животное");
        opList.put("2", "удалить животное");
        opList.put("3", "информация о животном");
        opList.put("4", "информация о всех животных");
        opList.put("5", "звук животного");
        opList.put("6", "звук всех животных");
        opList.put("7", "уникальные действия");
        paramList = new TreeMap<>();
        paramList.put(1, new String[]{"Рост", "Вес", "Цвет глаз", "Кличка", "Порода", "Наличие прививок (да/Нет)", "Цвет шерсти", "Дата рождения", "Наличие шерсти (да/Нет)"});
        paramList.put(2, new String[]{"Рост", "Вес", "Цвет глаз", "Место обитания", "Дата нахождения"});
        paramList.put(3, new String[]{"Рост", "Вес", "Цвет глаз", "Кличка", "Порода", "Наличие прививок (да/Нет)", "Цвет шерсти", "Дата рождения", "Дрессирован (да/Нет)"});
        paramList.put(4, new String[]{"Рост", "Вес", "Цвет глаз", "Место обитания", "Дата нахождения", "Вожак стаи (да/Нет)"});
        paramList.put(5, new String[]{"Рост", "Вес", "Цвет глаз", "Высота полёта"});
        paramList.put(6, new String[]{"Рост", "Вес", "Цвет глаз", "Высота полёта"});
    }
    
    public void printTypeList() {
        for (Map.Entry<String, String> item : this.typeList.entrySet()) {
            System.out.printf("%s - %s   ", item.getKey(), item.getValue());
        }
    }

    public void printOpList() {
         for (Map.Entry<String, String> item : this.opList.entrySet()) {
            System.out.printf("%s - %s   ", item.getKey(), item.getValue());
        }
    }

    public Integer inputNum(Scanner iScanner, Integer max) {
        boolean ok = false;
        int i = 0;
        while (!ok) {
            while (!iScanner.hasNextInt()){
                iScanner.next();
            }
            i = iScanner.nextInt();
            if (i >= 0 && (max == null || i <= max)) ok = true;
        }
        return i;
    }

    public String[] inputAnimal(Scanner iScanner, int num) {
        System.out.println("введите параметры через ',' (0 -> выход)");
        System.out.println(String.join(",  ", this.paramList.get(num)));
        int size = paramList.get(num).length;
        String[] param = null;// = new String[size];
        boolean ok = false;
        while (!ok) {
            while (!iScanner.hasNext()) {
                iScanner.next();
            }
            param = iScanner.next().split(",");
            if (param[0].equals("0")) break;
            if (param.length == size) {
                ok = true;
                return param;
            }
            else System.out.println("ошибка ввода");
        }
        return null;
    }
}
