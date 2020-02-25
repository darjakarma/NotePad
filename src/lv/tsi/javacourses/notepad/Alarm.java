package lv.tsi.javacourses.notepad;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        super.askInfo();
        time = Asker.askString("time");
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id" + getId() +
                "time='" + time + '\'' +
                '}';
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
}
