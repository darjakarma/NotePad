package lv.tsi.javacourses.notepad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecordDAO {
    private List<Record> records = new ArrayList<>();

    public void add(Record rec) {
        records.add(rec);
    }

    public List<Record> getAllRecords() {
        return Collections.unmodifiableList(records);
    }

    public void remove(int id) {
            //  records get3
        } // можно использовать для нахождения индкса по ИД...  for (int i = 0; i < Math.min(leaders.size(), 5); i++) {// Когда нужно установить не меньше чего то но не точно
        //  GameResult r = leaders.get(i);
        // System.out.printf("%-" + maxLen + "s %2d %3.2f%n", r.getName(), r.getTriesCount(), r.getGameTime() / 1000.0);
        // }
    }
