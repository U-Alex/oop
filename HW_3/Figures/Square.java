package HW_3.Figures;

import HW_3.Figure;
import HW_3.MyException;

public final class Square extends Rectangle {
    private int id;

    public Square(int a) throws MyException {
        super(a);
        //if (args.length != 1 || !this.checkValid(args)) {
        //    Figure.totalId--;
        //    throw new MyException("неверное входные параметры (a <= 0)");
        //}
        this.id = Figure.totalId;
    }
    
    @Override
    public Integer getId() {
        return this.id;
    } 

    @Override
    public String getName() {
        return String.format("квадрат");
    }

    @Override
    public String getInfo() {
        return String.format("(%d) %s       стророна: %d    площадь: %.2f    периметр: %.2f", 
        this.getId(), this.getName(), args[0], this.area(), this.perimeter());
    }
}
