package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * This class represents all WebElements that are located on the Lead's profile page of the
 * Base Platform
 */
public class LeadProfilePage {
    public static final String leadNameSel = "detail-title";
    public static final String editButtonSel = "//a[@class='btn btn-mini detail-edit']";
    public static final String convertButtonSel = "//a[@class='btn btn-mini convert btn-primary']";
    public static final String ownerNameSel = "//ul[@class='object-details']/li/strong";
    public static final String statusNameSel = "lead-status";
    public static final String statusDropdownMenuButtonSel = "//div[@class='status']/div/a[@class='dropdown-toggle']";
    public static final String statusDropdownMenuListSel = "//div[@class='dropdown open']/ul/li/a[@class='option']";
    public static final String noteTextAreaSel = "//textarea[@name='note']";
    public static final String saveNoteButtonSel = "//button[@class='btn btn-inverse hide' and contains(text(), 'Save')]";
    public static final String cancelNoteChangesButtonSel = "//span[@class='info-label cancel-new hide' and contains(text(), 'Cancel')]";
    public static final String sendAnEmailButtonSel = "//a[@rel='communication']";

    @FindBy(className = leadNameSel)
    private WebElement leadFullName;

    @FindBy(xpath = editButtonSel)
    private WebElement editButton;

    @FindBy(xpath = convertButtonSel)
    private WebElement convertButton;

    @FindBy(xpath = ownerNameSel)
    private WebElement ownerName;

    @FindBy(className = statusNameSel)
    private WebElement statusName;

    @FindBy(xpath = statusDropdownMenuButtonSel)
    private WebElement statusDropdownMenuButton;

    @FindBy(xpath = statusDropdownMenuListSel)
    private List<WebElement> statusDropdownMenuList;

    @FindBy(xpath = noteTextAreaSel)
    private WebElement noteTextArea;

    @FindBy(xpath = saveNoteButtonSel)
    private WebElement saveNoteButton;

    @FindBy(xpath = cancelNoteChangesButtonSel)
    private WebElement cancelNoteChangesButton;

    @FindBy(xpath = sendAnEmailButtonSel)
    private WebElement sendAnEmailButton;

    private WebDriver driver;

    public LeadProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Getters & Setters

    public WebElement getLeadFullName() {
        return leadFullName;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getConvertButton() {
        return convertButton;
    }

    public WebElement getOwnerName() {
        return ownerName;
    }

    public WebElement getStatusName() {
        return statusName;
    }

    public WebElement getStatusDropdownMenuButton() {
        return statusDropdownMenuButton;
    }

    public List<WebElement> getStatusDropdownMenuList() {
        return statusDropdownMenuList;
    }

    public WebElement getNoteTextArea() {
        return noteTextArea;
    }

    public WebElement getSaveNoteButton() {
        return saveNoteButton;
    }

    public WebElement getCancelNoteChangesButton() {
        return cancelNoteChangesButton;
    }

    public WebElement getSendAnEmailButton() {
        return sendAnEmailButton;
    }
}
