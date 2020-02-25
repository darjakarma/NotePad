package lv.tsi.javacourses.notepad;

public class Person extends Record { //виртуально наследуется от Рекорда - все внутренности
    private String name; // тоже можно
    private String surname; //lastname - тоже можно
    private String phone; //
    private String email;


    public void askInfo() {
        name = Asker.askString("First name");
        surname= Asker.askString("Last name");
        phone = Asker.askString("Phone");
        email = Asker.askString("Email");
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + getId() +
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
}
