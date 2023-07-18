package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();


    @Given("user is on a log in page")
    public void userIsOnLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    //updated
    @Given("user is already logged in as {string} manager")
    public void userIsAlreadyLoggedInAsManager(String managerType) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        managerType = managerType.toLowerCase().replace("manager", "");

        managerType = managerType.replace("crm", "");

        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty(managerType + "Email"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty(managerType + "Password"));
        loginPage.submitButton.click();

    }
}
