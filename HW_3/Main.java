package HW_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Collection coll = new Collection();

        UserInput user = new UserInput();
        int num;
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("выберите операцию: (0 -> выход)");
            user.printOpList();
            num = user.inputNum(iScanner, user.opList.size());
            if (num == 0) break;

            if (num == 1) {
                System.out.println("выберите тип фигуры: (0 -> выход)");
                user.printTypeList();
                num = user.inputNum(iScanner, user.typeList.size());
                String[] param = user.inputParam(iScanner, num);
                if (param != null) coll.addFigure(num, param);
                continue;
            }


            if (num == 3) {
                coll.infoAllFigures();
                System.out.printf("выберите удаляемую фигуру (0 -> выход) ");
                num = user.inputNum(iScanner, Figure.totalId);
                if (num != 0) coll.delFigure(num);
                continue;
            }

            if (num == 4) {
                coll.infoAllFigures();
                System.out.printf("выберите интересующую фигуру (0 -> выход) ");
                num = user.inputNum(iScanner, null);
                if (num != 0) coll.infoFigure(num);
                continue;
            }

            if (num == 5) {
                if (num != 0) coll.infoAllFigures();;
                continue;
            }

        }
        iScanner.close();





        /*
        try {
            Figure f1 = new Triangle(new Integer[]{8, 10, 4});
            System.out.println(f1.getName());
            System.out.println(((Triangle)f1).perimeter());
            System.out.println(((Triangle)f1).area());
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }

        try {
            Figure f2 = new Rectangle(new Integer[]{20, 11});
            System.out.println(f2.getName());
            System.out.println(((Rectangle)f2).perimeter());
            System.out.println(((Rectangle)f2).area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        try {
            Figure f3 = new Square(3);
            System.out.println(f3.getName());
            System.out.println(((Square)f3).perimeter());
            System.out.println(((Square)f3).area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

        try {
            Figure f6 = new Rectangle(new Integer[]{20, 110});
            System.out.println(f6.getName());
            System.out.println(((Rectangle)f6).perimeter());
            System.out.println(((Rectangle)f6).area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

        try {
            Figure f4 = new Circle(0);
            System.out.println(f4.getName());
            System.out.println(((Circle)f4).circumference());
            System.out.println(((Circle)f4).area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

        try {
            Figure f5 = new Circle(1);
            System.out.println(f5.getName());
            System.out.println(((Circle)f5).circumference());
            System.out.println(((InterfaceArea)f5).area());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        */

    
    }

}
