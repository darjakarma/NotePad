package lv.tsi.javacourses.notepad;

public abstract class Record {//абстрактный. общее значение для персоны и бука. Описывает общее поведение всех рекордов в системе
    private static int counter; // относиться только к Рекорду. тоесть ИДшка будет одна и та же у Буук и Персон
    private int id;

    public Record() { //умение увеличивать ИДшку (здесь) на единицу
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public abstract void askInfo();
        // абстрактный метод

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                '}';
    }

    //Book b = new Book();//можно положить сюда book
    //Record r1 = new Book();// можно положить сюда персону и бук
    //Record r2 = new Person();//аналогично
    //Person p = new Book(); НО! в переменную Персон положить Бук ...НЕЛЬЗЯ
}
