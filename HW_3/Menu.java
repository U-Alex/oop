package HW_3;

import java.util.Scanner;

public class Menu {
    
    public static void mainMenu(Collection coll) throws NumberFormatException, MyException {
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
                if (num == 0) continue;
                String[] param = user.inputParam(iScanner, num);
                if (param != null) coll.addFigure(num, param);
                continue;
            }
            if (num == 2) {
                coll.infoAllFigures();
                System.out.printf("выберите интересующую фигуру (0 -> выход) ");
                num = user.inputNum(iScanner, user.typeList.size());
                if (num == 0) continue;
                String[] param = user.changeParam(iScanner, coll.getFigure(num));
                if (param != null) coll.setFigure(num, param);
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
                num = user.inputNum(iScanner, Figure.totalId);
                if (num != 0) coll.infoFigure(num);
                continue;
            }
            if (num == 5) {
                if (num != 0) coll.infoAllFigures();;
                continue;
            }
            if (num == 6) {
                if (num != 0) coll.sortAllFigures();;
                continue;
            }
        }
        iScanner.close();
    }
}
