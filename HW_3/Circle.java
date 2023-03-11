package HW_3;

import java.lang.Math;

public class Circle extends Figure implements InterfaceCircumference {
    private int id;
    private int radius;

    public Circle(int r) throws MyException {
        this.radius = r;
        this.id = Figure.totalId;
        if (r <= 0) {//(!this.checkValid(r)) {
            Figure.totalId--;
            throw new MyException("неверные входные параметры (radius <= 0)");
        }
    }

    //private boolean checkValid(int r) {
    //    return r > 0;
    //}

    public Double circumference() {
        return Math.PI * this.radius * 2;
    }

    public Double area() {
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
