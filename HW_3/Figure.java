package HW_3;

public abstract class Figure {
    protected static int totalId = 0;

    protected Figure(){
        totalId++;
    }

    protected abstract Integer getId();
    protected abstract String getName();
    
    protected abstract Double perimeter();  //периметр
    protected abstract Double area();       //площадь
    
}
