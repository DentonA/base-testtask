package com.testbase.driver.pages;

import com.testbase.driver.entities.Lead;
import com.testbase.driver.utils.SelectorType;
import com.testbase.driver.utils.Utils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.testbase.driver.utils.TestLogger.info;
import static com.testbase.driver.utils.Utils.exists;

/**
 * This class represents all WebElements that are located on the 'New Lead' page of the
 * Base Platform
 */
public class AddNewLeadPage {
    public static final String nameFieldSel = "lead-first-name";
    public static final String lastNameFieldSel = "lead-last-name";
    public static final String companyNameFieldSel = "lead-company-name";
    public static final String titleFieldSel = "lead-title";
    public static final String leadStatusOpenListSel = "//div[@class='status-select']/div/div/a";
    public static final String leadStatusInputNameSel = "//div[@class='status-select']/div/div/div/div/input";
    public static final String emailFieldSel = "lead-email";
    public static final String mobilePhoneFieldSel = "lead-mobile";
    public static final String workPhoneFieldSel = "lead-phone";
    public static final String addressFieldSel = "lead-street";
    public static final String cityFieldSel = "lead-city";
    public static final String zipFieldSel = "lead-zip";
    public static final String regionFieldSel = "lead-region";
    public static final String countryOpenListSel = "//div[contains(@class, 'country_select')]/div/a";
    public static final String countryInputNameSel = "//div[contains(@class, 'country_select')]/div/div/div/input";
    public static final String tagSearchFieldSel = "//div[contains(@class, 'tag_select')]/div/ul/li/input";
    public static final String cancelButtonSel = "//a[@class='cancel btn btn-large']";
    public static final String saveButtonSel = "save";

    @FindBy(id = nameFieldSel)
    private WebElement nameField;

    @FindBy(id = lastNameFieldSel)
    private WebElement lastNameField;

    @FindBy(id = companyNameFieldSel)
    private WebElement companyNameField;

    @FindBy(id = titleFieldSel)
    private WebElement titleField;

    @FindBy(xpath = leadStatusOpenListSel)
    private WebElement leadStatusOpenList;

    @FindBy(xpath = leadStatusInputNameSel)
    private WebElement leadStatusInputName;

    @FindBy(id = emailFieldSel)
    private WebElement emailField;

    @FindBy(id = mobilePhoneFieldSel)
    private WebElement mobilePhoneField;

    @FindBy(id = workPhoneFieldSel)
    private WebElement workPhoneField;

    @FindBy(id = addressFieldSel)
    private WebElement addressField;

    @FindBy(id = cityFieldSel)
    private WebElement cityField;

    @FindBy(id = zipFieldSel)
    private WebElement zipField;

    @FindBy(id = regionFieldSel)
    private WebElement regionField;

    @FindBy(xpath = countryOpenListSel)
    private WebElement countryOpenList;

    @FindBy(xpath = countryInputNameSel)
    private WebElement countryInputName;

    @FindBy(xpath = tagSearchFieldSel)
    private WebElement tagSearchField;

    @FindBy(xpath = cancelButtonSel)
    private WebElement cancelButton;

    @FindBy(className = saveButtonSel)
    private WebElement saveButton;

    private WebDriver driver;

    public AddNewLeadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillNewLeadForm(Lead lead) {
        nameField.sendKeys(lead.getName());
        lastNameField.sendKeys(lead.getLastName());
        companyNameField.sendKeys(lead.getCompanyName());
        titleField.sendKeys(lead.getTitle());
        emailField.sendKeys(lead.getEmail());
        mobilePhoneField.sendKeys(lead.getPhoneMobile());
        workPhoneField.sendKeys(lead.getPhoneWork());
        addressField.sendKeys(lead.getAddress());
        cityField.sendKeys(lead.getCity());
        zipField.sendKeys(lead.getZipCode());
        regionField.sendKeys(lead.getState());
    }

    public void clickSaveButton() {
        if (exists(saveButtonSel, SelectorType.CLASSNAME)) {
            saveButton.click();
        } else {
            info("Failed clicking 'save' button. It doesn't exist on this page.");
            throw new NoSuchElementException("Couldn't find 'save' button");
        }
    }

    // Getters & Setters

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getCompanyNameField() {
        return companyNameField;
    }

    public WebElement getTitleField() {
        return titleField;
    }

    public WebElement getLeadStatusOpenList() {
        return leadStatusOpenList;
    }

    public WebElement getLeadStatusInputName() {
        return leadStatusInputName;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getMobilePhoneField() {
        return mobilePhoneField;
    }

    public WebElement getWorkPhoneField() {
        return workPhoneField;
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getZipField() {
        return zipField;
    }

    public WebElement getRegionField() {
        return regionField;
    }

    public WebElement getCountryOpenList() {
        return countryOpenList;
    }

    public WebElement getCountryInputName() {
        return countryInputName;
    }

    public WebElement getTagSearchField() {
        return tagSearchField;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}
