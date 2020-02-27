package lv.tsi.javacourses.notepad;

import java.util.List;

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

                default:
                    System.out.println("Wrong command");

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

    private static void addRecord(Record r) {
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
            case "musik":
                addRecord(new Musik());
                break;
            default:
                System.out.println("Wrong record type");
        }
    }

    private static void showHelp() {
        System.out.println("This is very helpful information.Trust me.");
    }

}
