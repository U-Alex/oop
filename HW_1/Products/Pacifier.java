package HW_1.Products;

public class Pacifier extends ChildensGoods{//Соска
    
    public Pacifier(String name, Double price, Integer count, String unit, Integer minimumAge, Boolean hypoallergenic) {
        super(name, price, count, unit, minimumAge, hypoallergenic);
    }

    public String getName() {
        return String.format("%s.Соска", super.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}