package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProductPage {
    public EditProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@name='sale_ok']//input")
    public WebElement canBeSoldCheckBoxes;
    @FindBy(xpath = "//div[@name='purchase_ok']//input")
    public WebElement canBePurchasedCheckBoxes;
    @FindBy(xpath = "//div[@name='can_be_expensed']//input")
    public WebElement canBeExpensedCheckBoxes;
    @FindBy(name = "type")
    public WebElement productTypeSelectDropdown;

    @FindBy(xpath = "//div[@name='categ_id']//input")
    public WebElement categoryDropdown;

    @FindBy(xpath = "//input[@name='default_code']")
    public WebElement initialReferenceInput;
    @FindBy(xpath = "//input[@name='barcode']")
    public WebElement barcodeInput;
    @FindBy(xpath = "//div[@name='list_price']//input")
    public WebElement salesPriceInput;
    @FindBy(xpath = "//div[@name='standard_price']//input")
    public WebElement costInput;




}
