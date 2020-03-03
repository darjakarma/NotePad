package lv.tsi.javacourses.notepad.records;

public interface Expirable {
    boolean isExpired();// любой метод в интерфейсе - публик и абстрактный
    void dismiss(); // этот метод мы создали в Аларме е.dismiss!!!!

}
