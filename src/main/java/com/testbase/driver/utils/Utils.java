package com.testbase.driver.utils;

import com.testbase.driver.Config;
import com.testbase.driver.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.testbase.driver.Config.driver;

/**
 * This class contains Utility methods, such as element existence checks, explicit waits, etc.
 */
public class Utils {
    public static boolean exists(String selector, SelectorType type) {
        Config.changeImplicitWait(Config.MIN_TIMEOUT);
        boolean exists = false;
        switch (type) {
            case XPATH:
                exists = !driver.findElements(By.xpath(selector)).isEmpty();
                break;
            case ID:
                exists = !driver.findElements(By.id(selector)).isEmpty();
                break;
            case CLASSNAME:
                exists = !driver.findElements(By.className(selector)).isEmpty();
                break;
        }
        Config.changeImplicitWait(Config.MAX_IMPLICIT_TIMEOUT);
        return exists;
    }

    public static void waitForMainPageOpen() {
        wait(By.xpath(MainMenu.mainMenuMainDashboardButtonSel));
    }

    public static void waitForLeadsPageOpen() {
        wait(By.xpath("//ul[@class='object-list-items leads']/li[@class='item empty'] | //ul[@class='object-list-items leads']/li[contains(@id, 'lead-')]"));
    }

    public static void waitForLeadProfilePageOpen() {
        wait(By.xpath(LeadProfilePage.statusDropdownMenuButtonSel));
    }

    public static void waitForMainDropdownMenuOpen() {
        wait(By.xpath(MainMenu.dropdownMenuOpenedSel));
    }

    public static void waitForAddNewLeadPageOpen() {
        wait(By.className(AddNewLeadPage.saveButtonSel));
    }

    public static void waitForSettingsPageOpen() {
        wait(By.xpath(SettingsPage.leftMenuSel));
    }

    private static void wait(By by) {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(by));
    }
}
