package com.testbase.driver.actions;

import com.getbase.Client;
import com.getbase.Configuration;
import com.getbase.models.Address;
import com.testbase.driver.Config;
import com.testbase.driver.entities.Lead;
import com.testbase.driver.utils.Utils;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static com.testbase.driver.pages.Pages.*;
import static com.testbase.driver.utils.TestLogger.info;

/**
 * This class contains actions connected with Leads in Base Platform (both GUI operated and API)
 */
public class Leads {
    public static void createNewLead(Lead lead) {
        Navigation.toLeadsPage();
        info("Clicking new lead button.");
        leadsPage.clickNewLeadButton();
        Utils.waitForAddNewLeadPageOpen();
        addNewLeadPage.fillNewLeadForm(lead);
        addNewLeadPage.clickSaveButton();
        info("Saving data of new lead: " + lead.getName() + " " + lead.getLastName());
        Utils.waitForLeadProfilePageOpen();
    }

    public static void editLeadDataFromLeadsPage(Lead from, Lead to) {
        Navigation.toLeadsPage();
        info("Opening edit lead form at Leads page");
        leadsPage.openEditLeadForm(from);
        Utils.waitForAddNewLeadPageOpen();
        addNewLeadPage.fillNewLeadForm(to);
        addNewLeadPage.clickSaveButton();
        info("Saving edited lead data.");
    }

    public static void createNewLeadUsingAPI(Lead lead) {
        Client client = new Client(new Configuration.Builder().accessToken(Config.ACCESS_TOKEN).build());
        com.getbase.models.Lead baseLead = new com.getbase.models.Lead();
        copyLeadData(baseLead, lead);
        info("Creating new lead using API: " + lead.getName() + " " + lead.getLastName());
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
        if (!leadsPage.openLeadProfile(lead))
            throw new NoSuchElementException("Couldn't find lead in the leads list");
        Utils.waitForLeadProfilePageOpen();
        info("Asserting that lead has '" + statusName + "' status.");
        Assert.assertEquals(leadProfilePage.getStatusName().getText().toLowerCase(), statusName.toLowerCase());
    }
}
