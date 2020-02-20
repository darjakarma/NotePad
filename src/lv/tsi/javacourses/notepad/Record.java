package lv.tsi.javacourses.notepad;

public class Record {
    private static int count;
    private int id; // только для чтения!! ниже толкьо гетер
    private String name; // тоже можно
    private String surname; //lastname - тоже можно
    private String phone; //
    private String email;

    public Record() {
        count++; // т.е. +1 - ид начнут подсчет как у нормальных людей, не комп.
        id = count;
    }

    public void askInfo() {
        name = Asker.askString("First name");
        surname= Asker.askString("Last name");
        phone = Asker.askString("Phone");
        email = Asker.askString("Email");
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
}
