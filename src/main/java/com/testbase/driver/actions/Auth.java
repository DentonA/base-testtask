package com.testbase.driver.actions;

import com.testbase.driver.Config;
import com.testbase.driver.pages.MainMenu;
import com.testbase.driver.utils.SelectorType;
import com.testbase.driver.utils.Utils;

import static com.testbase.driver.pages.Pages.loginPage;
import static com.testbase.driver.pages.Pages.mainMenu;
import static com.testbase.driver.utils.TestLogger.info;

/**
 * This class contains actions connected with login / logout to the Base Platform
 */
public class Auth {
    public static void logIn() {
        info("Logging in.");
        loginPage.fillLogInDialog(Config.EMAIL, Config.WORD);
        loginPage.clickLoginButton();
        Utils.waitForMainPageOpen();
    }

    public static void logOut() {
        info("Logging out.");
        mainMenu.openDropdownMenu();
        Utils.waitForMainDropdownMenuOpen();
        mainMenu.clickLogout();
    }

    public static void logOutIfLoggedIn() {
        info("Check if client is logged in.");
        if (Utils.exists(MainMenu.dropdownMenuOpenedSel, SelectorType.XPATH) || Utils.exists(MainMenu.dropdownMenuClosedSel, SelectorType.XPATH)) {
            info("Client logged in.");
            logOut();
        } else {
            info("Client is not logged in.");
        }
    }


}
