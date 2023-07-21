package com.centrilli.step_definitions;

import com.centrilli.pages.POS_ManagerModulePage_tutta;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US13_Tutta_StepDefs {


    POS_ManagerModulePage_tutta POS_ManagerModulePage_tutta = new POS_ManagerModulePage_tutta();



    // 1

    @Given("POS manager click the Discuss module")
    public void pos_manager_click_the_discuss_module() {
        POS_ManagerModulePage_tutta.discussModule.click();
        BrowserUtils.sleep(5);
    }


    @Then("user sees the title is changing to Inbox")
    public void user_sees_the_title_is_changing_to_inbox() {

        String expectedTitle = "Inbox";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    // 2
    @Given("POS manager click the Calendar module")
    public void pos_manager_click_the_calendar_module() {
        POS_ManagerModulePage_tutta.calenderModule.click();
        BrowserUtils.sleep(7);
    }

    @Then("user sees the title is changing to Meetings")
    public void user_sees_the_title_is_changing_to_meetings() {

        String expectedTitle = "Meetings";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //3
    @Given("POS manager click the Notes module")
    public void pos_manager_click_the_notes_module() {
        POS_ManagerModulePage_tutta.notesModule.click();
        BrowserUtils.sleep(7);
    }

    @Then("user sees the title is changing to Notes")
    public void user_sees_the_title_is_changing_to_notes() {
        String expectedTitle = "Notes";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //4
    @Given("POS manager click the Contacts module")
    public void pos_manager_click_the_contacts_module() {
        POS_ManagerModulePage_tutta.contactsModule.click();
        BrowserUtils.sleep(7);
    }
    @Then("user sees the title is changing to Contacts")
    public void user_sees_the_title_is_changing_to_contacts() {

        String expectedTitle = "Contacts";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //5
    @Given("POS manager click the CRM module")
    public void pos_manager_click_the_crm_module() {
        POS_ManagerModulePage_tutta.CrmModule.click();
        BrowserUtils.sleep(7);
    }
    @Then("user sees the title is changing to Pipeline")
    public void user_sees_the_title_is_changing_to_pipeline() {

        String expectedTitle = "Pipeline";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    //6
    @Given("POS manager click the Sales module")
    public void pos_manager_click_the_sales_module() {
        POS_ManagerModulePage_tutta.salesModule.click();
        BrowserUtils.sleep(7);
    }
    @Then("user sees the title is changing to Quotations")
    public void user_sees_the_title_is_changing_to_quotations() {

        String expectedTitle = "Quotations";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //7
    @Given("POS manager click the Website module")
    public void pos_manager_click_the_website_module() {
        POS_ManagerModulePage_tutta.webSiteModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to Dashboard")
    public void user_sees_the_title_is_changing_to_Dashboard() {

        String expectedTitle = "Dashboard";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //8
    @Given("POS manager click the Point of Sale module")
    public void pos_manager_click_the_point_of_sale_module() {
        POS_ManagerModulePage_tutta.pointOfSaleModule.click();
        BrowserUtils.sleep(5);
    }

    @Then("user sees the title is changing to Point of Sale")
    public void user_sees_the_title_is_changing_to_point_of_sale() {

        String expectedTitle = "Point of Sale";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //9
    @Given("POS click the Purchases module")
    public void pos_click_the_purchases_module() {
        POS_ManagerModulePage_tutta.purchasesModule.click();
        BrowserUtils.sleep(5);
    }

    @Then("user sees the title is changing to Request for Quotation")
    public void user_sees_the_title_is_changing_to_request_for_quotation() {

        String expectedTitle = "Request for Quotations";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //10
    @Given("POS manager click the Inventory module")
    public void pos_manager_click_the_inventory_module() {
        POS_ManagerModulePage_tutta.inventoryModule.click();
        BrowserUtils.sleep(5);
    }

    @Then("user sees the title is changing to Inventory")
    public void user_sees_the_title_is_changing_to_inventory() {

        String expectedTitle = "Inventory";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }



    //12
    @Given("POS manager click the Repairs module")
    public void pos_manager_click_the_repairs_module() {
        POS_ManagerModulePage_tutta.RepairsModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to Repair Orders")
    public void user_sees_the_title_is_changing_to_repair_orders() {

        String expectedTitle = "Repair Orders";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    //13
    @Given("POS manager click the Project module")
    public void pos_manager_click_the_project_module() {
        POS_ManagerModulePage_tutta.ProjectModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to Project")
    public void user_sees_the_title_is_changing_to_project() {

        String expectedTitle = "Project";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //14
    @Given("POS manager click the Events module")
    public void pos_manager_click_the_events_module() {
        POS_ManagerModulePage_tutta.EventsModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to Events")
    public void user_sees_the_title_is_changing_to_events() {

        String expectedTitle = "Events";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //15
    @Given("POS manager click the Surveys module")
    public void pos_manager_click_the_surveys_module() {
        POS_ManagerModulePage_tutta.SurveysModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to Surveys")
    public void user_sees_the_title_is_changing_to_surveys() {

        String expectedTitle = "Surveys";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //16
    @Given("POS manager click the Employees module")
    public void pos_manager_click_the_employees_module() {
        POS_ManagerModulePage_tutta.EmployeesModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to Employees")
    public void user_sees_the_title_is_changing_to_employees() {

        String expectedTitle = "Employees";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //17
    @Given("POS manager click the Attendances module")
    public void pos_manager_click_the_attendances_module() {
        POS_ManagerModulePage_tutta.AttendancesModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to Attendance")
    public void user_sees_the_title_is_changing_to_attendance() {

        String expectedTitle = "Attendance";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    //18
    @Given("POS manager click the Leaves module")
    public void pos_manager_click_the_leaves_module() {
        POS_ManagerModulePage_tutta.LeavesModule.click();
        BrowserUtils.sleep(5);
    }
    @Then("user sees the title is changing to All Leaves")
    public void user_sees_the_title_is_changing_to_all_leaves() {

        String expectedTitle = "All Leaves";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @Given("POS manager click the Expenses module")
    public void posManagerClickTheExpensesModule() {
        if (POS_ManagerModulePage_tutta.MoreDropdownModule.isDisplayed()){
            POS_ManagerModulePage_tutta.MoreDropdownModule.click();
            POS_ManagerModulePage_tutta.ExpensesDropdownModule.click();
        }else{
            POS_ManagerModulePage_tutta.ExpensesModule.click();
        }
    }

    @Then("user sees the title is changing to My Expenses to Submit")
    public void userSeesTheTitleIsChangingToMyExpensesToSubmit() {
        String expectedTitle = "My Expenses to Submit";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("POS manager click the Maintenance module")
    public void posManagerClickTheMaintenanceModule() {
        if (POS_ManagerModulePage_tutta.MoreDropdownModule.isDisplayed()){
            POS_ManagerModulePage_tutta.MoreDropdownModule.click();
            POS_ManagerModulePage_tutta.MaintenanceDropdownModule.click();
        }else{
            POS_ManagerModulePage_tutta.MaintenanceModule.click();
        }
    }

    @Then("user sees the title is changing to Maintenance Teams")
    public void userSeesTheTitleIsChangingToMaintenanceTeams() {
        String expectedTitle = "Maintenance Teams";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("POS manager click the Fleet module")
    public void posManagerClickTheFleetModule() {
        if (POS_ManagerModulePage_tutta.MoreDropdownModule.isDisplayed()){
            POS_ManagerModulePage_tutta.MoreDropdownModule.click();
            POS_ManagerModulePage_tutta.FleetDropdownModule.click();
        }else{
            POS_ManagerModulePage_tutta.FleetModule.click();
        }
    }

    @Then("user sees the title is changing to Vehicles")
    public void userSeesTheTitleIsChangingToVehicles() {
        String expectedTitle = "Vehicles";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("POS manager click the Dashboard module")
    public void posManagerClickTheDashboardModule() {
        if (POS_ManagerModulePage_tutta.MoreDropdownModule.isDisplayed()){
            POS_ManagerModulePage_tutta.MoreDropdownModule.click();
            POS_ManagerModulePage_tutta.DashboardsDropdownModule.click();
        }else{
            POS_ManagerModulePage_tutta.DashboardsModule.click();
        }
    }

    @Then("user sees the title is changing to My Dashboard")
    public void userSeesTheTitleIsChangingToMyDashboard() {
        String expectedTitle = "My Dashboard";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }

    @Given("POS manager click the Manufacturing module")
    public void posManagerClickTheManufacturingModule() {
        POS_ManagerModulePage_tutta.manufacturingModule.click();
    }

    @Then("user sees the title is changing to Manufacturing Orders")
    public void userSeesTheTitleIsChangingToManufacturingOrders() {
        String expectedTitle = "Manufacturing Orders";
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}




