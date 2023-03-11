package HW_3.Figures;

import HW_3.Figure;
import HW_3.MyException;
import HW_3.Polygon;

public class Rectangle extends Polygon{
    private int id;

    public Rectangle(Integer[] args) throws MyException {
        super(args);
        if (args.length != 2 || !this.checkValid(args)) {
            Figure.totalId--;
            throw new MyException("неверное входные параметры ( <= 0)");
        }
        this.id = Figure.totalId;
    }
    protected Rectangle(int a) throws MyException {
        this(new Integer[]{a, a});
    }

    public Double perimeter() {
        return (args[0] + args[1]) * 2.;
    }

    public Double area() {
        return (double) (args[0] * args[1]);
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return String.format("прямоугольник");
    }

    @Override
    public String getInfo() {
        return String.format("(%d) %s стророны: %d, %d    площадь: %.2f    периметр: %.2f", 
        this.id, this.getName(), args[0], args[1], this.area(), this.perimeter());
    }

}
