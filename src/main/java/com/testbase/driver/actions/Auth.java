package com.testbase.driver.actions;

import com.testbase.driver.Config;
import com.testbase.driver.utils.Utils;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import static com.testbase.driver.Config.driver;
import static com.testbase.driver.pages.Pages.loginPage;
import static com.testbase.driver.pages.Pages.mainMenu;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class Auth {
    public static void logIn() {
        fillLogInDialog(Config.EMAIL, Config.WORD);
    }

    public static void logOutIfLoggedIn() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            mainMenu.getDropdownMenuClosed().click();
            Utils.waitForMainDropdownMenuOpen();
            mainMenu.getDropdownMenuLogout().click();
        } catch (NoSuchElementException e) {
        } finally {
            driver.manage().timeouts().implicitlyWait(Config.MAX_IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
        }
    }

    private static void fillLogInDialog(String email, String password) {
        loginPage.getEmailField().sendKeys(email);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginButton().click();
        Utils.waitForMainPageOpen();
    }
}
