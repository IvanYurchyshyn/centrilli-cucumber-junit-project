package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesManagerModulesPage_Zack {

    public SalesManagerModulesPage_Zack(){
        PageFactory.initElements(Driver.getDriver(), this);
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
    public WebElement cRMPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[6]/a")
    public WebElement salesPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[7]/a")
    public WebElement webSitePage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[8]/a")
    public WebElement pointOfSalePage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[9]/a")
    public WebElement purchasesPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[10]/a")
    public WebElement inventoryPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[11]/a")
    public WebElement repairsPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[12]/a")
    public WebElement invoicingPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[13]/a")
    public WebElement emailMarketing;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[14]/a")
    public WebElement eventsPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[15]/a")
    public WebElement employeesPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[16]/a")
    public WebElement leavesPages;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[17]/a")
    public WebElement expensesPage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[18]/a")
    public WebElement maintenancePage;

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[19]/a")
    public WebElement dashboardsPage;

    @FindBy(xpath = "//*[@id=\"menu_more\"]/li[1]/a")
    public WebElement expensesPageWithDropDown;

    @FindBy(xpath = "//*[@id=\"menu_more\"]/li[2]/a")
    public WebElement maintenancePageWithDropDown;

    @FindBy(xpath = "//*[@id=\"menu_more\"]/li[3]/a")
    public WebElement dashboardPageWithDropDown;

    @FindBy(xpath = "//*[@id=\"menu_more_container\"]/a")
    public WebElement dropDown;


    @FindBy(xpath = "//*[@class=\"o_sub_menu\"]/div[1]/div[6]/ul[1]/li[3]/a")
    public WebElement customersButton;

    @FindBy(xpath = "//*[@class=\"o_main\"]/div[2]/div[1]/div[2]/div[1]//button[1]")
    public WebElement createButton;

    @FindBy(css = "button[class=\"btn btn-primary btn-sm o_form_button_edit\"]")
    public WebElement editButton;

    @FindBy(xpath = "//*[@class=\"o_main\"]/div[2]//h1/input")
    public WebElement nameInputBox;

    @FindBy(xpath = "//*[@class=\"oe_title\"]/h1/span")
    public WebElement nameInfo;

    @FindBy(xpath = "//*[@class=\"o_form_buttons_edit\"]/button[1]")
    public WebElement customersSaveButton;

    @FindBy(xpath = "//*[@class=\"o_main_content\"]/div[2]/div/div/div/div[1]")
    public WebElement customerForm;

    @FindBy(xpath = "//*[@class=\"oe_kanban_global_click o_res_partner_kanban o_kanban_record\"][2]")
    public WebElement customer2; // when we click customers, customers are shown in Kanban style by default (not list). This locater is for Kanban style.

    //Customer Form Buttons, Boxes:
    @FindBy(xpath = "//*[@id=\"radio8419_person\"]")
    public WebElement individiualRadioButton;

    @FindBy(xpath = "//*[@id=\"radio8419_company\"]")
    public WebElement companyRadioButton;

    @FindBy(xpath = "//*[@id=\"o_field_input_36\"]/../span")
    public WebElement companyDropdown;

    @FindBy(xpath = "//*[@id=\"o_field_input_8366\"]")
    public WebElement streetInputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_8367\"]")
    public WebElement street2InputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_8368\"]")
    public WebElement cityInputBox;

    @FindBy(xpath = "//*[@name=\"state_id\"]//span")
    public WebElement stateDropdown;

    @FindBy(xpath = "//*[@id=\"o_field_input_43\"]")
    public WebElement zipInputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_45\"]")
    public WebElement tinInputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_46\"]/../span")
    public WebElement tagsDropdown;

    @FindBy(xpath = "//*[@id=\"o_field_input_47\"]")
    public WebElement jobPositionInputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_48\"]")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_49\"]")
    public WebElement mobileInputBox;

    @FindBy(xpath ="//*[@id=\"o_field_input_51\"]")
    public WebElement mailIputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_52\"]")
    public WebElement websiteInputBox;

    @FindBy(xpath = "//*[@id=\"o_field_input_53\"]/../span")
    public WebElement titleDropdown;

    @FindBy(xpath = "//*[@id=\"o_field_input_54\"]")
    public WebElement languageDropdown;

}
