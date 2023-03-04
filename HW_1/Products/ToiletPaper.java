package HW_1.Products;

public class ToiletPaper extends HygieneItems{//Туалетная бумага
    private Integer layers;

    public ToiletPaper(String name, Double price, Integer count, String unit, Integer countIn, Integer layers) {
        super(name, price, count, unit, countIn);
        this.layers = layers;
    }

    public String getName() {
        return String.format("%s.Туалетная бумага", super.getName());
    }

    @Override
    public String toString() {
        return String.format("%s Кол-во слоёв: %s \t", 
                             super.toString(), layers);
    }
}