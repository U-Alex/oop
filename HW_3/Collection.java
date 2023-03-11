package HW_3;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class Collection {
    private TreeMap<Integer, Figure> tmap;

    public Collection() throws MyException {
        tmap = new TreeMap<>();

        this.tmap.put(1, new Triangle(new Integer[]{8, 10, 9}));
        this.tmap.put(2, new Rectangle(new Integer[]{20, 21}));
        this.tmap.put(3, new Square(20));
        this.tmap.put(4, new Circle(10));
    }
 
    public void addFigure(int num, String[] p) throws MyException, NumberFormatException {
        Figure ob = null;
        try {
            if (num == 1)
                ob = new Triangle(new Integer[]{Integer.parseInt(p[0]), Integer.parseInt(p[1]),Integer.parseInt(p[2])});
            if (num == 2)
                ob = new Rectangle(new Integer[]{Integer.parseInt(p[0]), Integer.parseInt(p[1])});
            if (num == 3)
                ob = new Square(Integer.parseInt(p[0]));
            if (num == 4)
                ob = new Circle(Integer.parseInt(p[0]));

            tmap.put(ob.getId(), ob);
        }
        catch (MyException e){
            System.out.printf("ERROR - %s\n", e.getMessage().toString());
        }
        catch (NumberFormatException n){
            System.out.printf("ERROR - %s\n", n.getMessage().toString());
        }
    }

    public void delFigure(int id) {
        tmap.remove(id);
    }

    public void infoFigure(int id) {
        System.out.printf("-> %s\n", tmap.get(id).getInfo());
    }

    public void infoAllFigures() {
        for (Map.Entry<Integer, Figure> item : tmap.entrySet()) {
            Figure temp = item.getValue();
            System.out.printf("%d - %s\n", temp.getId(), temp.getInfo());
            //System.out.println(temp.area());
        }
    }

    public void sortAllFigures() {
        List<Figure> list = new ArrayList<>();
        for (Map.Entry<Integer, Figure> item : tmap.entrySet()) {
            list.add(item.getValue());
        }
        list.sort(new AreaComparator());
        for (Figure temp : list) {
            System.out.printf("%d - %s\n", temp.getId(), temp.getInfo());
            //System.out.println(temp.area());
        }
    }

    public Figure getFigure(int id) {
        return tmap.get(id);
    }

    public void setFigure(int id, String[] p) {
        int[] temp = Stream.of(p).mapToInt(Integer::parseInt).toArray();
        tmap.get(id).setParam(temp);
    }
}
