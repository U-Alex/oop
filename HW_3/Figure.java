package HW_3;

public abstract class Figure {//implements Comparable<Figure> {
    protected static int totalId = 0;

    protected Figure(){
        totalId++;
    }

    protected abstract Integer getId();
    protected abstract String getName();
    protected abstract String getInfo();
    protected abstract void setParam(int[] args);

    //protected abstract boolean checkValid(Integer[] args);
    //protected abstract Double perimeter();  //периметр
    protected abstract Double area();       //площадь
    /*
    @Override
    public int compareTo(Figure o) {
        if (this.area() > o.area())         return 1;
        else if (this.area() < o.area())    return -1;
        else                                return 0;
    }*/
}
