package HW_1.Products;

public class Masks extends HygieneItems{//Маски
    
    public Masks(String name, Double price, Integer count, String unit, Integer countIn) {
        super(name, price, count, unit, countIn);
    }

    public String getName() {
        return String.format("%s.Маски", super.getName());
    }

    @Override
    public String toString() {
        //return String.format(super.toString());
        return super.toString();
    }
}