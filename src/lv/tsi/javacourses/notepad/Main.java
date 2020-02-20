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
                    deleteRecord();
                    break;
                default:
                    System.out.println("Wrong command");

            }
        }
    }

    private static void deleteRecord() {
        int id = Asker.askInt("enter id");// DAO remove и передать ид что пользоватлеь ввел
    }

    private static void listRecords() {
        List<Record> all = records.getAllRecords();
        for (var r : all) {
            System.out.println(r);
        }
    }

    public static void createRecord() {
        var r = new Record();
        r.askInfo();
        records.add(r);
    }

    private static void showHelp() {
        System.out.println("This is very helpful information.Trust me.");
    }
}
