package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;

import java.time.LocalTime;

public class Alarm extends Note {
    private LocalTime time;

    @Override
    public void askInfo() {
        super.askInfo();
        time = Asker.askTime("time");
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                "time='" + StringDateTime.timeToString(time) + '\''; // чтобы выводил так как мы задали в TIME_PATTERN
    }

    @Override
    protected String type() {
        return "Alarm";
    }

    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
}

