package com.testbase.functionaltests;

import com.testbase.driver.Config;
import com.testbase.driver.actions.Auth;
import com.testbase.driver.actions.Leads;
import com.testbase.driver.actions.Settings;
import com.testbase.driver.entities.Lead;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.testbase.driver.Config.driver;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class LeadTest {
    @BeforeSuite
    public void init() {
        new Config().init();
    }

    @BeforeMethod(alwaysRun = true)
    public void basicSetup() {
        driver.get("https://core.futuresimple.com/users/login");
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        Settings.changeNameOfStatus("CustomName", "New");
        Auth.logOutIfLoggedIn();
    }

    @Test
    public void changingNewStatusNameOfNewLeadToDifferentName_UsingSelenium_ShouldPass() {
        Auth.logIn();
        Lead lead = new Lead();
        Leads.createNewLead(lead);
        Leads.assertStatusName(lead, "New");
        Settings.changeNameOfStatus("New", "CustomName");
        Leads.assertStatusName(lead, "CustomName");
    }

    @Test
    public void changingNewStatusNameOfNewLeadToDifferentName_UsingSeleniumWithAPI_ShouldPass() {
        Auth.logIn();
        Lead lead = new Lead();
        Leads.createNewLeadUsingAPI(lead);
        Leads.assertStatusName(lead, "New");
        Settings.changeNameOfStatus("New", "CustomName");
        Leads.assertStatusName(lead, "CustomName");
    }
}
