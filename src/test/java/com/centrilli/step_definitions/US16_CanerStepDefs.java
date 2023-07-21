package com.centrilli.step_definitions;

import com.centrilli.pages.ExpensesManagerModulesPage_Caner;
import com.centrilli.pages.HomePage;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.centrilli.utilities.BrowserUtils.verifyTitleContains;

public class US16_CanerStepDefs {

    ExpensesManagerModulesPage_Caner expensesManagerModulesPage_caner = new ExpensesManagerModulesPage_Caner();

    HomePage homePage = new HomePage();


    @Given("user clicks Discuss on the module")
    public void user_clicks_discuss_on_the_module() {
        expensesManagerModulesPage_caner.discussPage.click();
        BrowserUtils.sleep(5);

    }
    @Then("user see #inbox on the title")
    public void user_see_inbox_on_the_title() {
        String expectedTitle = "Inbox";
        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Calendar on the module")
    public void user_clicks_calendar_on_the_module() {
        expensesManagerModulesPage_caner.calenderPage.click();
        //      BrowserUtils.sleep(5);
    }
    @Then("user see Meetings on the title")
    public void user_see_meetings_on_the_title() {
        String expectedTitle = "Meeting";
        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        verifyTitleContains(expectedTitle);
    }


    @Given("user clicks Notes on the module")
    public void user_clicks_notes_on_the_module() {
        expensesManagerModulesPage_caner.notesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Notes on the title")
    public void user_see_notes_on_the_title() {
        String expectedTitle = "Notes";
        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Contacts on the module")
    public void user_clicks_contacts_on_the_module() {
        expensesManagerModulesPage_caner.contactsPage.click();
        BrowserUtils.sleep(7);
    }
    @Then("user see Contacts on the title")
    public void user_see_contacts_on_the_title() {
        String expectedTitle = "Contacts";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Website on the module")
    public void user_clicks_website_on_the_module() {
        expensesManagerModulesPage_caner.websitePage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Login on the title")
    public void user_see_login_on_the_title() {
        String expectedTitle = "Login";
        verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Events on the module")
    public void user_clicks_events_on_the_module() {
        expensesManagerModulesPage_caner.eventsPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Events on the title")
    public void userSeeEventsOnTheTitle() {
        String expectedTitle = "Events";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Employees on the module")
    public void user_clicks_employees_on_the_module() {
        expensesManagerModulesPage_caner.employeesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Employees on the title")
    public void user_see_employees_on_the_title() {
        String expectedTitle = "Employees";
        verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Leaves on the module")
    public void user_clicks_leaves_on_the_module() {
        expensesManagerModulesPage_caner.leavesPages.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Leaves Summary on the title")
    public void user_see_leaves_summary_on_the_title() {
        String expectedTitle = "Leaves Summary";
        verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Expenses on the module")
    public void user_clicks_expenses_on_the_module() {
        expensesManagerModulesPage_caner.expensesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("user see Expenses to Submit on the title")
    public void user_see_expenses_to_submit_on_the_title() {
        String expectedTitle = "My Expenses to Submit";
        verifyTitleContains(expectedTitle);
    }


    @Given("user clicks Lunch on the module")
    public void user_clicks_lunch_on_the_module() {
        expensesManagerModulesPage_caner.lunchPage.click();
        BrowserUtils.sleep(10);
    }
    @Then("user see New Order Teams on the title")
    public void user_see_new_order_teams_on_the_title() {
        String expectedTitle = "New Order";
        verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Maintenance on the module")
    public void user_clicks_maintenance_on_the_module() {
        if (expensesManagerModulesPage_caner.dropdown.isDisplayed()){
            expensesManagerModulesPage_caner.dropdown.click();
            expensesManagerModulesPage_caner.maintenancePageWithDropDown.click();
            BrowserUtils.sleep(5);
        }else{
            expensesManagerModulesPage_caner.maintenancePage.click();
            BrowserUtils.sleep(5);
        }
    }
    @Then("user see Maintenance Teams on the title")
    public void user_see_maintenance_teams_on_the_title() {
        String expectedTitle = "Maintenance";
        verifyTitleContains(expectedTitle);
    }

    @Given("user clicks Dashboard on the module")
    public void user_clicks_dashboard_on_the_module() {
        if (expensesManagerModulesPage_caner.dropdown.isDisplayed()){
            expensesManagerModulesPage_caner.dropdown.click();
            expensesManagerModulesPage_caner.dashBoardsPageWithDropdown.click();
            BrowserUtils.sleep(5);
        }else{
            expensesManagerModulesPage_caner.dashBoardsPage.click();
            BrowserUtils.sleep(5);
        }
    }
    @Then("user see My Dashboard on the title")
    public void user_see_my_dashboard_on_the_title() {
        String expectedTitle = "My Dashboard";
        verifyTitleContains(expectedTitle);
    }



}