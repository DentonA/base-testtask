package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class Pages {
    public static MainMenu mainMenu;
    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static LeadsPage leadsPage;
    public static AddNewLeadPage addNewLeadPage;
    public static LeadProfilePage leadProfilePage;
    public static SettingsPage settingsPage;

    public static void createAllPages(WebDriver driver) {
        mainMenu = new MainMenu(driver);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        leadsPage = new LeadsPage(driver);
        addNewLeadPage = new AddNewLeadPage(driver);
        leadProfilePage = new LeadProfilePage(driver);
        settingsPage = new SettingsPage(driver);
    }
}
