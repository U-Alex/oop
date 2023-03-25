package presenter;

import model.Model;
import view.View;

import java.util.Date;

public class Presenter {

    private final View view;
    private final Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }

    public void showAll() {
        view.printText(this.model.toString());
    }

    public void getRec(Integer index) {
        view.printText(this.model.getRec(index));
    }

    public void addRec(String text, Date deadline) {
        this.model.addRec(text, deadline);
    }

    public void editRec(Integer index, String text, Date deadline) {
        this.model.editRec(index, text, deadline);
    }

    public void delRec(Integer index) {
        this.model.delRec(index);
    }

    public void load() {
        this.model.load();
    }

    public void save() {
        this.model.save();
    }

}
