package com.centrilli.step_definitions;

import com.centrilli.pages.EventManagerModulesPage_Zack;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US15_ZackStepDefs {


    EventManagerModulesPage_Zack eventManagerModulesPage_zack = new EventManagerModulesPage_Zack();

    //-1
    @Given("user click Discuss on module")
    public void user_click_discuss_on_module() {
        eventManagerModulesPage_zack.discussPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees #inbox on title")
    public void user_sees_inbox_on_title() {
        String expectedTitle = "Inbox";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


    //-2
    @Given("user click Calendar on module")
    public void user_click_calendar_on_module() {
        eventManagerModulesPage_zack.calenderPage.click();
        BrowserUtils.sleep(5);

    }
    @Then("user sees Meetings on title")
    public void user_sees_meetings_on_title() {
        String expectedTitle = "Meetings";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    //-3
    @Given("user click Notes on module")
    public void user_click_notes_on_module() {
        eventManagerModulesPage_zack.notesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Notes on title")
    public void user_sees_notes_on_title() {
        String expectedTitle = "Notes";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    //-4
    @Given("user click Contact on module")
    public void user_click_contact_on_module() {
        eventManagerModulesPage_zack.contactsPage.click();
        BrowserUtils.sleep(7);
    }
    @Then("user sees Contacts on title")
    public void user_sees_contacts_on_title() {
        String expectedTitle = "Contacts";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-5
    @Given("user click CRM on module")
    public void user_click_crm_on_module() {
        eventManagerModulesPage_zack.cRMPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Pipeline on title")
    public void user_sees_pipeline_on_title() {
        String expectedTitle = "Pipeline";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-6
    @Given("user click Sales on module")
    public void user_click_sales_on_module() {
        eventManagerModulesPage_zack.salesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Quotations on title")
    public void user_sees_quotations_on_title() {
        String expectedTitle = "Quotations";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-7
    @Given("user click Website on module")
    public void user_click_website_on_module() {
        eventManagerModulesPage_zack.webSitePage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Dashboard on title")
    public void user_sees_dashboard_on_title() {
        String expectedTitle = "Dashboard";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-8
    @Given("user click Inventory on module")
    public void user_click_inventory_on_module() {
        eventManagerModulesPage_zack.inventoryPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Inventory on title")
    public void user_sees_inventory_on_title() {
        String expectedTitle = "Inventory";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-9
    @Given("user click Repair on module")
    public void user_click_repair_on_module() {
        eventManagerModulesPage_zack.repairsPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Repair Orders on title")
    public void user_sees_repair_orders_on_title() {
        String expectedTitle = "Repair Order";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-10
    @Given("user click Events on module")
    public void user_click_events_on_module() {
        eventManagerModulesPage_zack.eventsPage.click();
        BrowserUtils.sleep(5);

    }
    @Then("user sees Events on title")
    public void user_sees_events_on_title() {
        String expectedTitle = "Events";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-11
    @Given("user click Employees on module")
    public void user_click_employees_on_module() {
        eventManagerModulesPage_zack.employeesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Employees on title")
    public void user_sees_employees_on_title() {
        String expectedTitle = "Employees";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-12
    @Given("user click Leaves on module")
    public void user_click_leaves_on_module() {
        eventManagerModulesPage_zack.leavesPages.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Leaves Summary on title")
    public void user_sees_leaves_summary_on_title() {
        String expectedTitle = "Leaves Summary";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-13
    @Given("user click Expenses on module")
    public void user_click_expenses_on_module() {
        eventManagerModulesPage_zack.expensesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees My Expenses to Submit on title")
    public void user_sees_my_expenses_to_submit_on_title() {
        String expectedTitle = "Expenses";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-14
    @Given("user click Maintenance on module")
    public void user_click_maintenance_on_module() {
        eventManagerModulesPage_zack.maintenancePage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Maintenance Teams on title")
    public void user_sees_maintenance_teams_on_title() {
        String expectedTitle = "Maintenance Teams";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-15
    @Given("user click Dashboard on module")
    public void user_click_dashboard_on_module() {
        eventManagerModulesPage_zack.dashBoardsPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees My Dashboard on title")
    public void user_sees_my_dashboard_on_title() {
        String expectedTitle = "My Dashboard";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

}
