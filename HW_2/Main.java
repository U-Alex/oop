package HW_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        UserInput user = new UserInput();
        int num;
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("выберите операцию: (0 -> выход)");
            user.printOpList();
            num = user.inputNum(iScanner, 7);
            if (num == 0) break;
            if (num == 1) {
                System.out.println("выберите тип животного: (0 -> выход)");
                user.printTypeList();
                num = user.inputNum(iScanner, 6);
                String[] param = user.inputAnimal(iScanner, num);
                if (param != null)
                    zoo.addAnimal(num, param);
                continue;
            }
            if (num == 2) {
                zoo.infoAllAnimal();
                System.out.printf("выберите удаляемую позицию (0 -> выход) ");
                num = user.inputNum(iScanner, null);
                if (num != 0) zoo.delAnimal(num);
                continue;
            }
            if (num == 3) {
                zoo.infoAllAnimal();
                System.out.printf("выберите интересующую позицию (0 -> выход) ");
                num = user.inputNum(iScanner, null);
                if (num != 0) zoo.infoAnimal(num);
                continue;
            }
            if (num == 4) {
                zoo.infoAllAnimal();
                continue;
            }
            if (num == 5) {
                zoo.infoAllAnimal();
                System.out.printf("выберите интересующую позицию (0 -> выход) ");
                num = user.inputNum(iScanner, null);
                if (num != 0) zoo.getSoundAnimal(num);
                continue;
            }
            if (num == 6) {
                if (num != 0) zoo.getAllSoundAnimal();
                continue;
            }
            if (num == 7) {
                if (num != 0) zoo.uniqueActions();
                continue;
            }
        }
        iScanner.close();
    }
}
