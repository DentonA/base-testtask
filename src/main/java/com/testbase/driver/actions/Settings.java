package com.testbase.driver.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.testbase.driver.pages.Pages.settingsPage;
import static com.testbase.driver.utils.TestLogger.info;

/**
 * This class contains actions that make some changes in the client's settings of the Base Platform
 */
public class Settings {
    public static void changeNameOfStatus(String oldName, String newName) {
        Navigation.toSettingsPage();
        info("Opening leads settings menu.");
        settingsPage.openLeadsSettings();
        settingsPage.openLeadsSettingsStatusesTab();
        List<WebElement> statuses = settingsPage.getExistingStatusNames();
        info("Editing lead status name.");
        for (WebElement curr : statuses) {
            if (curr.findElement(By.className("control-label")).getText().equals(oldName)) {
                curr.findElement(By.className("edit")).click();
                break;
            }
        }
        WebElement nameField = settingsPage.getEditLeadStatusBlock().findElement(By.id("name"));
        nameField.clear();
        nameField.sendKeys(newName);
        settingsPage.getEditLeadStatusBlock().findElement(By.className("save")).click();
    }
}
