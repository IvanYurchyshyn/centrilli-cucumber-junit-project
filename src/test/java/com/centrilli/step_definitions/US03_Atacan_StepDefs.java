package com.centrilli.step_definitions;

import com.centrilli.pages.HomePage;
import com.centrilli.pages.CalendarPage;
import com.centrilli.utilities.BrowserUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Date;
import java.util.Locale;

public class US03_Atacan_StepDefs {

    CalendarPage calendarPage = new CalendarPage();
    HomePage homePage = new HomePage();

    LocalDate today = LocalDate.now();

    @Then("user click on Calendar module")
    public void user_click_on_calendar_on_module() {
        calendarPage.calendarModule.click();
    }

    @Given("user clicks Day button")
    public void user_clicks_day_button() {
        calendarPage.dayButton.click();
    }

    @When("user sees Day button is selected")
    public void user_sees_day_button_is_selected() {
        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        Assert.assertTrue(calendarPage.selectedDayButton.isDisplayed());
    }

    @When("user sees current day")
    public void user_sees_current_day() {

        String pattern = "MMMM dd, yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String expectedDay = "Meetings (" + simpleDateFormat.format(new Date()) + ")";

        Assert.assertEquals(expectedDay, calendarPage.actualDate.getText());

    }

    @Given("user sees Week button is selected")
    public void user_sees_week_button_is_selected() {
        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        Assert.assertTrue(calendarPage.selectedWeekButton.isDisplayed());

    }

    @Given("user clicks Month button")
    public void user_clicks_month_button() {
        calendarPage.monthButton.click();
    }

    @Given("user sees Month button is selected")
    public void user_sees_month_button_is_selected() {
        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        Assert.assertTrue(calendarPage.selectedMonthButton.isDisplayed());
    }

    @Then("user sees current week")
    public void userSeesCurrentWeek() {

        WeekFields weekFields = WeekFields.of(Locale.getDefault());

        int weekNumber = today.get(weekFields.weekOfWeekBasedYear());

        String expectedWeek = "Meetings (Week " + weekNumber + ")";

        Assert.assertEquals(expectedWeek, calendarPage.actualDate.getText());
    }

    @Then("user sees current month")
    public void userSeesCurrentMonth() {

        String pattern = "MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String expectedMonth = "Meetings (" + simpleDateFormat.format(new Date()) + ")";

        Assert.assertEquals(expectedMonth, calendarPage.actualDate.getText());
    }

}
