package HW_2.Animals;

import HW_2.*;

public class Cat extends AnimalPet{
    private int id;
    private Boolean wool;

    public Cat(Double height, Double weight, String eyeColor, String nickname, String breed, Boolean vacc, String coatColor, String dateOfBirth, Boolean wool) {
        super(height, weight, eyeColor, nickname, breed, vacc, coatColor, dateOfBirth);
        this.wool = wool;
        this.id = Animal.id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        //return String.format("кот (%d)", this.id);
        return "кот";
    }

    public boolean isWool() {
        return wool;
    }

    @Override
    public String toString() {
        return String.format("%s \t %s Наличие шерсти: %s \t", 
                             this.getName(), super.toString(), (wool) ? "да" : "нет");
    }

    @Override
    public void makeSound() {
        System.out.printf("кошка(%d) мяукает\n", this.getId());
    }

    @Override
    public void ShowAffection() {
        System.out.printf("кошка(%d) проявляет ласку\n", this.getId());
    }
}
