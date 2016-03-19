package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents all WebElements that are located on the Lead's profile page of the
 * Base Platform
 */
public class LeadProfilePage {
    public static final String leadNameSel = "detail-title";
    public static final String editButtonSel = "";
    public static final String convertButtonSel = "";
    public static final String ownerSel = "";
    public static final String statusNameSel = "lead-status";
    public static final String statusDropdownMenuButtonSel = "";
    public static final String statusDropdownMenuList = "//div[@class='dropdown open']/ul/li"; //TODO LIST
    public static final String noteTextAreaSel = "//textarea[@name='note']";
    public static final String saveNoteButtonSel = "//button[@class='btn btn-inverse hide' and contains(text(), 'Save')]";
    public static final String cancelNoteChangesButtonSel = "//span[@class='info-label cancel-new hide' and contains(text(), 'Cancel')]";
    public static final String sendAnEmailButtonSel = "//a[@rel='communication']";

    @FindBy(className = leadNameSel)
    private WebElement leadFullName;

    @FindBy(className = statusNameSel)
    private WebElement statusName;

    private WebDriver driver;

    public LeadProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Getters & Setters

    public WebElement getLeadFullName() {
        return leadFullName;
    }

    public WebElement getStatusName() {
        return statusName;
    }
}
