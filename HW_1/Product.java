package HW_1;

public class Product {
    protected String name;
    protected Double price;
    protected Integer count;
    protected String unit;

    protected Product(String name, Double price, Integer count, String unit) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }

    public String getName() {
        return "Товар";
    }

    @Override
    public String toString() {
        return String.format("Название: %s \tЦена: %.2f руб. \tКол-во: %d %s \t", 
                             name, price, count, unit);
    }

}