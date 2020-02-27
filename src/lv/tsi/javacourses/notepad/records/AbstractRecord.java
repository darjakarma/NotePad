package lv.tsi.javacourses.notepad.records;

public abstract class AbstractRecord {//абстрактный. общее значение для персоны и бука. Описывает общее поведение всех рекордов в системе
    private static int counter; // относиться только к Рекорду. тоесть ИДшка будет одна и та же у Буук и Персон
    private int id;

    public AbstractRecord() { //умение увеличивать ИДшку (здесь) на единицу
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public abstract void askInfo();
        // абстрактный метод

    protected String stringContent() {
    return "id=" + id;        //для тех кто знает РЕКОРД
    }

    protected abstract String type(); //если метод абстрактый - ТЕЛА БЫТЬ НЕ МОЖЕТ


    @Override
    public final String toString() {
        return type() + "{" + stringContent() + '}';
    }

    //Book b = new Book();//можно положить сюда book
    //Record r1 = new Book();// можно положить сюда персону и бук
    //Record r2 = new Person();//аналогично
    //Person p = new Book(); НО! в переменную Персон положить Бук ...НЕЛЬЗЯ
}
