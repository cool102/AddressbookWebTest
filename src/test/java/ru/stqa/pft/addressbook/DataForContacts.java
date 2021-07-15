package ru.stqa.pft.addressbook;

public class DataForContacts {
    private final String nameOfContact;
    private final String middleNameOfContact;
    private final String lastNameOfContact;
    private final String nameOfCompanyOfContact;
    private final String phoneNumberOfContact;
    private final String dayOfBorn;
    private final String monthOfBorn;
    private final String yearOfBorn;

    public DataForContacts(String nameOfContact, String middleNameOfContact, String lastNameOfContact, String nameOfCompanyOfContact, String phoneNumberOfContact, String dayOfBorn, String monthOfBorn, String yearOfBorn) {
        this.nameOfContact = nameOfContact;
        this.middleNameOfContact = middleNameOfContact;
        this.lastNameOfContact = lastNameOfContact;
        this.nameOfCompanyOfContact = nameOfCompanyOfContact;
        this.phoneNumberOfContact = phoneNumberOfContact;
        this.dayOfBorn = dayOfBorn;
        this.monthOfBorn = monthOfBorn;
        this.yearOfBorn = yearOfBorn;
    }

    public String getNameOfContact() {
        return nameOfContact;
    }

    public String getMiddleNameOfContact() {
        return middleNameOfContact;
    }

    public String getLastNameOfContact() {
        return lastNameOfContact;
    }

    public String getNameOfCompanyOfContact() {
        return nameOfCompanyOfContact;
    }

    public String getPhoneNumberOfContact() {
        return phoneNumberOfContact;
    }

    public String getDayOfBorn() {
        return dayOfBorn;
    }

    public String getMonthOfBorn() {
        return monthOfBorn;
    }

    public String getYearOfBorn() {
        return yearOfBorn;
    }
}
