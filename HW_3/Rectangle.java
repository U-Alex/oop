package HW_3;

public class Rectangle extends Figure{
    private int id;
    private int a;
    private int b;

    public Rectangle(int a, int b) throws MyException {
        this.a = a;
        this.b = b;
        this.id = Figure.totalId;
        if (!this.checkValid(a, b)) {
            Figure.totalId--;
            throw new MyException("неверные входные параметры (a or b <= 0)");
        }
    }
    
    public Rectangle(int a) {
        this.a = a;
        this.b = a;
    }

    private boolean checkValid(int a, int b) {
        return (a > 0) && (b > 0);
    }

    @Override
    protected Double perimeter() {
        return (this.a + this.b) * 2.;
    }

    @Override
    protected Double area() {
        return (double) (this.a * this.b);
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return String.format("(%d) прямоугольник", this.id);
    }

}
