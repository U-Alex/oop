package HW_2.Animals;

import java.util.Random;

import HW_2.*;

public class Dog extends AnimalPet{
    private int id;
    private boolean training;

    public Dog(Double height, Double weight, String eyeColor, String nickname, String breed, Boolean vaccinations, String coatColor, String dateOfBirth, Boolean training) {
        super(height, weight, eyeColor, nickname, breed, vaccinations, coatColor, dateOfBirth);
        this.training = training;
        this.id = Animal.id;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        //return String.format("собака (%d)", this.id);
        return "собака";
    }

    public boolean isTraining() {
        return training;
    }

    @Override
    public String toString() {
        return String.format("%s \t %s Дрессирован: %s \t", 
                             this.getName(), super.toString(), (training) ? "да" : "нет");
    }

    @Override
    public void makeSound() {
        System.out.printf("собака(%d) гавкает\n", this.getId());
    }

    @Override
    public void ShowAffection() {
        System.out.printf("собака(%d) проявляет ласку\n", this.getId());
    }

    public void Train() {
        if (this.training) System.out.printf("собака(%d) уже дрессирована\n", this.getId());
        else {
            Random rnd = new Random();
            this.training = rnd.nextBoolean();
            System.out.printf("собака(%d) дрессировка %s удалась\n", this.getId(), (this.training) ? "" : "не");
        }
    }
}
