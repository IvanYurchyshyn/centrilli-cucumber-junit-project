package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesRowsPage_Sreten {

    public SalesRowsPage_Sreten(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//th[.='Quotation Number']")
    public WebElement quotationNumberRow;

    @FindBy(xpath = "//th[.='Quotation Date']")
    public WebElement quotationDateRow;
    @FindBy(xpath = "//th[.='Customer']")
    public WebElement customerRow;
    @FindBy(xpath = "//th[.='Salesperson']")
    public WebElement salespersonRow;
    @FindBy(xpath = "//th[.='Total']")
    public WebElement totalRow;
    @FindBy(xpath = "//th[.='Status']")
    public WebElement statusRow;

    @FindBy (xpath ="//input[@class='o_searchview_input']")
    public WebElement searchTab;

}






