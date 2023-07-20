package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POS_ManagerModulePage_tutta {

    public POS_ManagerModulePage_tutta(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-action-id='120']")
    public WebElement discussModule;

    @FindBy(xpath = "//a[@data-action-id='136']")
    public WebElement calenderModule;


    @FindBy(xpath = "//a[@href='/web#menu_id=194&action=220']")
    public WebElement notesModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=68&action=']")
    public WebElement contactsModule;


    @FindBy(xpath = "//a[@href='/web#menu_id=261&action=365']")
    public WebElement CrmModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=445&action=']")
    public WebElement salesModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=382&action=']")
    public WebElement webSiteModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']")
    public WebElement pointOfSaleModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=504&action=']")
    public WebElement purchasesModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=347&action=']")
    public WebElement inventoryModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=415&action=']")
    public WebElement manufacturingModule;



    @FindBy(xpath = "//a[@href='/web#menu_id=535&action=723']")
    public WebElement RepairsModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=333&action=']")
    public WebElement ProjectModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=124&action=']")
    public WebElement EventsModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=124&action=']")
    public WebElement SurveysModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=124&action=']")
    public WebElement EmployeesModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=124&action=']")
    public WebElement AttendancesModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=124&action=']")
    public WebElement LeavesModule;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[19]/a")
    public WebElement ExpensesModule;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[20]/a")
    public WebElement MaintenanceModule;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[21]/a")
    public WebElement FleetModule;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[22]/a")
    public WebElement DashboardsModule;

    @FindBy(xpath = "//*[@id=\"menu_more_container\"]/a")
    public WebElement MoreDropdownModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=388&action=']")
    public WebElement ExpensesDropdownModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=165&action=']")
    public WebElement MaintenanceDropdownModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=165&action=']")
    public WebElement FleetDropdownModule;

    @FindBy(xpath = "//a[@href='/web#menu_id=165&action=']")
    public WebElement DashboardsDropdownModule;






}
