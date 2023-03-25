package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notebook {
    private List<Record> list;

    public Notebook() {
        this.list = new ArrayList<>();
    }

    public List<Record> getAll() {
        return this.list;
    }

    public int getSize() {
        return this.list.size();
    }

    public void clear() {
        this.list.clear();
    }

    public void addRec(String text, Date deadline) {
        this.list.add(new Record(text, deadline));
    }

    public String getRec(Integer index) {
        String rec = "";
        try {
            if (index > 0 && index <= this.list.size())
                rec = this.list.get(index-1).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rec;
    }

    public void editRec(Integer index, String text, Date deadline) {
        Record rec = this.list.get(index-1);
        rec.setText(text);
        rec.setDate(deadline);
    }

    public void addClass(Record rec) {
        this.list.add(rec);
    }

    public void delRec(Integer index) {
        try {
            if (index > 0 && index <= this.list.size())
                this.list.remove(index-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.list.size() == 0)
            return sb.append("список пуст").toString();
        sb.append("---- список записей ----\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("> %d ", i+1));
            sb.append(list.get(i).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
