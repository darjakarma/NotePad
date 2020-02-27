package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Reminder extends Alarm {
    private String date;


    @Override
    public void askInfo() {
        super.askInfo();
        setDate(Asker.askString("date"));
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                "date= " + getDate() + '\'' ;
    }

    @Override
    protected String type() {
        return "Reminder";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}