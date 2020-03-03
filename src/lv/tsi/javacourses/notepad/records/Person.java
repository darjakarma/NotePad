package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Person extends AbstractRecord { //виртуально наследуется от Рекорда - все внутренности
    private String name; // тоже можно
    private String surname; //lastname - тоже можно
    private String phone; //
    private String email;

    @Override
    public boolean contains(String substr) {
        var tmp = substr.toLowerCase();
        return super.contains(substr)
                || name.toLowerCase().contains(substr)// ловеркейс заведомо строчные  - ищет
                || surname.toLowerCase().contains(substr)
                || phone.toLowerCase().contains(substr)
                || email.toLowerCase().contains(substr);
    }

    public void askInfo() {
        name = Asker.askString("First name");
        surname= Asker.askString("Last name");
        phone = Asker.askString("Phone");
        email = Asker.askString("Email");
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' ;
    }

    @Override
    protected String type() {
        return "Person";
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
}
