package com.centrilli.step_definitions;

import com.centrilli.pages.InventoryManagerModulesPage_Caner;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;

public class US14_CanerStepDefs {


    InventoryManagerModulesPage_Caner inventoryManagerModulesPage_caner = new InventoryManagerModulesPage_Caner();


    @Given("user clicks Discuss on module")
    public void user_clicks_discuss_on_module() {
        inventoryManagerModulesPage_caner.discussPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see #inbox on title")
    public void user_see_inbox_on_title() {
        String expectedTitle = "Inbox";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Calendar on module")
    public void user_clicks_calendar_on_module() {
        inventoryManagerModulesPage_caner.calenderPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Meetings on title")
    public void user_see_meetings_on_title() {
        String expectedTitle = "Meeting";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @Given("user clicks Notes on module")
    public void user_clicks_notes_on_module() {
        inventoryManagerModulesPage_caner.notesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Notes on title")
    public void user_see_notes_on_title() {
        String expectedTitle = "Notes";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @Given("user clicks Contact on module")
    public void user_clicks_contact_on_module() {
        inventoryManagerModulesPage_caner.contactsPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Contacts on title")
    public void user_see_contacts_on_title() {
        String expectedTitle = "Contacts";
        BrowserUtils.verifyTitleContains(expectedTitle);

    }


    @Given("user clicks Website on module")
    public void user_clicks_website_on_module() {
        inventoryManagerModulesPage_caner.webSitePage.click();
        BrowserUtils.sleep(5);

    }
    @Then("user see Login on title")
    public void user_see_login_on_title() {
        String expectedTitle = "Login";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @Given("user clicks Inventory on module")
    public void user_clicks_inventory_on_module() {
        inventoryManagerModulesPage_caner.inventoryPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Inventory on title")
    public void user_see_inventory_on_title() {
        String expectedTitle = "Inventory";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Manufacturing on module")
    public void user_clicks_manufacturing_on_module() {
        inventoryManagerModulesPage_caner.manufacturingPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Manufacturing Orders on title")
    public void user_see_manufacturing_orders_on_title() {
        String expectedTitle = "Manufacturing Orders";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Repair on module")
    public void user_clicks_repair_on_module() {
        inventoryManagerModulesPage_caner.repairsPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Repair Orders on title")
    public void user_see_repair_orders_on_title() {
        String expectedTitle = "Repair Orders";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Invoicing on module")
    public void user_clicks_invoicing_on_module() {
        inventoryManagerModulesPage_caner.invoicingPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Customer Invoices on title")
    public void user_see_customer_invoices_on_title() {
        String expectedTitle = "Customer Invoices";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Email Marketing on module")
    public void user_clicks_email_marketing_on_module() {
        inventoryManagerModulesPage_caner.emailMarketingPage.click();
        BrowserUtils.sleep(5);

    }
    @Then("user see Mass Mailings on title")
    public void user_see_mass_mailings_on_title() {
        String expectedTitle = "Mass Mailings";
        BrowserUtils.verifyTitleContains(expectedTitle);

    }

    @Given("user clicks Employees on module")
    public void user_clicks_employees_on_module() {
        inventoryManagerModulesPage_caner.employeesPage.click();
        BrowserUtils.sleep(5);

    }
    @Then("user see Employees on title")
    public void user_see_employees_on_title() {
        String expectedTitle = "Employees";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    @Given("user clicks Leaves on module")
    public void user_clicks_leaves_on_module() {
        inventoryManagerModulesPage_caner.leavesPages.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Leaves Summary on title")
    public void user_see_leaves_summary_on_title() {
        String expectedTitle = "Leaves Summary";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @Given("user clicks Expenses on module")
    public void user_clicks_expenses_on_module() {
        inventoryManagerModulesPage_caner.expensesPage.click();
        BrowserUtils.sleep(5);
    }

    @Then("user see My Expenses to Submit on title")
    public void user_see_my_expenses_to_submit_on_title() {
        String expectedTitle = "My Expenses to Submit";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    @Given("user clicks Lunch on module")
    public void user_clicks_lunch_on_module() {
        inventoryManagerModulesPage_caner.lunchPage.click();
        BrowserUtils.sleep(10);
    }

    @Then("user see New Order Teams on title")
    public void user_see_new_order_teams_on_title() {
        String expectedTitle = "New Order";
        BrowserUtils.verifyTitleContains(expectedTitle);

    }

    @Given("user clicks Maintenance on module")
    public void user_clicks_maintenance_on_module() {
        if (inventoryManagerModulesPage_caner.dropdown.isDisplayed()){
            inventoryManagerModulesPage_caner.dropdown.click();
            inventoryManagerModulesPage_caner.maintenancePageWithDropDown.click();
            BrowserUtils.sleep(5);
        }else{
            inventoryManagerModulesPage_caner.maintenancePage.click();
            BrowserUtils.sleep(5);
        }

    }
    @Then("user see Maintenance Teams on title")
    public void user_see_maintenance_teams_on_title() {
        String expectedTitle = "Maintenance";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    @Given("user clicks Dashboard on module")
    public void user_clicks_dashboard_on_module() {
        if (inventoryManagerModulesPage_caner.dropdown.isDisplayed()){
            inventoryManagerModulesPage_caner.dropdown.click();
            inventoryManagerModulesPage_caner.dashBoardsPageWithDropdown.click();
            BrowserUtils.sleep(5);
        }else{
            inventoryManagerModulesPage_caner.dashBoardsPage.click();
            BrowserUtils.sleep(5);
        }

    }
    @Then("user see My Dashboard on title")
    public void user_see_my_dashboard_on_title() {
        String expectedTitle = "My Dashboard";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



}