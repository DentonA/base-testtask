package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
