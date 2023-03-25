package model;

import java.util.Date;

public class Model {
    FileOperations fileOperations;
    Notebook notebook;

    public Model(String path) {
        this.notebook = new Notebook();
        fileOperations = new FileOperations(path, this.notebook);
    }

    public void addRec(String text, Date deadline) {
        notebook.addRec(text, deadline);
    }

    public String getRec(Integer index) {
        return notebook.getRec(index);
    }

    public void editRec(Integer index, String text, Date deadline) {
        notebook.editRec(index, text, deadline);
    }

    public void delRec(Integer index) {
        notebook.delRec(index);
    }

    public String toString() {
        return notebook.toString();
    }

    public void load() {
        fileOperations.load();
    }

    public void save() {
        fileOperations.save();
    }
}
