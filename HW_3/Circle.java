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
        return String.format("круг");
    }

    @Override
    public String getInfo() {
        return String.format("(%d) %s          радиус: %d    площадь: %.2f    длина окружности: %.2f", 
        this.id, this.getName(), this.radius, this.area(), this.circumference());
    }

    @Override
    protected void setParam(int[] args) {
        if (args[0] <= 0) {
            System.out.printf("неверные входные параметры (radius <= 0)\n");
        }
        else this.radius = args[0];
    }

}
