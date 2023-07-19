package com.centrilli.step_definitions;

import com.centrilli.pages.HomePage;
import com.centrilli.pages.CalendarPage;
import com.centrilli.utilities.BrowserUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class US03_Atacan_StepDefs {

    CalendarPage calendarPage = new CalendarPage();
    HomePage homePage = new HomePage();

    @Then("user clicks Calendar on module")
    public void user_clicks_calendar_on_module() {

        calendarPage.calendarModule.click();

    }

    @Given("user clicks Day button")
    public void user_clicks_day_button() {

        calendarPage.dayButton.click();

    }

    @When("user sees current day")
    public void user_sees_current_day() {
        LocalDate today = LocalDate.now();

        String currentDay = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        Assert.assertEquals(currentDay, calendarPage.actualDay.getText());


    }
}
