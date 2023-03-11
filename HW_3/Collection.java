package HW_3;

import java.util.TreeMap;

public class Collection {
    private TreeMap<Integer, Figure> tmap;

    public Collection() throws MyException {
        tmap = new TreeMap<>();

        this.tmap.put(1, new Triangle(new Integer[]{8, 10, 4}));
        this.tmap.put(2, new Rectangle(new Integer[]{20, 11}));
        this.tmap.put(3, new Square(30));
        this.tmap.put(4, new Circle(100));
    }
    
}
