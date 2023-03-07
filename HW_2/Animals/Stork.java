package HW_2.Animals;

import HW_2.*;

public class Stork extends AnimalBird{
    private int id;

    public Stork(Double height, Double weight, String eyeColor, Double altitude) {
        super(height, weight, eyeColor, altitude);
        this.id = Animal.id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return "аист";
    }

    @Override
    public String toString() {
        return String.format("%s \t %s \t", 
                             this.getName(), super.toString());
    }

    @Override
    public void makeSound() {
        System.out.printf("аист(%d) кричит\n", this.getId());
    }

    @Override
    public void Fly() {
        System.out.printf("аист(%d) я лечу на %.1f метрах\n", this.getId(), super.altitude);
    }
}