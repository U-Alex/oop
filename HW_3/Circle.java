package HW_3;

import java.lang.Math;

public class Circle extends Figure{
    private int id;
    private int radius;

    public Circle(int r) throws MyException {
        this.radius = r;
        this.id = Figure.totalId;
        if (!this.checkValid(r)) {
            Figure.totalId--;
            throw new MyException("неверные входные параметры (radius <= 0)");
        }
    }

    private boolean checkValid(int r) {
        return r > 0;
    }

    @Override
    protected Double perimeter() {
        return Math.PI * this.radius * 2;
    }

    @Override
    protected Double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return String.format("(%d) круг", this.id);
    }
    
}
