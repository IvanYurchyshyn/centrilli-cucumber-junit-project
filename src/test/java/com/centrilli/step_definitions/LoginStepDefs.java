package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @When("user log in with {string}")
    public void user_log_in_with(String managerType) {
        managerType = managerType.toLowerCase().replace("manager", "");

        managerType = managerType.replace("crm", "");

        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty(managerType + "Email"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty(managerType + "Password"));
        loginPage.submitButton.click();

    }

    @Given("user is on a log in page")
    public void userIsOnLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
}
