package HW_1.Products;

public class Milk extends Beverages{//Молоко
    private Double fat;
    
    public Milk(String name, Double price, Integer count, String unit, String volume, String expDate, Double fat) {
        super(name, price, count, unit, volume, expDate);
        this.fat = fat;
    }

    public String getName() {
        return String.format("%s.Молоко", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%s Процент жирности: %.1f \t", 
                             super.toString(), fat);
    }
}