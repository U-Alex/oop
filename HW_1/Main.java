package HW_1;

import java.util.ArrayList;
import java.util.List;

import HW_1.Products.*;

public class Main {
    public static void main(String[] args) {
        List<Product> prod = readDb();
        viewProducts(prod);
    }

    public static void viewProducts(List<Product> prodList) {
        for (Product prod : prodList) {
            System.out.printf("%s\n", prod.getName());
            System.out.printf("    %s\n", prod);
        }
    }

    private static List<Product> readDb() {
        List<Product> prod = new ArrayList<>();

        prod.add(new Milk("Серышевское", 76.0, 10, "б","2л", "13.03.2023", 12.5));
        prod.add(new Lemonade("CacaCola", 104.0, 121, "шт", "2.5л", "13.03.2023"));
        prod.add(new Lemonade("Fanta", 104.0, 121, "шт", "2.5л", "14.03.2023"));
        prod.add(new Bread("Пшеничный", 30.0, 100, "шт", "13.03.2023", "пшеничная 1сорт"));
        prod.add(new Bread("Бородинский", 20.0, 100, "шт", "13.03.2023", "ржаная 2сорт"));
        prod.add(new Eggs("перепелиные", 21.0, 30, "уп", "13.04.2023", 10));
        prod.add(new Eggs("куриные 1с", 28.0, 300, "уп", "13.04.2023", 20));
        prod.add(new Masks("намордник", 10.0, 150, "шт", 10));
        prod.add(new Masks("респиратор", 100.0, 10, "шт", 1));
        prod.add(new ToiletPaper("мягкая", 30.0, 160, "шт", 8, 6));
        prod.add(new ToiletPaper("жесткая", 30.0, 100, "шт", 8, 6));
        prod.add(new Diapers("хагис", 220.0, 100, "шт", 1, true, "32", 1, 6, "шорты"));
        prod.add(new Pacifier("обманка", 2.0, 700, "шт", 0, false));
        
        return prod;
    }
    
}
