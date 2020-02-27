package lv.tsi.javacourses.notepad;

import lv.tsi.javacourses.notepad.records.AbstractRecord;

import java.util.*;

public class RecordDAO {//создает колекцию  лист, записывает,удаляет
    private List<AbstractRecord> records = new ArrayList<>();

    public void add(AbstractRecord rec) {
        records.add(rec);
    }

    public List<AbstractRecord> getAllRecords() {
        return Collections.unmodifiableList(records);
    }

    public void remove(int id) {

        // ВАРИАНТ 1
        //     int size = records.size();
        //   for (int i = 0; i < records.size(); i++) {
        //     var r = records.get(i);
        //    if (r.getId() == id);
        //  records.remove(i);
        //+ варинат _size++_ может понадобиться в будущем
        // break;

        // ВАРИАНТ 2
        records.removeIf(r -> r.getId() == id);

        // ВАРИАНТ 3
     //   Iterator<Record> i = records.iterator();
      //   while (i.hasNext()) {
        // Record r = i.next();
        // if (r.getId() == id) {
           // i.remove();
            // break;

       //  ВАРИАНТ 4
        // ListIterator <Record> = i
        }
}