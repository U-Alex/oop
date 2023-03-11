package HW_3;

public final class Square extends Rectangle {
    private int id;

    public Square(int a) throws MyException {
        super(a);
        this.id = Figure.totalId;
        if (a <= 0) {
            Figure.totalId--;
            throw new MyException("неверные входные параметры (a <= 0)");
        }
    }
    
    @Override
    public Integer getId() {
        return this.id;
    } 

    @Override
    public String getName() {
        return String.format("(%d) квадрат", this.getId());
    }
}
