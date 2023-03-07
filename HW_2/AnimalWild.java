package HW_2;

public abstract class AnimalWild extends Animal {
    protected String Habitat;
    protected String dateFound;

    public AnimalWild(Double height, Double weight, String eyeColor, String Habitat, String dateFound) {
        super(height, weight, eyeColor);
        this.Habitat = Habitat;
        this.dateFound = dateFound;
    }

    @Override
    public String toString() {
        return String.format("%s Место обитания: %s \t Дата нахождения: %s \t", 
                             super.toString(), Habitat, dateFound);
    }

}
