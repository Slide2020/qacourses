package ru.stqa.addressbook.model;

public class ContactData {
    private final String name;
    private final String surname;
    private final String adress;
    private final String mobile;
    private final String mail;

    public ContactData(String name, String surname, String adress, String mobile, String mail) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.mobile = mobile;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getMobile() {
        return mobile;
    }

    public String getMail() {
        return mail;
    }
}
