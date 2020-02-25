package lv.tsi.javacourses.notepad;

public class Reminder extends Alarm {
    private String date;


    @Override
    public void askInfo() {
        super.askInfo();
        setDate(Asker.askString("date"));
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id= " + getId() + '\'' +
                "text= " + getText() + '\'' +
                "time= " + getTime() + '\'' +
                "date= " + getDate() + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}