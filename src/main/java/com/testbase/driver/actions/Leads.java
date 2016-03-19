package com.testbase.driver.actions;

import com.getbase.Client;
import com.getbase.Configuration;
import com.getbase.models.Address;
import com.testbase.driver.Config;
import com.testbase.driver.entities.Lead;
import com.testbase.driver.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.testbase.driver.pages.Pages.*;

/**
 * This class contains actions connected with Leads in Base Platform (both GUI operated and API)
 */
public class Leads {
    public static void createNewLead(Lead lead) {
        Navigation.toLeadsPage();
        leadsPage.getNewLeadButton().click();
        fillNewLeadForm(lead);
        addNewLeadPage.getSaveButton().click();
        Utils.waitForLeadProfilePageOpen();
    }

    private static void fillNewLeadForm(Lead lead) {
        addNewLeadPage.getNameField().sendKeys(lead.getName());
        addNewLeadPage.getLastNameField().sendKeys(lead.getLastName());
        addNewLeadPage.getCompanyNameField().sendKeys(lead.getCompanyName());
        addNewLeadPage.getTitleField().sendKeys(lead.getTitle());
        addNewLeadPage.getEmailField().sendKeys(lead.getEmail());
        addNewLeadPage.getMobilePhoneField().sendKeys(lead.getPhoneMobile());
        addNewLeadPage.getWorkPhoneField().sendKeys(lead.getPhoneWork());
        addNewLeadPage.getAddressField().sendKeys(lead.getAddress());
        addNewLeadPage.getCityField().sendKeys(lead.getCity());
        addNewLeadPage.getZipField().sendKeys(lead.getZipCode());
        addNewLeadPage.getRegionField().sendKeys(lead.getState());
    }

    public static void createNewLeadUsingAPI(Lead lead) {
        Client client = new Client(new Configuration.Builder().accessToken(Config.ACCESS_TOKEN).build());
        com.getbase.models.Lead baseLead = new com.getbase.models.Lead();
        copyLeadData(baseLead, lead);
        client.leads().create(baseLead);
    }

    private static void copyLeadData(com.getbase.models.Lead baseLead, Lead lead) {
        baseLead.setFirstName(lead.getName());
        baseLead.setLastName(lead.getLastName());
        baseLead.setOrganizationName(lead.getCompanyName());
        baseLead.setTitle(lead.getTitle());
        baseLead.setEmail(lead.getEmail());
        baseLead.setMobile(lead.getPhoneMobile());
        baseLead.setPhone(lead.getPhoneWork());
        Address address = new Address();
        address.setLine1(lead.getAddress());
        address.setCity(lead.getCity());
        address.setPostalCode(lead.getZipCode());
        address.setState(lead.getState());
        baseLead.setAddress(address);
    }

    public static void assertStatusName(Lead lead, String statusName) {
        Navigation.toLeadsPage();
        leadsPage.getLead(lead.getName(), lead.getLastName()).click();
        Utils.waitForLeadProfilePageOpen();
        Assert.assertEquals(leadProfilePage.getStatusName().getText().toLowerCase(), statusName.toLowerCase());
        System.out.println("Assertion successful");
    }
}
