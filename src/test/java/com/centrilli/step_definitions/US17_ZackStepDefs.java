package com.centrilli.step_definitions;

import com.centrilli.pages.SalesManagerModulesPage_Zack;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US17_ZackStepDefs {

    SalesManagerModulesPage_Zack salesManagerModulesPage_zack = new SalesManagerModulesPage_Zack();

    //-1
    @Given("user click Discuss on sales module")
    public void user_click_discuss_on_module() {
        salesManagerModulesPage_zack.discussPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees #inbox on the title")
    public void user_sees_inbox_on_title() {
        String expectedTitle = "#Inbox";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-2
    @Given("user click Calendar on sales module")
    public void user_click_calendar_on_module() {
        salesManagerModulesPage_zack.calenderPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Meetings on the title")
    public void user_sees_meetings_on_title() {
        String expectedTitle = "Meetings";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-3
    @Given("user click Notes on sales module")
    public void user_click_notes_on_module() {
        salesManagerModulesPage_zack.notesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Notes on the title")
    public void user_sees_notes_on_title() {
        String expectedTitle = "Notes";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-4
    @Given("user click Contact on sales module")
    public void user_click_contact_on_module() {
        salesManagerModulesPage_zack.contactsPage.click();
        BrowserUtils.sleep(7);
    }
    @Then("user sees Contacts on the title")
    public void user_sees_contacts_on_title() {
        String expectedTitle = "Contacts";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-5
    @Given("user click CRM on sales module")
    public void user_click_crm_on_module() {
        salesManagerModulesPage_zack.cRMPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Pipeline on the title")
    public void user_sees_pipeline_on_title() {
        String expectedTitle = "Pipeline";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-6
    @Given("user click Sales on sales module")
    public void user_click_sales_on_module() {
        salesManagerModulesPage_zack.salesPage.click();
        BrowserUtils.sleep(10);
    }
    @Then("user sees Quotations on the title")
    public void user_sees_quotations_on_title() {
        String expectedTitle = "Quotations";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-7
    @Given("user click Website on sales module")
    public void user_click_website_on_module() {
        salesManagerModulesPage_zack.webSitePage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Dashboard on the title")
    public void user_sees_dashboard_on_title() {
        String expectedTitle = "Dashboard";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-8
    @Given("user click Point of Sale on sales module")
    public void user_click_point_of_sale_on_module() {
        salesManagerModulesPage_zack.pointOfSalePage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Point of Sale on the title")
    public void user_sees_point_of_sale_on_title() {
        String expectedTitle = "Point of Sale";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-9
    @Given("user click Purchases on sales module")
    public void user_click_purchases_on_module() {
        salesManagerModulesPage_zack.purchasesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Requests for Quotation on the title")
    public void user_sees_requests_for_quotation_on_title() {
        String expectedTitle = "Requests";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-10
    @Given("user click Inventory on sales module")
    public void user_click_inventory_on_module() {
        salesManagerModulesPage_zack.inventoryPage.click();
        BrowserUtils.sleep(10);
    }
    @Then("user sees Inventory on the title")
    public void user_sees_inventory_on_title() {
        String expectedTitle = "Inventory";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-11
    @Given("user click Repair on sales module")
    public void user_click_repair_on_module() {
        salesManagerModulesPage_zack.repairsPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Repair Orders on the title")
    public void user_sees_repair_orders_on_title() {
        String expectedTitle = "Repair";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-12
    @Given("user click Invoicing on sales module")
    public void user_click_invoicing_on_module() {
        salesManagerModulesPage_zack.invoicingPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Invoicing Orders on the title")
    public void user_sees_invoicing_orders_on_title() {
        String expectedTitle = "Customer Invoices";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-13
    @Given("user click Email Marketing on sales module")
    public void user_click_email_marketing_on_module() {
        salesManagerModulesPage_zack.emailMarketing.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Mass Mailings on the title")
    public void user_sees_mass_mailings_on_title() {
        String expectedTitle = "Mass Mailings";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-14
    @Given("user click Events on sales module")
    public void user_click_events_on_module() {
        salesManagerModulesPage_zack.eventsPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Events on the title")
    public void user_sees_events_on_title() {
        String expectedTitle = "Events";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-15
    @Given("user click Employees on sales module")
    public void user_click_employees_on_module() {
        salesManagerModulesPage_zack.employeesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Employees on the title")
    public void user_sees_employees_on_title() {
        String expectedTitle = "Employees";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-16
    @Given("user click Leaves on sales module")
    public void user_click_leaves_on_module() {
        salesManagerModulesPage_zack.leavesPages.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees Leaves Summary on the title")
    public void user_sees_leaves_summary_on_title() {
        String expectedTitle = "Leaves";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-17
    @Given("user click Expenses on sales module")
    public void user_click_expenses_on_module() {
        if(salesManagerModulesPage_zack.dropDown.isDisplayed()){
            salesManagerModulesPage_zack.dropDown.click();
            salesManagerModulesPage_zack.expensesPageWithDropDown.click();
            BrowserUtils.sleep(5);
        }else{
            salesManagerModulesPage_zack.expensesPage.click();
            BrowserUtils.sleep(5);
        }

    }
    @Then("user sees My Expenses to Submit on the title")
    public void user_sees_my_expenses_to_submit_on_title() {
        String expectedTitle = "My Expenses";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //-18
    @Given("user click Maintenance on sales module")
    public void user_click_maintenance_on_module() {
        if(salesManagerModulesPage_zack.dropDown.isDisplayed()){
            salesManagerModulesPage_zack.dropDown.click();
            salesManagerModulesPage_zack.maintenancePageWithDropDown.click();
            BrowserUtils.sleep(5);
        }else{
            salesManagerModulesPage_zack.maintenancePage.click();
            BrowserUtils.sleep(5);
        }

    }
    @Then("user sees Maintenance Teams on the title")
    public void user_sees_maintenance_teams_on_title() {
        String expectedTitle = "Maintenance";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //-19
    @Given("user click Dashboard on sales module")
    public void user_click_dashboard_on_module() {
        if(salesManagerModulesPage_zack.dropDown.isDisplayed()){
            salesManagerModulesPage_zack.dropDown.click();
            salesManagerModulesPage_zack.dashboardPageWithDropDown.click();
            BrowserUtils.sleep(5);
        }else{
            salesManagerModulesPage_zack.dashboardsPage.click();
            BrowserUtils.sleep(5);
        }
    }
    @Then("user sees My Dashboard on the title")
    public void user_sees_my_dashboard_on_title() {
        String expectedTitle = "My Dashboard";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}
