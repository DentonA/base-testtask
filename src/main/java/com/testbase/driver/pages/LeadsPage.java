package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class LeadsPage {
    public static final String newLeadButtonSel = "leads-new";
    public static final String leadNamesBlockSel = "//ul[@class='object-list-items leads']";

    @FindBy(id = newLeadButtonSel)
    private WebElement newLeadButton;

    @FindBy(xpath = leadNamesBlockSel)
    private WebElement leadNamesBlock;

    private WebDriver driver;

    public LeadsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Getters & Setters

    public WebElement getNewLeadButton() {
        return newLeadButton;
    }

    public WebElement getLeadNamesBlock() {
        return leadNamesBlock;
    }
}
