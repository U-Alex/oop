package HW_3;

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
        return String.format("(%d) квадрат", this.getId());
    }
}
