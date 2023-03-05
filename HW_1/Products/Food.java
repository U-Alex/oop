package HW_1.Products;

import HW_1.Product;

public abstract class Food extends Product{//Продукты питания
    private String expDate;
    
    public Food(String name, Double price, Integer count, String unit, String expDate) {
        super(name, price, count, unit);
        this.expDate = expDate;
    }

    public String getName() {
        return "Продукты питания";
    }

    @Override
    public String toString() {
        return String.format("%s Срок годности: %s \t", 
                             super.toString(), expDate);
    }
}

