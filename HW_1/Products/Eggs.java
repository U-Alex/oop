package HW_1.Products;

public class Eggs extends Food{//Яйца
    private Integer countIn;
    
    public Eggs(String name, Double price, Integer count, String unit, String expDate, Integer countIn) {
        super(name, price, count, unit, expDate);
        this.countIn = countIn;
    }

    public String getName() {
        return String.format("%s.Яйца", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%s Кол-во штук в уп.: %s \t", 
                             super.toString(), countIn);
    }
}