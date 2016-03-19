package com.testbase.driver.utils;

import com.testbase.driver.Config;
import com.testbase.driver.pages.LeadProfilePage;
import com.testbase.driver.pages.LeadsPage;
import com.testbase.driver.pages.MainMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.testbase.driver.Config.driver;

/**
 * Created by Denton on (019) 19.03.16.
 */
public class Utils {
    public static void waitForMainPageOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.presenceOfElementLocated(By.id(MainMenu.mainMenuMainDashboardButtonSel)));
    }

    public static void waitForLeadsPageOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.presenceOfElementLocated(By.id(LeadsPage.newLeadButtonSel)));
    }

    public static void waitForLeadProfilePageOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.presenceOfElementLocated(By.className(LeadProfilePage.leadNameSel)));
    }

    public static void waitForMainDropdownMenuOpen() {
        new WebDriverWait(driver, Config.MAX_EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(MainMenu.dropdownMenuOpenedSel)));
    }
}
