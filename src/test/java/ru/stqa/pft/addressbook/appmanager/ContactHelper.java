package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.DataForContacts;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        selectContact(By.linkText("add new"));
    }

    public void fillContacts(DataForContacts dataForContacts) {

        type(By.name("firstname"), dataForContacts.getNameOfContact());
        type(By.name("middlename"), dataForContacts.getMiddleNameOfContact());
        type(By.name("lastname"), dataForContacts.getLastNameOfContact());
        type(By.name("company"), dataForContacts.getNameOfCompanyOfContact());
        type(By.name("mobile"), dataForContacts.getPhoneNumberOfContact());
        deleteContact(By.name("bday"));
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(dataForContacts.getDayOfBorn());
        deleteContact(By.xpath("//option[@value='7']"));
        deleteContact(By.name("bmonth"));
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(dataForContacts.getMonthOfBorn());
        deleteContact(By.xpath("//option[@value='May']"));
        deleteContact(By.name("byear"));
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(dataForContacts.getYearOfBorn());
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));

    }

    public void acceptDeletion() {
      wd.switchTo().alert().accept();
    }

    public void deleteContact(By locator) {
     click(locator);
    }

    public void selectContact(By locator) {
        click(locator);
    }

    public void editContact(By locator) {
        click(locator);
    }
    public void updateContact(By locator) {
        click(locator);
    }
}
