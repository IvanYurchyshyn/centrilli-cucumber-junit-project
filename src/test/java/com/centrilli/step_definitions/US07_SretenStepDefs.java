package com.centrilli.step_definitions;

import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US07_SretenStepDefs {

    @Then("user should see the Quotation Number row")
    public void user_should_see_the_quotation_number_row()
    {
        BrowserUtils.sleep(5);
        BrowserUtils.verifyElementDisplayed(By.xpath("//th[.='Quotation Number']"));
    }
    @Then("user should see the Quotation Date row")
    public void user_should_see_the_quotation_date_row() {
        BrowserUtils.verifyElementDisplayed(By.xpath("//th[.='Quotation Date']"));    }
    @Then("user should see the Customer row")
    public void user_should_see_the_customer_row() {
        BrowserUtils.verifyElementDisplayed(By.xpath("//th[.='Customer']"));
    }
    @Then("user should see the Salesperson row")
    public void user_should_see_the_salesperson_row() {
        BrowserUtils.verifyElementDisplayed(By.xpath("//th[.='Salesperson']"));
    }
    @Then("user should see the Total row")
    public void user_should_see_the_total_row() {
        BrowserUtils.verifyElementDisplayed(By.xpath("//th[.='Total']"));
    }
    @Then("user should see the Status row")
    public void user_should_see_the_status_row() {
        BrowserUtils.verifyElementDisplayed(By.xpath("//th[.='Status']"));
    }


}
