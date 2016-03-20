package com.testbase.driver.pages;

import com.testbase.driver.entities.Lead;
import com.testbase.driver.utils.SelectorType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.testbase.driver.utils.TestLogger.info;
import static com.testbase.driver.utils.Utils.exists;

/**
 * This class represents all WebElements that are located on the Leads page of the
 * Base Platform
 */
public class LeadsPage {
    public static final String leadsViewSegmentActiveButtonSel = "//div[@class='segment active']/a[@href='/leads']";
    public static final String leadsViewSegmentInactiveButtonSel = "//div[@class='segment']/a[@href='/leads']";
    public static final String smartListSegmentActiveButtonSel = "//div[contains(@class, 'active')]/a[@class='smart-list-view']";
    public static final String smartListSegmentInactiveButtonSel = "//div[@class='segment smart-lists-view-selection']/a[@class='smart-list-view']";
    public static final String selectAllCheckboxSel = "//a[contains(@class, 'select-all')]/input";
    public static final String newLeadButtonSel = "leads-new";
    public static final String importButtonSel = "leads-import";
    public static final String filterLeadNamesFieldSel = "//span[@class='term-filter']/input";
    public static final String allLeadNamesBlockSel = "//ul[@class='object-list-items leads']";
    public static final String allLeadsListSel = "//li[contains(@id, 'lead-')]";
    public static final String expandActiveFiltersButtonSel = "//a[@class='btn expand-active-filters']";
    public static final String clearAllFiltersButtonSel = "//a[@class='btn clear-all-filters']";
    // single lead elements
    public static final String singleUnknownLeadSel = "//a[@class='lead-name' and contains(text(), '%LEADNAME%')]";
    public static final String selectThisLeadSel = "//div[@class='select']/input";
    public static final String editThisLeadButtonSel = "//a[@class='hoverable edit']";
    public static final String convertThisLeadButtonSel = "//div[@class='quick-info hoverable']/span/a";

    @FindBy(xpath = leadsViewSegmentActiveButtonSel)
    private WebElement leadsViewSegmentActiveButton;

    @FindBy(xpath = leadsViewSegmentInactiveButtonSel)
    private WebElement leadsViewSegmentInactiveButton;

    @FindBy(xpath = smartListSegmentActiveButtonSel)
    private WebElement smartListSegmentActiveButton;

    @FindBy(xpath = smartListSegmentInactiveButtonSel)
    private WebElement smartListSegmentInactiveButton;

    @FindBy(xpath = selectAllCheckboxSel)
    private WebElement selectAllCheckbox;

    @FindBy(id = newLeadButtonSel)
    private WebElement newLeadButton;

    @FindBy(xpath = importButtonSel)
    private WebElement importButton;

    @FindBy(xpath = filterLeadNamesFieldSel)
    private WebElement filterLeadNamesField;

    @FindBy(xpath = allLeadNamesBlockSel)
    private WebElement allLeadNamesBlock;

    @FindBy(xpath = allLeadsListSel)
    private List<WebElement> allLeadsList;

    @FindBy(xpath = expandActiveFiltersButtonSel)
    private WebElement expandActiveFiltersButton;

    @FindBy(xpath = clearAllFiltersButtonSel)
    private WebElement clearAllFiltersButton;

    @FindBy(xpath = selectThisLeadSel)
    private WebElement selectThisLead;

    @FindBy(xpath = editThisLeadButtonSel)
    private WebElement editThisLeadButton;

    @FindBy(xpath = convertThisLeadButtonSel)
    private WebElement convertThisLeadButton;

    private WebDriver driver;

    public LeadsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickNewLeadButton() {
        if (exists(newLeadButtonSel, SelectorType.ID)) {
            newLeadButton.click();
        } else {
            info("Fail clicking 'new lead' button. It doesn't exist on this page.");
            throw new NoSuchElementException("Couldn't find 'new lead' button");
        }
    }

    public boolean findAndOpenLeadProfile(Lead lead) {
        String fullName;
        if (lead.getName() != null && !lead.getName().equals("")) {
            fullName = lead.getName() + " " + lead.getLastName();
        } else {
            fullName = lead.getLastName();
        }
        String leadSelector = singleUnknownLeadSel.replace("%LEADNAME%", fullName);
        if (exists(leadSelector, SelectorType.XPATH)) {
            info("Lead with fullname '" + fullName + "' found. Opening profile.");
            allLeadNamesBlock.findElement(By.xpath(leadSelector)).click();
            return true;
        } else {
            info("Lead with fullname '" + fullName + "' doesn't exist");
        }
        return false;
    }

    // Getters & Setters

    public WebElement getLeadsViewSegmentActiveButton() {
        return leadsViewSegmentActiveButton;
    }

    public WebElement getLeadsViewSegmentInactiveButton() {
        return leadsViewSegmentInactiveButton;
    }

    public WebElement getSmartListSegmentActiveButton() {
        return smartListSegmentActiveButton;
    }

    public WebElement getSmartListSegmentInactiveButton() {
        return smartListSegmentInactiveButton;
    }

    public WebElement getSelectAllCheckbox() {
        return selectAllCheckbox;
    }

    public WebElement getNewLeadButton() {
        return newLeadButton;
    }

    public WebElement getImportButton() {
        return importButton;
    }

    public WebElement getFilterLeadNamesField() {
        return filterLeadNamesField;
    }

    public WebElement getAllLeadNamesBlock() {
        return allLeadNamesBlock;
    }

    public List<WebElement> getAllLeadsList() {
        return allLeadsList;
    }

    public WebElement getExpandActiveFiltersButton() {
        return expandActiveFiltersButton;
    }

    public WebElement getClearAllFiltersButton() {
        return clearAllFiltersButton;
    }

    public WebElement getSelectThisLead() {
        return selectThisLead;
    }

    public WebElement getEditThisLeadButton() {
        return editThisLeadButton;
    }

    public WebElement getConvertThisLeadButton() {
        return convertThisLeadButton;
    }
}
