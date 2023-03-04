package HW_1.Products;

import HW_1.Product;

public class Beverages extends Product{//Напитки
    private String volume;
    private String expDate;

    public Beverages(String name, Double price, Integer count, String unit, String volume, String expDate) {
        super(name, price, count, unit);
        this.volume = volume;
        this.expDate = expDate;
    }
    
    public String getName() {
        return "Напитки";
    }

    @Override
    public String toString() {
        return String.format("%s Объём: %s \t Срок годности: %s \t", 
                             super.toString(), volume, expDate);
    }
}
