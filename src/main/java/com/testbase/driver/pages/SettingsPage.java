package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Denton on (018) 18.03.16.
 */
public class SettingsPage {
    public static final String customizeLeadsMenuItemSel = "//ul[contains(@class, 'nav-list')]/li[@class='leads']/a";
    public static final String leadStatusesTabSel = "//ul[@id='leads-settings-tabs']/li[3]/a";
    public static final String statusNamesToEditSel = "//div[@class='control-group item']";
    public static final String editLeadStatusBlockSel = "lead-status";

    @FindBy(xpath = customizeLeadsMenuItemSel)
    private WebElement customizeLeadsMenuItem;

    @FindBy(xpath = leadStatusesTabSel)
    private WebElement leadStatusesTab;

    @FindBy(xpath = statusNamesToEditSel)
    private List<WebElement> statusNamesToEdit;

    @FindBy(id = editLeadStatusBlockSel)
    private WebElement editLeadStatusBlock;

    private WebDriver driver;

    public SettingsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Getters & Setters

    public WebElement getCustomizeLeadsMenuItem() {
        return customizeLeadsMenuItem;
    }

    public WebElement getLeadStatusesTab() {
        return leadStatusesTab;
    }

    public List<WebElement> getStatusNamesToEdit() {
        return statusNamesToEdit;
    }

    public WebElement getEditLeadStatusBlock() {
        return editLeadStatusBlock;
    }
}
