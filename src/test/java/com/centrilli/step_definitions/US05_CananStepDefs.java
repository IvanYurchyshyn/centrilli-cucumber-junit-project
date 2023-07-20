package com.centrilli.step_definitions;

import com.centrilli.pages.SalesManagerModulesPage_Zack;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class US05_CananStepDefs {

    SalesManagerModulesPage_Zack salesManagerModulePage = new SalesManagerModulesPage_Zack();

    @Given("user is already logged in as sales manager")
    public void userIsAlreadyLoggedInAsSalesManager() {
        LoginStepDefs loginStepDefs = new LoginStepDefs();
        loginStepDefs.userIsAlreadyLoggedInAsManager("sales");
        BrowserUtils.sleep(5);
    }

    @When("user clicks Sales Button at menu")
    public void userClicksSalesButtonAtMenu() {
        salesManagerModulePage.salesPage.click();
        BrowserUtils.sleep(5);

    }

    @And("user clicks Customers Button at sub-menu")
    public void userClicksCustomersButtonAtSubMenu() {

       salesManagerModulePage.customersButton.click();
        BrowserUtils.sleep(5);
    }

    @And("user clicks Create Button")
    public void userClicksCreateButton() {
        salesManagerModulePage.createButton.click();
        BrowserUtils.sleep(5);
    }

    @And("user fills the Name Input Box")
    public void userFillsTheNameInputBox() {

       // BrowserUtils.waitForClickablility(salesManagerModulePage.nameInputBox,5).click();

        salesManagerModulePage.nameInputBox.sendKeys("Customer1");

    }

    @And("user clicks Save Button")
    public void userClicksSaveButton() {
        salesManagerModulePage.customersSaveButton.click();

    }

    @Then("user sees the information of customer which is created")
    public void userSeesTheInformationOfCustomer() {

        boolean customerInfoDisplayed=salesManagerModulePage.customerForm.isDisplayed();
        Assert.assertTrue(customerInfoDisplayed);

        String expectedCustomerInfo= "Customer1";
        Assert.assertEquals(expectedCustomerInfo,salesManagerModulePage.nameInfo.getText());

    }

    @Given("user is on Customers page")
    public void userIsOnCustomersPage() {
        salesManagerModulePage.salesPage.click();
        BrowserUtils.sleep(5);
        salesManagerModulePage.customersButton.click();
        BrowserUtils.sleep(5);

    }

    @And("user clicks any customer")
    public void userClicksAnyCustomer() { // I click only 1 customer ??
        salesManagerModulePage.customer2.click();
        BrowserUtils.sleep(5);

    }

    @And("user clicks Edit Button")
    public void userClicksEditButton() {

        salesManagerModulePage.editButton.click();
        BrowserUtils.sleep(5);
    }

    @And("user selects Individual or Company radio button")
    public void userSelectsIndividualOrCompanyRadioButton() {
        salesManagerModulePage.individiualRadioButton.click();
        salesManagerModulePage.companyRadioButton.click();
        Assert.assertTrue(salesManagerModulePage.companyRadioButton.isSelected());
    }

    @And("user edits Company")
    public void userEditsCompany() {
        salesManagerModulePage.companyDropdown.click();
        BrowserUtils.sleep(2);


    }

    @And("user edits Street Input Boxes")
    public void userEditsStreetInputBoxes() {
    }

    @And("user edits City")
    public void userEditsCity() {
    }

    @And("user edits State")
    public void userEditsState() {
    }

    @And("user edits Country")
    public void userEditsCountry() {
    }

    @And("user edits TIN")
    public void userEditsTIN() {
    }

    @And("User edits Tags")
    public void userEditsTags() {
    }

    @And("user edits Job Position")
    public void userEditsJobPosition() {
    }

    @And("user edits Phone")
    public void userEditsPhone() {
    }

    @And("user edits Mobile")
    public void userEditsMobile() {
    }

    @And("user edits Email")
    public void userEditsEmail() {
    }

    @And("user edits Website")
    public void userEditsWebsite() {
    }

    @And("user edits Title")
    public void userEditsTitle() {
    }

    @And("user edits Language")
    public void userEditsLanguage() {
    }

    @And("user clicks Save")
    public void userClicksSave() {
    }

    @Then("all the boxes should be edited")
    public void allTheBoxesShouldBeEdited() {
    }
}
