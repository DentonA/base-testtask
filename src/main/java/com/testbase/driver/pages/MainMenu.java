package com.testbase.driver.pages;

import com.testbase.driver.utils.SelectorType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

import static com.testbase.driver.utils.TestLogger.info;
import static com.testbase.driver.utils.Utils.exists;

/**
 * This class represents all WebElements that are located in MainMenu part of the
 * Base Platform
 */
public class MainMenu {
    // main menu items
    public static final String mainMenuMainDashboardButtonSel = "//.[@id='nav-dashboard']";
    public static final String mainMenuLeadsButtonSel = "nav-leads";
    public static final String mainMenuContactsButtonSel = "nav-contacts";
    public static final String mainMenuSalesPipelineButtonSel = "nav-sales";
    public static final String mainMenuCalendarButtonSel = "nav-calendar";
    public static final String mainMenuTasksButtonSel = "nav-tasks";
    public static final String mainMenuSMSButtonSel = "nav-communication-center";
    public static final String mainMenuReportsButtonSel = "nav-reports";
    public static final String mainMenuNotificationsWidgetButtonSel = "//li[@id='notifications-widget']/div/a";
    public static final String mainMenuRecentlyViewedButtonSel = "//li[@id='recently-viewed']/a";
    public static final String mainMenuQuickPhoneButtonSel = "//li[@id='quick-add']/a";
    public static final String mainMenuSearchFieldSel = "//input[contains(@class, 'search-query')]";
    // dropdown main menu
    public static final String dropdownMenuClosedSel = "//li[@id='user-dd' and @class='dropdown']/a";
    public static final String dropdownMenuOpenedSel = "//li[@id='user-dd' and @class='dropdown open']/a";
    public static final String dropdownMenuUsernameSel = "//ul[contains(@class, 'dropdown-menu')]/li[@class='user-name']";
    public static final String dropdownMenuSettingsSel = "//li[@class='settings']/a[contains(@href, 'profile')]";
    public static final String dropdownMenuManageAccountSel = "//li[@class='settings']/a[contains(@href, 'account')]";
    public static final String dropdownMenuManageRepositorySel = "//li[@class='documents']/a";
    public static final String dropdownMenuKeyboardShortcutsSel = "keyboard-shortcuts";
    public static final String dropdownMenuSupportSel = "//a[@class='support' and contains(text(), 'Support')]";
    public static final String dropdownMenuWebinarSel = "//a[@class='support' and contains(text(), 'Webinar')]";
    public static final String dropdownMenuSuggestionsSel = "//a[@class='support user-voice']";
    public static final String dropdownMenuPrivacyPolicySel = "//a[@class='support' and contains(text(), 'Policy')]";
    public static final String dropdownMenuTermsOfServiceSel = "//a[@class='support' and contains(text(), 'Terms')]";
    public static final String dropdownMenuLogoutSel = "agility-ignore";

    private static Map<String, String> buttonNamesMap = new HashMap<>();

    static {
        buttonNamesMap.put(mainMenuMainDashboardButtonSel, "dashboard button");
        buttonNamesMap.put(mainMenuLeadsButtonSel, "leads button");
        buttonNamesMap.put(mainMenuContactsButtonSel, "contacts button");
        buttonNamesMap.put(mainMenuSalesPipelineButtonSel, "sales pipeline button");
        buttonNamesMap.put(mainMenuCalendarButtonSel, "calendar button");
        buttonNamesMap.put(mainMenuTasksButtonSel, "menu tasks button");
        buttonNamesMap.put(mainMenuSMSButtonSel, "communication center button");
        buttonNamesMap.put(mainMenuReportsButtonSel, "reports button");
        buttonNamesMap.put(mainMenuNotificationsWidgetButtonSel, "notifications widget button");
        buttonNamesMap.put(mainMenuRecentlyViewedButtonSel, "recently viewed button");
        buttonNamesMap.put(mainMenuQuickPhoneButtonSel, "quick phone button");
        buttonNamesMap.put(dropdownMenuSettingsSel, "settings menu item");
        buttonNamesMap.put(dropdownMenuManageAccountSel, "manage account menu item");
        buttonNamesMap.put(dropdownMenuManageRepositorySel, "manage repository menu item");
        buttonNamesMap.put(dropdownMenuKeyboardShortcutsSel, "keyboard shortcuts menu item");
        buttonNamesMap.put(dropdownMenuSupportSel, "support menu item");
        buttonNamesMap.put(dropdownMenuWebinarSel, "webinar menu item");
        buttonNamesMap.put(dropdownMenuSuggestionsSel, "suggestions menu item");
        buttonNamesMap.put(dropdownMenuPrivacyPolicySel, "privacy policy menu item");
        buttonNamesMap.put(dropdownMenuTermsOfServiceSel, "terms of service menu item");
        buttonNamesMap.put(dropdownMenuLogoutSel, "logout menu item");
    }

    @FindBy(xpath = mainMenuMainDashboardButtonSel)
    private WebElement mainMenuMainDashboardButton;

    @FindBy(id = mainMenuLeadsButtonSel)
    private WebElement mainMenuLeadsButton;

    @FindBy(id = mainMenuContactsButtonSel)
    private WebElement mainMenuContactsButton;

    @FindBy(id = mainMenuSalesPipelineButtonSel)
    private WebElement mainMenuSalesPipelineButton;

    @FindBy(id = mainMenuCalendarButtonSel)
    private WebElement mainMenuCalendarButton;

    @FindBy(id = mainMenuTasksButtonSel)
    private WebElement mainMenuTasksButton;

    @FindBy(id = mainMenuSMSButtonSel)
    private WebElement mainMenuSMSButton;

    @FindBy(id = mainMenuReportsButtonSel)
    private WebElement mainMenuReportsButton;

    @FindBy(xpath = mainMenuNotificationsWidgetButtonSel)
    private WebElement mainMenuNotificationsWidgetButton;

    @FindBy(xpath = mainMenuRecentlyViewedButtonSel)
    private WebElement mainMenuRecentlyViewedButton;

    @FindBy(xpath = mainMenuQuickPhoneButtonSel)
    private WebElement mainMenuQuickPhoneButton;

    @FindBy(xpath = mainMenuSearchFieldSel)
    private WebElement mainMenuSearchField;

    @FindBy(xpath = dropdownMenuClosedSel)
    private WebElement dropdownMenuClosed;

    @FindBy(xpath = dropdownMenuOpenedSel)
    private WebElement dropdownMenuOpened;

    @FindBy(xpath = dropdownMenuUsernameSel)
    private WebElement dropdownMenuUsername;

    @FindBy(xpath = dropdownMenuSettingsSel)
    private WebElement dropdownMenuSettings;

    @FindBy(xpath = dropdownMenuManageAccountSel)
    private WebElement dropdownMenuManageAccount;

    @FindBy(xpath = dropdownMenuManageRepositorySel)
    private WebElement dropdownMenuManageRepository;

    @FindBy(className = dropdownMenuKeyboardShortcutsSel)
    private WebElement dropdownMenuKeyboardShortcuts;

    @FindBy(className = dropdownMenuSupportSel)
    private WebElement dropdownMenuSupport;

    @FindBy(className = dropdownMenuWebinarSel)
    private WebElement dropdownMenuWebinar;

    @FindBy(className = dropdownMenuSuggestionsSel)
    private WebElement dropdownMenuSuggestions;

    @FindBy(className = dropdownMenuPrivacyPolicySel)
    private WebElement dropdownMenuPrivacyPolicy;

    @FindBy(className = dropdownMenuTermsOfServiceSel)
    private WebElement dropdownMenuTermsOfService;

    @FindBy(className = dropdownMenuLogoutSel)
    private WebElement dropdownMenuLogout;

    private WebDriver driver;

    public MainMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickButton(String selector, SelectorType type) {
        if (exists(selector, type)) {
            switch (type) {
                case XPATH:
                    driver.findElement(By.xpath(selector)).click();
                    break;
                case ID:
                    driver.findElement(By.id(selector)).click();
                    break;
                case CLASSNAME:
                    driver.findElement(By.className(selector)).click();
                    break;
            }
        } else {
            if (buttonNamesMap.get(selector) != null) {
                info("Fail clicking " + buttonNamesMap.get(selector));
                throw new NoSuchElementException("Couldn't find " + buttonNamesMap.get(selector));
            } else {
                info("Fail clicking button in main menu with selector: '" + selector + "'");
                throw new NoSuchElementException("Couldn't find button in main menu with selector: '" + selector + "'");
            }
        }
    }

    public void openDropdownMenu() {
        if (exists(dropdownMenuClosedSel, SelectorType.XPATH)) {
            dropdownMenuClosed.click();
        } else if (!exists(dropdownMenuOpenedSel, SelectorType.XPATH)) {
            info("Fail opening the main menu. It doesn't exist on the current screen.");
            throw new NoSuchElementException("Couldn't find main menu");
        }
    }

    public void clickLogout() {
        if (exists(dropdownMenuLogoutSel, SelectorType.CLASSNAME))
            dropdownMenuLogout.click();
        else {
            info("Fail clicking logout menu item.");
            throw new NoSuchElementException("Couldn't find logout menu item");
        }
    }

    // Getters & Setters

    public WebElement getMainMenuMainDashboardButton() {
        return mainMenuMainDashboardButton;
    }

    public WebElement getMainMenuLeadsButton() {
        return mainMenuLeadsButton;
    }

    public WebElement getMainMenuContactsButton() {
        return mainMenuContactsButton;
    }

    public WebElement getMainMenuSalesPipelineButton() {
        return mainMenuSalesPipelineButton;
    }

    public WebElement getMainMenuCalendarButton() {
        return mainMenuCalendarButton;
    }

    public WebElement getMainMenuTasksButton() {
        return mainMenuTasksButton;
    }

    public WebElement getMainMenuSMSButton() {
        return mainMenuSMSButton;
    }

    public WebElement getMainMenuReportsButton() {
        return mainMenuReportsButton;
    }

    public WebElement getMainMenuNotificationsWidgetButton() {
        return mainMenuNotificationsWidgetButton;
    }

    public WebElement getMainMenuRecentlyViewedButton() {
        return mainMenuRecentlyViewedButton;
    }

    public WebElement getMainMenuQuickPhoneButton() {
        return mainMenuQuickPhoneButton;
    }

    public WebElement getMainMenuSearchField() {
        return mainMenuSearchField;
    }

    public WebElement getDropdownMenuClosed() {
        return dropdownMenuClosed;
    }

    public WebElement getDropdownMenuOpened() {
        return dropdownMenuOpened;
    }

    public WebElement getDropdownMenuUsername() {
        return dropdownMenuUsername;
    }

    public WebElement getDropdownMenuSettings() {
        return dropdownMenuSettings;
    }

    public WebElement getDropdownMenuManageAccount() {
        return dropdownMenuManageAccount;
    }

    public WebElement getDropdownMenuManageRepository() {
        return dropdownMenuManageRepository;
    }

    public WebElement getDropdownMenuKeyboardShortcuts() {
        return dropdownMenuKeyboardShortcuts;
    }

    public WebElement getDropdownMenuSupport() {
        return dropdownMenuSupport;
    }

    public WebElement getDropdownMenuWebinar() {
        return dropdownMenuWebinar;
    }

    public WebElement getDropdownMenuSuggestions() {
        return dropdownMenuSuggestions;
    }

    public WebElement getDropdownMenuPrivacyPolicy() {
        return dropdownMenuPrivacyPolicy;
    }

    public WebElement getDropdownMenuTermsOfService() {
        return dropdownMenuTermsOfService;
    }

    public WebElement getDropdownMenuLogout() {
        return dropdownMenuLogout;
    }
}
