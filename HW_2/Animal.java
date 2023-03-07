package HW_2;

public abstract class Animal implements Interface {
    protected static int id = 0;
    protected Double height;
    protected Double weight;
    protected String eyeColor;

    protected Animal(Double height, Double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        id++;
    }

    @Override
    public String toString() {
        return String.format("Рост: %.2f \tВес: %.2f \tЦвет глаз: %s \t", 
                             height, weight, eyeColor);
    }

}
