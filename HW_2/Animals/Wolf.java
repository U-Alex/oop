package HW_2.Animals;

import HW_2.*;

public class Wolf extends AnimalWild{
    private int id;
    boolean leader;

    public Wolf(Double height, Double weight, String eyeColor, String Habitat, String dateFound, boolean leader) {
        super(height, weight, eyeColor, Habitat, dateFound);
        this.leader = leader;
        this.id = Animal.id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return "волк";
    }

    public boolean isLeader() {
        return leader;
    }

    @Override
    public String toString() {
        return String.format("%s \t %s Вожак стаи: %s \t", 
                             this.getName(), super.toString(), (leader) ? "да" : "нет");
    }

    @Override
    public void makeSound() {
        System.out.printf("волк(%d) рычит\n", this.getId());
    }

}
