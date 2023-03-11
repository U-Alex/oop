package HW_3;

import java.lang.Math;

public class Triangle extends Figure {
    private int id;
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws MyException {
        this.a = a;
        this.b = b;
        this.c = c;
        this.id = Figure.totalId;
        if (!this.checkValid(a, b, c)) {
            Figure.totalId--;
            throw new MyException("неверные входные параметры (a, b, c <= 0 OR a >= b + c...)");
        }
    }

    private boolean checkValid(int a, int b, int c) {
        return (a > 0) && (b > 0) && (c > 0)  &&
               (a < b + c) && (b < a + c) && (c < a + b);
    }

    @Override
    protected Double perimeter() {
        return (this.a + this.b + this.c) / 2.;
    }

    @Override
    protected Double area() {
        Double p = this.perimeter();
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    @Override
    public Integer getId() {
        return this.id;
    }  

    @Override
    public String getName() {
        return String.format("(%d) треугольник", this.id);
    }
}
