package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class LoginPage {
    public static final String emailFieldSel = "user_email";
    public static final String passwordFieldSel = "user_password";
    public static final String loginButtonSel = "btn-primary";

    @FindBy(id = emailFieldSel)
    private WebElement emailField;

    @FindBy(id = passwordFieldSel)
    private WebElement passwordField;

    @FindBy(className = loginButtonSel)
    private WebElement loginButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Getters & Setters

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
