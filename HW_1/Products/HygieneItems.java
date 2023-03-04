package HW_1.Products;

import HW_1.Product;

public class HygieneItems extends Product{//Предметы гигиены
    private Integer countIn;

    public HygieneItems(String name, Double price, Integer count, String unit, Integer countIn) {
        super(name, price, count, unit);
        this.countIn = countIn;
    }
    
    public String getName() {
        return "Предметы гигиены";
    }

    @Override
    public String toString() {
        return String.format("%s Кол-во штук в уп.: %s \t", 
                             super.toString(), countIn);
    }    
}