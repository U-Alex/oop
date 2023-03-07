package HW_2.Animals;

import HW_2.*;

public class Chicken extends AnimalBird{
    private int id;

    public Chicken(Double height, Double weight, String eyeColor, Double altitude) {
        super(height, weight, eyeColor, altitude);
        this.id = Animal.id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return "курица";
    }

    @Override
    public String toString() {
        return String.format("%s \t %s \t", 
                             this.getName(), super.toString());
    }

    @Override
    public void makeSound() {
        System.out.printf("курица(%d) кудахчет\n", this.getId());
    }

    @Override
    public void Fly() {
        System.out.printf("курица(%d) я не могу взлететь на %.1f метров, я же курица\n", this.getId(), super.altitude);
    }
}
