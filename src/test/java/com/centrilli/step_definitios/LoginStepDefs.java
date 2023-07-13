package com.centrilli.step_definitios;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @When("user log in with {string}")
    public void user_log_in_with(String email) {
        email = email.toLowerCase();
        if (email.contains("pos")){
            loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("posEmail"));
            loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("posPassword"));
            loginPage.submitButton.click();
        }
    }

    @Given("user is on log in page")
    public void userIsOnLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
}
