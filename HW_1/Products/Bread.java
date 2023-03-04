package HW_1.Products;

public class Bread extends Food{//Хлеб
    private String flour;
    
    public Bread(String name, Double price, Integer count, String unit, String expDate, String flour) {
        super(name, price, count, unit, expDate);
        this.flour = flour;
    }

    public String getName() {
        return String.format("%s.Хлеб", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%s Тип муки: %s \t", 
                             super.toString(), flour);
    }
}