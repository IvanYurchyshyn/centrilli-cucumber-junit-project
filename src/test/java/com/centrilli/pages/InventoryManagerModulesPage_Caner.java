package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryManagerModulesPage_Caner {

    public InventoryManagerModulesPage_Caner (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[1]/a")
    public WebElement discussPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[2]/a")
    public WebElement calenderPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[3]/a")
    public WebElement notesPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[4]/a")
    public WebElement contactsPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[5]/a")
    public WebElement webSitePage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[6]/a")
    public WebElement inventoryPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[7]/a")
    public WebElement manufacturingPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[8]/a")
    public WebElement repairsPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a")
    public WebElement invoicingPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[10]/a")
    public WebElement emailMarketingPage;


    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[11]/a")
    public WebElement employeesPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[12]/a")
    public WebElement leavesPages;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[13]/a")
    public WebElement expensesPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[14]/a")
    public WebElement lunchPage;


    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[15]/a")
    public WebElement maintenancePage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[16]/a")
    public WebElement dashBoardsPage;

    @FindBy(xpath = "//*[@id=\"menu_more_container\"]")
    public WebElement dropdown;

    @FindBy(xpath = "//*[@id=\"menu_more\"]/li[1]/a")
    public WebElement maintenancePageWithDropDown;

    @FindBy(xpath = "//*[@id=\"menu_more\"]/li[2]/a")
    public WebElement dashBoardsPageWithDropdown;

    @FindBy(xpath = "//*[@id=\"modal_68\"]/div/div/div[3]/button")
    public WebElement lunchAlertButton;

}
