package model;

import java.util.Date;

public class Record {
    private String text;
    private Date deadline;

    public Record(String text, Date deadline) {
        this.text = text;
        this.deadline = deadline;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(Date date) {
        this.deadline = date;
    }

    public boolean isOverDate() {
        return this.deadline != null && this.deadline.before(new Date());
        //return (this.deadline != null) ? this.deadline.before(new Date()) : false;
    }

    @Override
    public String toString() {
        String date = (deadline != null) ? String.format("срок: %1$td.%1$tm.%1$tY", deadline) : "";
        return String.format("Запись: %s \n\t %s \t%s \t", text, date, (isOverDate()) ? "просрочено" : "");
    }
}
