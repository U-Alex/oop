package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import presenter.Presenter;

public class ConsoleUI implements View {
    private Presenter presenter;
    private final Menu menu;
    private final Scanner scanner;
    private boolean working;

    public ConsoleUI() {
        this.menu = new Menu(this);
        this.scanner = new Scanner(System.in);
        this.working = true;
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        while (this.working) {
            System.out.println(menu.printMenu());
            String key = inputParam();
            menu.execute(key);
        }
    }

    public void end() {
        this.working = false;
    }

    public void showAll() {
        presenter.showAll();
    }

    public void addRec() {
        System.out.println("введите текст");
        String text = inputParam();
        System.out.println("введите срок (в формате dd-MM-yyyy) или пустую строку, если срок не нужен");
        Date deadline = inputDate();
        presenter.addRec(text, deadline);
    }

    public void editRec() {
        presenter.showAll();
        System.out.println("введите номер записи (0 -> выход)");
        String id = inputParam();
        if (!id.equals("0")) {
            try {
                presenter.getRec(Integer.parseInt(id));
                System.out.println("введите текст");
                String text = inputParam();
                System.out.println("введите срок (в формате dd-MM-yyyy) или пустую строку, если срок не нужен");
                Date deadline = inputDate();
                presenter.editRec(Integer.parseInt(id), text, deadline);

            } catch (NumberFormatException e) {
                System.out.println("нужно ввести число");
            }
        }
    }

    public void delRec() {
        presenter.showAll();
        System.out.println("введите номер записи (0 -> выход)");
        String id = inputParam();
        if (!id.equals("0"))
            try {
                presenter.delRec(Integer.parseInt(id));
            } catch (NumberFormatException e) {
                System.out.println("нужно ввести число");
            }
    }

    public void load() {
        presenter.load();
    }
    public void save() {
        presenter.save();
    }

    private String inputParam() {
        while (!scanner.hasNext()) scanner.next();
        return scanner.nextLine();
    }

    private Date inputDate() {
        SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
        Date pDate = null;
        try {
            pDate = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("не могу понять дату, принимаю 'отсутствие срока'");
        }
        return pDate;
    }

    @Override
    public void printText(String text) {
        System.out.println(text);
    }

}
