package com.centrilli.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CalendarPage extends BasePage {

    @FindBy(xpath = "//span[normalize-space(.)='Calendar']")
    public WebElement calendarModule;

    @FindBy(xpath = "//button[.='Day']")
    public WebElement dayButton;

    @FindBy(xpath = "//button[@class=\"o_calendar_button_day btn btn-sm btn-default active\"]")
    public  WebElement selectedDayButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li")
    public WebElement actualDate;

    @FindBy(xpath = "//button[@class=\"o_calendar_button_week btn btn-sm btn-default active\"]")
    public  WebElement selectedWeekButton;

    @FindBy(xpath = "//button[.='Month']")
    public WebElement monthButton;

    @FindBy(xpath = "//button[@class=\"o_calendar_button_month btn btn-sm btn-default active\"]")
    public  WebElement selectedMonthButton;

}
