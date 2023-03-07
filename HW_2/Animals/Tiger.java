package HW_2.Animals;

import HW_2.*;

public class Tiger extends AnimalWild {
    private int id;

    public Tiger(Double height, Double weight, String eyeColor, String Habitat, String dateFound) {
        super(height, weight, eyeColor, Habitat, dateFound);
        this.id = Animal.id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return "тигр";
    }

    @Override
    public String toString() {
        return String.format("%s \t %s \t", 
                             this.getName(), super.toString());
    }

    @Override
    public void makeSound() {
        System.out.printf("тигр(%d) рычит\n", this.getId());
    }
}
