package com.centrilli.step_definitions;

import com.centrilli.pages.InboxPageJovana;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US2_JovanaStepDefs {
    LoginPage loginPage=new LoginPage();
    InboxPageJovana inboxPageJovana=new InboxPageJovana();

    @Given("Sales manager is typing correct {string} address into the email text box")
    public void sales_manager_is_typing_correct_address_into_the_email_text_box(String email) {
loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("salesMEmail"));
        BrowserUtils.sleep(2);
    }
    @Then("Sales manager is typing correct {string} into the password text box")
    public void sales_manager_is_typing_correct_into_the_password_text_box(String password) {
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("salesMPassword"));
        BrowserUtils.sleep(2);
    }
    @Then("Sales manager is clicking on login button")
    public void sales_manager_is_clicking_on_login_button() {
        loginPage.submitButton.click();
        BrowserUtils.sleep(2);
    }

    @And("Sales manager is typing correct {string} into the password text box and press enter")

    public void salesManagerIsTypingCorrectIntoThePasswordTextBoxAndPressEnter(String arg0) {

        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("salesMPassword")+ Keys.ENTER);

    }



    @Then("Sales manager is on the inbox page and can see the account name")
    public void sales_manager_is_on_the_inbox_page_and_can_see_the_account_name() {
      inboxPageJovana.accountName.isDisplayed();
      String actualName=inboxPageJovana.accountName.getText();
      String expectedName="SalesManager"+ConfigurationReader.getProperty("salesMEmail").substring(12,ConfigurationReader.getProperty("salesMEmail").indexOf("@"));
      Assert.assertEquals(actualName,expectedName);
        BrowserUtils.sleep(2);

    }




    @Given("Expenses manager is typing correct {string} address into the email text box")
    public void expenses_manager_is_typing_correct_address_into_the_email_text_box(String email) {
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("expensesMEmail"));
        BrowserUtils.sleep(2);
    }
    @Then("Expenses manager is typing correct {string} into the password text box")
    public void expenses_manager_is_typing_correct_into_the_password_text_box(String password) {
       loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("expensesMPassword"));
        BrowserUtils.sleep(2);
    }
    @Then("Expenses manager is clicking on login button")
    public void expenses_manager_is_clicking_on_login_button() {
       loginPage.submitButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("Expenses manager is on the inbox page and can see the account name")
    public void expenses_manager_is_on_the_inbox_page_and_can_see_the_account_name() {
      inboxPageJovana.accountName.isDisplayed();
        String actualName=inboxPageJovana.accountName.getText();
        String expectedName="ExpensesManager"+ConfigurationReader.getProperty("expensesMEmail").substring(15,ConfigurationReader.getProperty("expensesMEmail").indexOf("@"));
        Assert.assertEquals(actualName,expectedName);
        BrowserUtils.sleep(2);
    }


    @And("Expenses manager is typing correct {string} into the password text box and press enter from keyboard")
    public void expensesManagerIsTypingCorrectIntoThePasswordTextBoxAndPressEnterFromKeyboard(String arg0) {

        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("expensesMPassword")+ Keys.ENTER);

    }


    @Given("Sales manager is typing {string} address into the email text box")
    public void salesManagerIsTypingAddressIntoTheEmailTextBox(String arg0) {
loginPage.loginInput.sendKeys(arg0);
        BrowserUtils.sleep(2);
    }

    @Then("Sales manager is typing {string} into the password text box")
    public void salesManagerIsTypingIntoThePasswordTextBox(String arg1) {
        loginPage.passwordInput.sendKeys(arg1);
        BrowserUtils.sleep(2);
    }



    @Given("Expenses manager is typing {string} address into the email text box")
    public void expensesManagerIsTypingAddressIntoTheEmailTextBox(String arg0) {
        loginPage.loginInput.sendKeys(arg0);
        BrowserUtils.sleep(2);
    }

    @Then("Expenses manager is typing {string} into the password text box")
    public void expensesManagerIsTypingIntoThePasswordTextBox(String arg1) {
        loginPage.passwordInput.sendKeys(arg1);
        BrowserUtils.sleep(2);
    }




    @Then("Sales manager should not be able to log in and the error message is displayed")
    public void salesManagerShouldNotBeAbleToLogInAndTheErrorMessageIsDisplayed() {
        inboxPageJovana.errorMessage.isDisplayed();
        Assert.assertEquals("Wrong login/password",inboxPageJovana.errorMessage.getText());
        BrowserUtils.sleep(2);
    }

    @Then("Expenses manager should not be able to log in and the error message is displayed")
    public void expensesManagerShouldNotBeAbleToLogInAndTheErrorMessageIsDisplayed() {
        inboxPageJovana.errorMessage.isDisplayed();
        Assert.assertEquals("Wrong login/password",inboxPageJovana.errorMessage.getText());
        BrowserUtils.sleep(2);
    }


    @Then("Expenses manager should not be able to log in with the message **Please fill out this field.**")
    public void expensesManagerShouldNotBeAbleToLogInWithTheMessagePleaseFillOutThisField() {
        String isRequired = loginPage.loginInput.getAttribute("required");
        System.out.println(isRequired);
        }



    @Then("Sales manager should not be able to log in with the message **Please fill out this field.**")
    public void salesManagerShouldNotBeAbleToLogInWithTheMessagePleaseFillOutThisField() {
        String isRequired = loginPage.loginInput.getAttribute("required");
        System.out.println(isRequired);
    }
}
