package com.centrilli.step_definitions;

import com.centrilli.pages.PosManagerCreateEventsPage_Annia;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class US04_AnniaStepDefs {

    PosManagerCreateEventsPage_Annia posManagerCreateEventsPage_annia = new PosManagerCreateEventsPage_Annia();


    @Given("the calendar is open")
    public void the_calendar_is_open() {

        BrowserUtils.sleep(2);
        posManagerCreateEventsPage_annia.calendarModule.click();
    }

    @When("I click on a time box")
    public void i_click_on_a_time_box() {
        BrowserUtils.sleep(2);
        posManagerCreateEventsPage_annia.timeBox.click();

    }

    @Then("I enter the event details")
    public void i_enter_the_event_details() {

        BrowserUtils.sleep(2);
        posManagerCreateEventsPage_annia.eventDetails();
    }

    @And("click on the {string} button")
    public void click_on_the_button(String string) {
        posManagerCreateEventsPage_annia.createButton.click();
    }


    @When("there is an existing event on the calendar")
    public void there_is_an_existing_event_on_the_calendar() {

      /*  BrowserUtils.sleep(1);
        WebElement existingEvent = Driver.getDriver().findElement(By.xpath("//div[@class='fc-content']//div[2]//div[1]"));

        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)",existingEvent);
        */

        BrowserUtils.sleep(2);

        posManagerCreateEventsPage_annia.locatingEventCreatedBox.click();

        String actualEventText = posManagerCreateEventsPage_annia.popUpWindowWithEvent.getText();
        String expecteEventText = "All Day";

        BrowserUtils.sleep(2);

        Assert.assertTrue(actualEventText.contains(expecteEventText));


    }


   /* @And("I click on the event")
    public void i_click_on_the_event() {
*/
       /* BrowserUtils.sleep(2);
        posManagerCreateEventsPage_annia.locatingEventCreatedBox.click();

        */
       /* BrowserUtils.sleep(2);

        WebElement eventCreated = Driver.getDriver().findElement(By.xpath("//div[@class='fc-content']//div[2]//div[1]"));

        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)",eventCreated);

        posManagerCreateEventsPage_annia.eventCreated.click();
   }
*/


    @Then("the event details should be displayed")
    public void the_event_details_should_be_displayed() {

        posManagerCreateEventsPage_annia.eventCreated.isDisplayed();


    }






}
