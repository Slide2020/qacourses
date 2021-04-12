package ru.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.addressbook.appmanager.ApplicationManager;
import ru.stqa.addressbook.model.ContactData;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();


    @BeforeMethod
    public void setUp() throws Exception {
        app.init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }


}
