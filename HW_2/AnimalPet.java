package HW_2;

public abstract class AnimalPet extends Animal{
    protected String nickname;
    protected String breed;
    protected Boolean vacc;
    protected String coatColor;
    protected String dateOfBirth;

    public AnimalPet(Double height, Double weight, String eyeColor, String nickname, String breed, Boolean vacc, String coatColor, String dateOfBirth) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vacc = vacc;
        this.coatColor = coatColor;
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString() {
        return String.format("%s Кличка: %s \t Порода: %s \t Наличие прививок: %s \t Цвет шерсти: %s \t Дата рождения: %s \t", 
                             super.toString(), nickname, breed, (vacc) ? "да" : "нет", coatColor, dateOfBirth);
    }

    protected abstract void ShowAffection();
}
