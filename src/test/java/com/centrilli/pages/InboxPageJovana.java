package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPageJovana {
     public InboxPageJovana(){
         PageFactory.initElements(Driver.getDriver(),this);
     }
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
   public WebElement accountName;


  @FindBy(xpath = "//p[@class='alert alert-danger']")

    public WebElement errorMessage;



}
