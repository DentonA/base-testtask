package com.testbase.driver.actions;

import com.testbase.driver.utils.Utils;
import org.openqa.selenium.NoSuchElementException;

import static com.testbase.driver.pages.Pages.mainMenu;

/**
 * This class contains actions that navigate test execution to different pages of the Base Platform
 */
public class Navigation {
    public static void toMainPage() {
        mainMenu.getMainMenuMainDashboardButton().click();
    }

    public static void toLeadsPage() {
        mainMenu.getMainMenuLeadsButton().click();
        Utils.waitForLeadsPageOpen();
    }

    public static void toContactsPage() {
        mainMenu.getMainMenuContactsButton().click();
    }

    public static void toSalesPipelinePage() {
        mainMenu.getMainMenuSalesPipelineButton().click();
    }

    public static void toCalendarPage() {
        mainMenu.getMainMenuCalendarButton().click();
    }

    public static void toTasksPage() {
        mainMenu.getMainMenuTasksButton().click();
    }

    public static void toCommunicationCenterPage() {
        mainMenu.getMainMenuSMSButton().click();
    }

    public static void toReportsPage() {
        mainMenu.getMainMenuReportsButton().click();
    }

    public static void toSettingsPage() {
        try {
            mainMenu.getDropdownMenuClosed().click();
        } catch (NoSuchElementException e) {}
        Utils.waitForMainDropdownMenuOpen();
        mainMenu.getDropdownMenuSettings().click();
    }
}
