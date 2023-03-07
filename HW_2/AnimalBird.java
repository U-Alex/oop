package HW_2;

public abstract class AnimalBird extends Animal{
    protected Double altitude;

    public AnimalBird(Double height, Double weight, String eyeColor, Double altitude) {
        super(height, weight, eyeColor);
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return String.format("%s Высота полёта: %.1f \t", 
                             super.toString(), altitude);
    }

    protected abstract void Fly();
}
