package com.testbase.driver.actions;

import com.testbase.driver.pages.MainMenu;
import com.testbase.driver.utils.SelectorType;
import com.testbase.driver.utils.Utils;

import static com.testbase.driver.pages.Pages.mainMenu;
import static com.testbase.driver.utils.TestLogger.info;

/**
 * This class contains actions that navigate test execution to different pages of the Base Platform
 */
public class Navigation {
    public static void toMainPage() {
        info("Opening main page.");
        mainMenu.clickButton(MainMenu.mainMenuMainDashboardButtonSel, SelectorType.XPATH);
        Utils.waitForMainPageOpen();
    }

    public static void toLeadsPage() {
        info("Opening leads page.");
        mainMenu.clickButton(MainMenu.mainMenuLeadsButtonSel, SelectorType.ID);
        Utils.waitForLeadsPageOpen();
    }

    public static void toContactsPage() {
        info("Opening contacts page.");
        mainMenu.clickButton(MainMenu.mainMenuContactsButtonSel, SelectorType.ID);
    }

    public static void toSalesPipelinePage() {
        info("Opening sales pipeline page.");
        mainMenu.clickButton(MainMenu.mainMenuSalesPipelineButtonSel, SelectorType.ID);
    }

    public static void toCalendarPage() {
        info("Opening calendar page.");
        mainMenu.clickButton(MainMenu.mainMenuCalendarButtonSel, SelectorType.ID);
    }

    public static void toTasksPage() {
        info("Opening tasks page.");
        mainMenu.clickButton(MainMenu.mainMenuTasksButtonSel, SelectorType.ID);
    }

    public static void toCommunicationCenterPage() {
        info("Opening communication center page.");
        mainMenu.clickButton(MainMenu.mainMenuSMSButtonSel, SelectorType.ID);
    }

    public static void toReportsPage() {
        info("Opening reports page.");
        mainMenu.clickButton(MainMenu.mainMenuReportsButtonSel, SelectorType.ID);
    }

    public static void toSettingsPage() {
        info("Opening settings page.");
        mainMenu.openDropdownMenu();
        Utils.waitForMainDropdownMenuOpen();
        mainMenu.clickButton(MainMenu.dropdownMenuSettingsSel, SelectorType.XPATH);
        Utils.waitForSettingsPageOpen();
    }
}
