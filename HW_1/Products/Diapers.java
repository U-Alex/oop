package HW_1.Products;

public class Diapers extends ChildensGoods{//Подгузники
    private String size;
    private Integer MinWeight;
    private Integer MaxWeight;
    private String type;

    public Diapers(String name, Double price, Integer count, String unit, Integer minimumAge, Boolean hypoallergenic,
                   String size, Integer MinWeight, Integer MaxWeight, String type) {
        super(name, price, count, unit, minimumAge, hypoallergenic);
        this.size = size;
        this.MinWeight = MinWeight;
        this.MaxWeight = MaxWeight;
        this.type = type;
    }

    public String getName() {
        return String.format("%s.Подгузники", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%s Размер: %s \tмин/макс. вес: %d/%d \tтип: %s \t", 
                             super.toString(), size, MinWeight, MaxWeight, type);
    }
}