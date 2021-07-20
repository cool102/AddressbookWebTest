package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.DataForContacts;
import ru.stqa.pft.addressbook.TestBase;

public class ContactsCreationTests extends TestBase {



    @Test
    public void testContactsCreationTests() throws Exception {

        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContacts(new DataForContacts("Tagir", "Almazovich", "Salyakhov", "TagirCO", "8-917-494-2002", "7", "May", "1984"));
        app.getContactHelper().submitContactCreation();

    }


}
