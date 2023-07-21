package com.centrilli.step_definitions;

import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class US01_IhsanStepDefs {
    public WebDriver driver;

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        // Set up WebDriver (Assuming ChromeDriver is used)
        driver = new ChromeDriver();
        driver.get("https://qa.centrilli.com/web/login");
    }

    @When("The user enters valid username {string} and valid password {string}")
    public void enterValidCredentials(String username, String password) {
        // Find and fill in the login form with provided credentials
        driver.findElement(By.id("login")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("The user clicks on the {string} button")
    public void clickLoginButton(String buttonName) {
        // Find and click on the "Login" button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("The user should be logged in successfully")
    public void verifyLoginSuccess() {

        BrowserUtils.sleep(5);
        boolean isLoggedIn = driver.findElement(By.id("menu_more_container")).isDisplayed();
        Assert.assertTrue(isLoggedIn);
    }

    @When("The user enters invalid username {string} and invalid password {string}")
    public void the_user_enters_invalid_username_and_invalid_password(String string, String string2) {
        driver.findElement(By.id("login")).sendKeys("wrongUserName");
        driver.findElement(By.id("password")).sendKeys("UserUser123");
    }

    @Then("Error message should be displayed after entering the invalid credentials")
    public void error_message_should_be_displayed_after_entering_the_invalid_credentials() {
        WebElement alertElement = driver.findElement(By.className("alert-danger"));
        String alertText = alertElement.getText();

        String actual = alertText;
        String expected = "Wrong login/password";

        Assert.assertEquals(expected, actual);


    }


    @When("The user do not enters any username and enters valid password {string}")
    public void theUserDoNotEntersAnyUsernameAndEntersValidPassword(String arg0) {

        // When The user does not enter any username and enters valid password "posmanager"
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("posmanager");

        // And The user clicks on the "Login" button
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
    }

    @Then("The posmanager  gets the {string} message for at least one blank field.")
    public void thePosmanagerGetsTheMessageForAtLeastOneBlankField(String arg0) {

        // Then The posmanager gets the "Please fill out this field." message for at least one blank field.
       // Driver.getDriver().findElement(By.xpath("//a[@class='button new']")).click();

        //System.out.println("POS Manager Scenario: " + errorMessage.getText());
    }

    @When("The user enters valid username {string} and do not enters any password")
    public void theUserEntersValidUsernameAndDoNotEntersAnyPassword(String arg0) {

        // When The user enters valid username "eventscrmmanager10@info.com" and does not enter any password
        WebElement usernameInput = driver.findElement(By.name("login"));
        usernameInput.sendKeys("eventscrmmanager10@info.com");

        // And The user clicks on the "Login" button
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
    }

    @Then("The eventcrmmanager gets the {string} message for at least one blank field.")
    public void theEventcrmmanagerGetsTheMessageForAtLeastOneBlankField(String arg0) {

        // Then The eventcrmmanager gets the "Please fill out this field." message for at least one blank field.
        //  WebElement errorMessage = driver.findElement(By.className("oe_form_required"));
        //assert errorMessage.isDisplayed();
        //System.out.println("Event CRM Manager Scenario: " + errorMessage.getText());
    }

}
