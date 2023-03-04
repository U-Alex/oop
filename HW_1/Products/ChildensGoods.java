package HW_1.Products;

import HW_1.Product;

public class ChildensGoods extends Product{//Детские товары
    private Integer minimumAge;
    private boolean hypoallergenic;

    public ChildensGoods(String name, Double price, Integer count, String unit, Integer minimumAge, Boolean hypoallergenic) {
        super(name, price, count, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    public String getName() {
        //return String.format("%s.Детские товары", super.getName());
        return "Детские товары";
    }
    
    @Override
    public String toString() {
        return String.format("%s Мин. возраст: %s \tГипоаллергенность: %s \t", 
                             super.toString(), minimumAge, (hypoallergenic) ? "да" : "нет");
    }    
}