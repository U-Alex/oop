package HW_3;

import java.util.Comparator;

public class AreaComparator implements Comparator<Figure>{
    
    @Override
    public int compare(Figure o1, Figure o2) {
        return Double.compare(o1.area(), o2.area());
    }
}
