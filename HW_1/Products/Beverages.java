package HW_1.Products;

import HW_1.Product;

public class Beverages extends Product{//Напитки
    private String volume;

    public Beverages(String name, Double price, Integer count, String unit, String volume) {
        super(name, price, count, unit);
        this.volume = volume;
    }
    
    public String getName() {
        return "Напитки";
    }

    @Override
    public String toString() {
        return String.format("%s Объём: %s \t", 
                             super.toString(), volume);
    }
}
