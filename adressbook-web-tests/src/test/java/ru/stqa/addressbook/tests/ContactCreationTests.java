package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation(){
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Jan", "Kowalski", "Gogola 3/4", "512 411 555", "jan@w.pl"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().goToHomePage();

    }


}
