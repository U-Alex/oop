package HW_3;

import java.lang.Math;

public class Triangle extends Polygon {
    private int id;

    public Triangle(Integer[] args) throws MyException {
        super(args);
        if (args.length != 3 || !this.checkValid(args)) {
            Figure.totalId--;
            throw new MyException("неверные входные параметры (a, b, c <= 0 OR a >= b + c...)");
        }
        this.id = Figure.totalId;
    }

    @Override
    protected boolean checkValid(Integer[] args) {
        return (args[0] < args[1] + args[2]) && (args[1] < args[0] + args[2]) && (args[2] < args[0] + args[1]);
    }

    public Double perimeter() {
        return (double) (this.args[0] + this.args[1] + this.args[2]);
    }

    public Double area() {
        Double p = this.perimeter() / 2;
        return Math.sqrt(p * (p-args[0]) * (p-args[1]) * (p-args[2]));
    }

    @Override
    public Integer getId() {
        return this.id;
    }  

    @Override
    public String getName() {
        return String.format("треугольник");
    }
    
    @Override
    public String getInfo() {
        return String.format("(%d) %s   стророны: %d, %d, %d    площадь: %.2f    периметр: %.2f", 
        this.id, this.getName(), args[0], args[1], args[2], this.area(), this.perimeter());
    }
}
