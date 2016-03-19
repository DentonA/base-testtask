package com.testbase.driver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * This class represents all WebElements that are located on the Settings page of the
 * Base Platform (might be divided into number of small pages for diff settings)
 */
public class SettingsPage {
    public static final String leftMenuManageAccountsItemSel = "//li[@class='account' or @class='account active']/a";
    public static final String leftMenuManageUsersItemSel = "//li[@class='users']/a";
    public static final String leftMenuProfileItemSel = "//li[@class='profile' or @class='profile active']/a";
    public static final String leftMenuNotificationsItemSel = "//li[@class='notifications' or @class='notifications active']/a"; //todo
    public static final String leftMenuImportItemSel = "//li[@class='imports' or @class='imports active']/a";
    public static final String leftMenuSingleSignOnItemSel = "//li[@class='sso' or @class='sso active']/a";
    public static final String leftMenuOAuthItemSel = "//li[@class='oauth' or @class='oauth active']/a";
    public static final String leftMenuPricingItemSel = "//li[@class='pricing' or @class='pricing active']/a";
    public static final String leftMenuBillingItemSel = "//li[@class='billing' or @class='billing active']/a";
    public static final String leftMenuLeadsItemSel = "//li[@class='leads' or @class='leads active']/a[contains(@href, '/leads')]";
    public static final String leftMenuContactsItemSel = "//li[@class='contacts' or @class='contacts active']/a";
    public static final String leftMenuCustomersItemSel = "//li[@class='js-sales-accounts' or @class='js-sales-accounts active']/a";
    public static final String leftMenuDealsItemSel = "//li[@class='deals' or @class='deals active']/a";
    public static final String leftMenuProductsItemSel = "//li[@class='products' or @class='products active']/a";
    public static final String leftMenuGoalsItemSel = "//li[@class='goals' or @class='goals active']/a";
    public static final String leftMenuAutomatedActionsItemSel = "//li[@class='automation' or @class='automation active']/a";
    public static final String leftMenuIntegrationsItemSel = "//li[@class='integrations' or @class='integrations active']/a";
    public static final String leftMenuCalendarsItemSel = "//li[@class='calendars' or @class='calendars active']/a";
    public static final String leftMenuEmailItemSel = "//li[@class='email' or @class='email active']/a";
    public static final String leftMenuVoiceTextItemSel = "//li[@class='voice' or @class='voice active']/a";
    public static final String leftMenuScoringItemSel = "//li[@class='scores' or @class='scores active']/a";
    public static final String leftMenuClientSpaceItemSel = "//li[@class='client_space' or @class='client_space active']/a";
    public static final String leftMenuLeadCaptureFormItemSel = "//li[@class='lead_capture_form' or @class='lead_capture_form active']/a";
    public static final String leftMenuExportItemSel = "//li[@class='exports' or @class='exports active']/a";
    // Leads Settings Page Selectors
    public static final String leadSourcesTabSel = "//a[@href='#lead-sources']";
    public static final String customFieldTabSel = "//a[@href='#custom-fields']";
    public static final String leadStatusesTabSel = "//a[@href='#lead-status']";
    public static final String tagsTabSel = "//a[@href='#tags']";
    public static final String smartLinksTabSel = "//a[@href='#tools']";
    public static final String existingStatusNamesSel = "//div[@class='control-group item']";
    public static final String editLeadStatusBlockSel = "lead-status";

    @FindBy(xpath = leftMenuManageAccountsItemSel)
    private WebElement leftMenuManageAccountsItem;

    @FindBy(xpath = leftMenuManageUsersItemSel)
    private WebElement leftMenuManageUsersItem;

    @FindBy(xpath = leftMenuProfileItemSel)
    private WebElement leftMenuProfileItem;

    @FindBy(xpath = leftMenuNotificationsItemSel)
    private WebElement leftMenuNotificationsItem;

    @FindBy(xpath = leftMenuImportItemSel)
    private WebElement leftMenuImportItem;

    @FindBy(xpath = leftMenuSingleSignOnItemSel)
    private WebElement leftMenuSingleSignOnItem;

    @FindBy(xpath = leftMenuOAuthItemSel)
    private WebElement leftMenuOAuthItem;

    @FindBy(xpath = leftMenuPricingItemSel)
    private WebElement leftMenuPricingItem;

    @FindBy(xpath = leftMenuBillingItemSel)
    private WebElement leftMenuBillingItem;

    @FindBy(xpath = leftMenuLeadsItemSel)
    private WebElement leftMenuLeadsItem;

    @FindBy(xpath = leftMenuContactsItemSel)
    private WebElement leftMenuContactsItem;

    @FindBy(xpath = leftMenuCustomersItemSel)
    private WebElement leftMenuCustomersItem;

    @FindBy(xpath = leftMenuDealsItemSel)
    private WebElement leftMenuDealsItem;

    @FindBy(xpath = leftMenuProductsItemSel)
    private WebElement leftMenuProductsItem;

    @FindBy(xpath = leftMenuGoalsItemSel)
    private WebElement leftMenuGoalsItem;

    @FindBy(xpath = leftMenuAutomatedActionsItemSel)
    private WebElement leftMenuAutomatedActionsItem;

    @FindBy(xpath = leftMenuIntegrationsItemSel)
    private WebElement leftMenuIntegrationsItem;

    @FindBy(xpath = leftMenuCalendarsItemSel)
    private WebElement leftMenuCalendarsItem;

    @FindBy(xpath = leftMenuEmailItemSel)
    private WebElement leftMenuEmailItem;

    @FindBy(xpath = leftMenuVoiceTextItemSel)
    private WebElement leftMenuVoiceTextItem;

    @FindBy(xpath = leftMenuScoringItemSel)
    private WebElement leftMenuScoringItem;

    @FindBy(xpath = leftMenuClientSpaceItemSel)
    private WebElement leftMenuClientSpaceItem;

    @FindBy(xpath = leftMenuLeadCaptureFormItemSel)
    private WebElement leftMenuLeadCaptureFormItem;

    @FindBy(xpath = leftMenuExportItemSel)
    private WebElement leftMenuExportItem;

    @FindBy(xpath = leadSourcesTabSel)
    private WebElement leadSourcesTab;

    @FindBy(xpath = customFieldTabSel)
    private WebElement customFieldTab;

    @FindBy(xpath = leadStatusesTabSel)
    private WebElement leadStatusesTab;

    @FindBy(xpath = tagsTabSel)
    private WebElement tagsTab;

    @FindBy(xpath = smartLinksTabSel)
    private WebElement smartLinksTab;

    @FindBy(xpath = existingStatusNamesSel)
    private List<WebElement> existingStatusNames;

    @FindBy(id = editLeadStatusBlockSel)
    private WebElement editLeadStatusBlock;

    private WebDriver driver;

    public SettingsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Getters & Setters

    public WebElement getLeftMenuManageAccountsItem() {
        return leftMenuManageAccountsItem;
    }

    public WebElement getLeftMenuManageUsersItem() {
        return leftMenuManageUsersItem;
    }

    public WebElement getLeftMenuProfileItem() {
        return leftMenuProfileItem;
    }

    public WebElement getLeftMenuNotificationsItem() {
        return leftMenuNotificationsItem;
    }

    public WebElement getLeftMenuImportItem() {
        return leftMenuImportItem;
    }

    public WebElement getLeftMenuSingleSignOnItem() {
        return leftMenuSingleSignOnItem;
    }

    public WebElement getLeftMenuOAuthItem() {
        return leftMenuOAuthItem;
    }

    public WebElement getLeftMenuPricingItem() {
        return leftMenuPricingItem;
    }

    public WebElement getLeftMenuBillingItem() {
        return leftMenuBillingItem;
    }

    public WebElement getLeftMenuLeadsItem() {
        return leftMenuLeadsItem;
    }

    public WebElement getLeftMenuContactsItem() {
        return leftMenuContactsItem;
    }

    public WebElement getLeftMenuCustomersItem() {
        return leftMenuCustomersItem;
    }

    public WebElement getLeftMenuDealsItem() {
        return leftMenuDealsItem;
    }

    public WebElement getLeftMenuProductsItem() {
        return leftMenuProductsItem;
    }

    public WebElement getLeftMenuGoalsItem() {
        return leftMenuGoalsItem;
    }

    public WebElement getLeftMenuAutomatedActionsItem() {
        return leftMenuAutomatedActionsItem;
    }

    public WebElement getLeftMenuIntegrationsItem() {
        return leftMenuIntegrationsItem;
    }

    public WebElement getLeftMenuCalendarsItem() {
        return leftMenuCalendarsItem;
    }

    public WebElement getLeftMenuEmailItem() {
        return leftMenuEmailItem;
    }

    public WebElement getLeftMenuVoiceTextItem() {
        return leftMenuVoiceTextItem;
    }

    public WebElement getLeftMenuScoringItem() {
        return leftMenuScoringItem;
    }

    public WebElement getLeftMenuClientSpaceItem() {
        return leftMenuClientSpaceItem;
    }

    public WebElement getLeftMenuLeadCaptureFormItem() {
        return leftMenuLeadCaptureFormItem;
    }

    public WebElement getLeftMenuExportItem() {
        return leftMenuExportItem;
    }

    public WebElement getLeadSourcesTab() {
        return leadSourcesTab;
    }

    public WebElement getCustomFieldTab() {
        return customFieldTab;
    }

    public WebElement getLeadStatusesTab() {
        return leadStatusesTab;
    }

    public WebElement getTagsTab() {
        return tagsTab;
    }

    public WebElement getSmartLinksTab() {
        return smartLinksTab;
    }

    public List<WebElement> getExistingStatusNames() {
        return existingStatusNames;
    }

    public WebElement getEditLeadStatusBlock() {
        return editLeadStatusBlock;
    }
}
