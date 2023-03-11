package HW_3;

import HW_3.Interfaces.*;

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

    @Override
    protected void setParam(int[] argsNew) {
        for (int i : argsNew) {
            if (i <= 0) {
                System.out.printf("неверные входные параметры\n");
                return;
            }
        }
        for (int i = 0; i < argsNew.length; i++) {
            this.args[i] = argsNew[i];
        }
    }
}
