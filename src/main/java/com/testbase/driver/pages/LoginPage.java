package com.testbase.driver.pages;

import com.testbase.driver.utils.SelectorType;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.testbase.driver.utils.TestLogger.info;
import static com.testbase.driver.utils.Utils.exists;

/**
 * This class represents all WebElements that are located on the Login page of the
 * Base Platform
 */
public class LoginPage {
    public static final String alertMessageSel = "//div[@class='alert alert-error']";
    public static final String emailFieldSel = "user_email";
    public static final String passwordFieldSel = "user_password";
    public static final String loginButtonSel = "btn-primary";
    public static final String rememberMeCheckboxSel = "user_remember_me";

    @FindBy(xpath = alertMessageSel)
    private WebElement alertMessage;

    @FindBy(id = emailFieldSel)
    private WebElement emailField;

    @FindBy(id = passwordFieldSel)
    private WebElement passwordField;

    @FindBy(className = loginButtonSel)
    private WebElement loginButton;

    @FindBy(id = rememberMeCheckboxSel)
    private WebElement rememberMeCheckbox;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillLogInDialog(String email, String password) {
        if (exists(emailFieldSel, SelectorType.ID) && exists(passwordFieldSel, SelectorType.ID)) {
            emailField.sendKeys(email);
            passwordField.sendKeys(password);
        } else {
            info("Fail opening login page.");
            throw new NoSuchElementException("Couldn't find login email or password fields");
        }
    }

    public void clickLoginButton() {
        if (exists(loginButtonSel, SelectorType.CLASSNAME)) {
            loginButton.click();
        } else {
            info("Fail clicking login button. It doesn't exist on the current screen.");
            throw new NoSuchElementException("Couldn't find login button");
        }
    }

    // Getters & Setters

    public WebElement getAlertMessage() {
        return alertMessage;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getRememberMeCheckbox() {
        return rememberMeCheckbox;
    }
}
