package HW_3;

public abstract class Polygon extends Figure implements InterfacePerimeter{
    protected Integer[] args;

    protected Polygon(Integer[] args) throws MyException {
        super();
        if (args.length == 0 || !this.checkValid(args)) {
            Figure.totalId--;
            throw new MyException("неверные или пустые входные параметры");
        }
        this.args = args;
    }

    protected boolean checkValid(Integer[] args) {
        for (Integer arg : args) {
            if (arg <= 0) return false;
        }
        return true;
    }

}
