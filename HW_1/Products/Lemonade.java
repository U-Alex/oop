package HW_1.Products;

public class Lemonade extends Beverages{//Лимонад
    
    public Lemonade(String name, Double price, Integer count, String unit, String volume, String expDate) {
        super(name, price, count, unit, volume, expDate);
    }

    public String getName() {
        return String.format("%s.Лимонад", super.getName());
    }

    @Override
    public String toString() {
        //return String.format(super.toString());
        return super.toString();
    }
}