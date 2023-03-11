package HW_3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInput {
    public TreeMap<String, String> opList;
    public TreeMap<String, String> typeList;
    public TreeMap<Integer, String[]> paramList;

    public UserInput() {
        opList = new TreeMap<>();
        opList.put("1", "добавить фигуру");
        opList.put("2", "изменить фигуру");
        opList.put("3", "удалить фигуру");
        opList.put("4", "информация о фигуре");
        opList.put("5", "список фигур (сорт.по id)");
        opList.put("6", "список фигур (сорт.по площади)");
        typeList = new TreeMap<>();
        typeList.put("1", "треугольник");
        typeList.put("2", "прямоугольник");
        typeList.put("3", "квадрат");
        typeList.put("4", "круг");
        paramList = new TreeMap<>();
        paramList.put(1, new String[]{"сторона_1", "сторона_2", "сторона_3"});
        paramList.put(2, new String[]{"сторона_1", "сторона_2"});
        paramList.put(3, new String[]{"сторона"});
        paramList.put(4, new String[]{"радиус"});
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

    public String[] inputParam(Scanner iScanner, int num) {
        System.out.println("введите параметры (целые числа) через ',' (0 -> выход)");
        System.out.println(String.join(",  ", this.paramList.get(num)));
        int size = paramList.get(num).length;
        String[] param = null;
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
