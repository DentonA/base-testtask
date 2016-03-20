package com.testbase.driver.utils;

import com.testbase.driver.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.testbase.driver.Config.driver;
import static com.testbase.driver.pages.Pages.mainMenu;
import static com.testbase.driver.pages.Pages.leadsPage;
import static com.testbase.driver.pages.Pages.leadProfilePage;

/**
 * This class contains Utility methods, such as element existence checks, explicit waits, etc.
 */
public class Utils {
    public static boolean exists(String selector, String selectorType) {
        Config.changeImplicitWait(Config.MIN_TIMEOUT);
        boolean exists = false;
        switch (selectorType.toLowerCase()) {
            case "xpath":
                exists = !driver.findElements(By.xpath(selector)).isEmpty();
                break;
            case "id":
                exists = !driver.findElements(By.id(selector)).isEmpty();
                break;
            case "class":
            case "classname":
                exists = !driver.findElements(By.className(selector)).isEmpty();
                break;
        }
        Config.changeImplicitWait(Config.MAX_IMPLICIT_TIMEOUT);
        return exists;
    }

    public static void waitForMainPageOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(mainMenu.getMainMenuMainDashboardButton()));
    }

    public static void waitForLeadsPageOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(leadsPage.getNewLeadButton()));
    }

    public static void waitForLeadProfilePageOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(leadProfilePage.getLeadFullName()));
    }

    public static void waitForMainDropdownMenuOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(mainMenu.getDropdownMenuOpened()));
    }
}
