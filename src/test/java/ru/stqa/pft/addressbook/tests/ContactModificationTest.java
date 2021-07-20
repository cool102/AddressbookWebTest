package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification() throws Exception {
        app.getContactHelper().selectContact(By.name("selected[]"));
        app.getContactHelper().editContact(By.xpath("//img[@alt='Edit']"));
        app.getContactHelper().updateContact(By.name("update"));


    }


}
