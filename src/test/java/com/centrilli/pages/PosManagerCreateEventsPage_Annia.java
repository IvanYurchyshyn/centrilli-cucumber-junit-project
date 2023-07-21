package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PosManagerCreateEventsPage_Annia {

    public PosManagerCreateEventsPage_Annia() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    public void login() {
        userName.sendKeys("posmanager5@info.com");
        passWord.sendKeys("posmanager");
        loginBtn.click();
    }

    @FindBy(xpath = "//a[@href='/web#menu_id=120&action=136']")
    public WebElement calendarModule;

    @FindBy(xpath = "//div[@class='o_calendar_view']")
    public WebElement calendar;

    @FindBy(xpath = "(//td[@class='fc-day fc-widget-content fc-sun fc-past'])[1]")
    public WebElement timeBox;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement summaryTextBox;

    public void eventDetails(){
        summaryTextBox.sendKeys("meeting");
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class='o_form_view o_form_nosheet o_form_readonly']")
    public WebElement eventCreated;

    @FindBy(xpath = "//div[@class=\'fc-content\']")
    public WebElement locatingEventCreatedBox;


    @FindBy(xpath = "//label[.='All Day']")
    public WebElement popUpWindowWithEvent;

    //







}




