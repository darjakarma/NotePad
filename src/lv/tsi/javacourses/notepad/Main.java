package lv.tsi.javacourses.notepad;

import lv.tsi.javacourses.notepad.records.*;

public class Main {
    private static RecordDAO records = new RecordDAO();

    public static void main(String[] args) {
        for (; ; ) {
            String cmd = Asker.askString("command");
            switch (cmd) {
                case "exit":
                    System.out.println("Good bye");
                    return;
                case "info":
                case "help":
                    showHelp(); // вручную прописаный метод. чтобы это сделать ВСЕГДА прописывай скобки после названия (ниже смотри)
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                case "delete":
                case "del":
                case "remove":
                case "rm":
                    //сделать оповещение что нет такой ИД:
                    deleteRecord();
                    break;
                case "search":
                    searchRecord();
                    break;
                case "expired":
                    showExpired();
                    break;
                case "dismiss":
                    dismissExpirable();
                    break;
                default:
                    System.out.println("Wrong command");

            }
        }
    }

    private static void dismissExpirable() {
        int id = Asker.askInt("Enter ID to dismiss");
        for (var r : records.getAllRecords()) {
            if (r.getId() == id) {
                if (r instanceof Expirable) {//сли рекодро экспайрится от Экпарибл
                    Expirable e = (Expirable) r;
                    e.dismiss();
                } else {
                    System.out.println("It isn't expirable record");
                }
            }
        }
    }

    private static void showExpired() {
        for (var r : records.getAllRecords()) {
            if (r instanceof Expirable) {
                Expirable e = (Expirable) r;
                if (e.isExpired()) {
                    // if (r instanceof Expirable && ((Expirable) r).isExpired()) {// если Р -
                    System.out.println(r);
                }
            }
        }
    }

    private static void searchRecord() {
        var substr = Asker.askString("Enter substring to find");
        for (var r : records.getAllRecords()) {
            if (r.contains(substr)) {// данный метод смотрит айдишку!! проверяет есть ли там то что ввел пользователь
                System.out.println(r);
            }
        }
    }

    private static void deleteRecord() {
        var id = Asker.askInt("enter ID to remove");// DAO remove и передать ид что пользоватлеь ввел
    }

    private static void listRecords() {
        var all = records.getAllRecords();//List<Record>
        for (var r : all) {
            System.out.println(r);
        }
    }

    private static void addRecord(AbstractRecord r) {
        r.askInfo();
        records.add(r);
        System.out.println("Created" + r);
    }

    public static void createRecord() {
        var type = Asker.askString("Record type");
        switch (type) {
            case "person":
                addRecord(new Person());
                break;
            case "book":
                addRecord(new Book());
                break;
            case "note":
                addRecord(new Note());
                break;
            case "alarm":
                addRecord(new Alarm());
                break;
            case "reminder":
                addRecord(new Reminder());
                break;
            //    case "musik":
            //      addRecord(new Musik()); WTF??????
            //     break;
            default:
                System.out.println("Wrong record type");
        }
    }

    private static void showHelp() {
        System.out.println("This is very helpful information.Trust me.");
    }

}
