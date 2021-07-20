package ru.stqa.pft.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();


    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
    public void tearDown() throws Exception {
        app.stop();

    }

}
