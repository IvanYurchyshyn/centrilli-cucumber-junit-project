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
import org.openqa.selenium.support.ui.Select;

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

    @And("user fills the Name Input Box as {string}")
    public void userFillsTheNameInputBoxAs(String customerName) {
        salesManagerModulePage.nameInputBox.sendKeys(customerName);
    }

    @And("user clicks Save Button")
    public void userClicksSaveButton() {
        salesManagerModulePage.customersSaveButton.click();
    }

    @Then("user sees the information of customer which is created")
    public void userSeesTheInformationOfCustomer() {

        boolean customerInfoDisplayed=salesManagerModulePage.customerForm.isDisplayed();
        Assert.assertTrue(customerInfoDisplayed);

        String expectedCustomerInfo= "John";
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
    public void userClicksAnyCustomer() { // I click only 1 customer.
        salesManagerModulePage.customer2.click();
        BrowserUtils.sleep(5);

    }

    @And("user clicks Edit Button")
    public void userClicksEditButton() {

        salesManagerModulePage.editButton.click();
        BrowserUtils.sleep(5);
    }

    @And("user selects Individual radio button")
    public void userSelectsIndividualRadioButton() {
        salesManagerModulePage.individualRadioButton.click();
        Assert.assertTrue(salesManagerModulePage.individualRadioButton.isSelected());
    }

    @And("user selects Company radio button")
    public void userSelectsCompanyRadioButton() {
        salesManagerModulePage.companyRadioButton.click();
        Assert.assertTrue(salesManagerModulePage.companyRadioButton.isSelected());
    }


    @And("user edits Name as {string}")
    public void userEditsNameAs(String editName) {
        salesManagerModulePage.nameInputBox.sendKeys (editName);
        salesManagerModulePage.nameInputBox.click();
      //  Assert.assertTrue((salesManagerModulePage.nameInputBox.getText().contains(editName)));

    }

    @And("user edits Company as {string}")
    public void userEditsCompanyAs(String companyName) {
        salesManagerModulePage.companyDropdownInputField.click();
        BrowserUtils.sleep(1);
        Select companySelect=new Select(salesManagerModulePage.companyDropdownInputField);
        companySelect.selectByVisibleText(companyName);
        String expectedCompanyName="ASfdADSF";
        Assert.assertTrue(salesManagerModulePage.companyDropdownInputField.getText().contains(expectedCompanyName));

    }

    @And("user edits Street Input Boxes as {string},")
    public void userEditsStreetInputBoxesAs(String street1) {
        salesManagerModulePage.streetInputBox.sendKeys(street1);
        String expectedStreet1="Oe Street";
        Assert.assertTrue(salesManagerModulePage.streetInputBox.getText().contains(expectedStreet1));

    }

    @And("user edits Streetb Input Boxes as {string},")
    public void userEditsStreetbInputBoxesAs(String street2) {
        salesManagerModulePage.street2InputBox.sendKeys(street2);
        String expectedStreet2="1212";
        Assert.assertTrue(salesManagerModulePage.street2InputBox.getText().contains(expectedStreet2));

    }

    @And("user edits City as {string}")
    public void userEditsCityAs(String city) {
        salesManagerModulePage.cityInputBox.sendKeys(city);
        String expectedCity="London";
        Assert.assertTrue(salesManagerModulePage.cityInputBox.getText().contains(expectedCity));
    }


    @And("user edits Zip as {string}")
    public void userEditsZipAs(String zip) {
        salesManagerModulePage.zipInputBox.sendKeys(zip);
        String expectedZip="N1P 3AG";
        Assert.assertTrue(salesManagerModulePage.zipInputBox.getText().contains(expectedZip));

    }

    @And("user edits TIN as {string}")
    public void userEditsTINAs(String tin) {
        salesManagerModulePage.tinInputBox.sendKeys(tin);
        String expectedTin="2544523";
        Assert.assertTrue(salesManagerModulePage.tinInputBox.getText().contains(expectedTin));
    }

    @And("user edits Job Position as {string}")
    public void userEditsJobPositionAs(String job) {
        salesManagerModulePage.jobPositionInputBox.sendKeys(job);
        String expectedJob="Consultant";
        Assert.assertTrue(salesManagerModulePage.jobPositionInputBox.getText().contains(expectedJob));


    }

    @And("user edits Phone as {string}")
    public void userEditsPhoneAs(String phone) {

        salesManagerModulePage.phoneInputBox.sendKeys(phone);
        String expectedPhone="440903022";
        Assert.assertTrue(salesManagerModulePage.phoneInputBox.getText().contains(expectedPhone));
    }

    @And("user edits Mobile as {string}")
    public void userEditsMobileAs(String mobile) {
        salesManagerModulePage.mobileInputBox.sendKeys(mobile);
        String expectedMobile="255542321";
        Assert.assertTrue(salesManagerModulePage.mobileInputBox.getText().contains(expectedMobile));

    }

    @And("user edits Email as {string}")
    public void userEditsEmailAs(String email) {

        salesManagerModulePage.mailIputBox.sendKeys(email);
        String expectedMail="jnf@gmail.com";
        Assert.assertTrue(salesManagerModulePage.mailIputBox.getText().contains(expectedMail));

    }

    @And("user edits Website as {string}")
    public void userEditsWebsiteAs(String website) {
        salesManagerModulePage.websiteInputBox.sendKeys(website);
        String expectedWebsite="jnf@aa.io.com";
        Assert.assertTrue(salesManagerModulePage.websiteInputBox.getText().contains(expectedWebsite));

    }


    @Then("user clicks Save")
    public void userClicksSave() {
        salesManagerModulePage.editSaveButton.click();
    }


}
