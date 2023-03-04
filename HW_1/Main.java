package HW_1;

import HW_1.Products.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Food("name1", 1.0, 10, "шт", "expDate");
        Product p2 = new Beverages("name2", 2.0, 20, "шт", "volume");
        Product p3 = new HygieneItems("name3", 3.0, 30, "шт", 30);
        Product p4 = new ChildensGoods("name4", 4.0, 40, "шт", 3, true);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        Product p11 = new Milk("name11", 11.0, 111, "шт", "3", 12.5);
        Product p21 = new Lemonade("name21", 14.0, 121, "шт", "6");
        Product p12 = new Bread("name12", 16.0, 100, "шт", "8", "16");
        Product p13 = new Eggs("name13", 17.0, 109, "шт", "9", 16);
        Product p31 = new Masks("name31", 19.0, 15, "шт", 10);
        Product p32 = new ToiletPaper("name32", 20.0, 16, "шт", 4, 6);
        Product p41 = new Diapers("name32", 22.0, 1, "шт", 1, true, "32", 1, 6, "шорты");
        Product p42 = new Pacifier("name32", 22.0, 1, "шт", 1, false);
        System.out.println(p11);
        System.out.println(p21);
        System.out.println(p12);
        System.out.println(p13);
        System.out.println(p31);
        System.out.println(p32);
        System.out.println(p41);
        System.out.println(p42);


    }




    
}
