package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsInInventoryPage {
    public ProductsInInventoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(name = "name")
    public WebElement productNameInput;
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SaveBtn;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBtn;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy (xpath = "//strong[@class='o_kanban_record_title']/span")
    public WebElement productName;

    @FindBy(xpath = "//div[@class='o_view_manager_content']//div[4]")
    public WebElement productContainer;



}
