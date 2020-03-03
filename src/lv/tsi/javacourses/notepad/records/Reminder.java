package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder extends Alarm implements Expirable { // масло масленное но пишем для коллег - если вдруг понадобиться новому доугому человеку читать мой код
    private LocalDate date;
    private boolean dismissed; //по умолчанию булайн - false !!!


    @Override
    public boolean isExpired() { // если юзер задисмиссил то не будет показываться та ИД что ввел!!!
        if (dismissed) {
            return false;
        }
        var now = LocalDateTime.now();
        var dt = LocalDateTime.of(date, getTime());
        return now.isAfter(dt);// сработает (Reminder) когда дата и время будут достигнуты
    }

    @Override
    public void dismiss() {
        dismissed = true;
    }

    @Override
    public void askInfo() {
        super.askInfo();
        setDate(Asker.askDate("date"));
    }


    @Override
    public String stringContent() {
        return super.stringContent() +
                "date= " + StringDateTime.dateToString(date) + '\'';
    }

    @Override
    protected String type() {
        return "Reminder";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
