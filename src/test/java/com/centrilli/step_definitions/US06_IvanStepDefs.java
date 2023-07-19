package com.centrilli.step_definitions;

import com.centrilli.pages.EditProductPage;
import com.centrilli.pages.HomePage;
import com.centrilli.pages.InventoryPage;
import com.centrilli.pages.ProductsInInventoryPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class US06_IvanStepDefs {

    HomePage homePage = new HomePage();
    InventoryPage inventoryPage = new InventoryPage();
    ProductsInInventoryPage productsInInventoryPage = new ProductsInInventoryPage();

    @When("user press Inventory module")
    public void user_press_inventory() {

        BrowserUtils.loadingBarInvisibility(homePage.loadingBar);
        homePage.inventoryModule.click();
    }

    @When("user clicks on Products module")
    public void user_clicks_on_products_module() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(inventoryPage.productsModule));
        inventoryPage.productsModule.click();

    }

    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productsInInventoryPage.createBtn));
        productsInInventoryPage.createBtn.click();
    }

    @When("user types product name as {string}")
    public void types_product_name_as(String productName) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productsInInventoryPage.productNameInput));
        productsInInventoryPage.productNameInput.clear();
        productsInInventoryPage.productNameInput.sendKeys(productName);
    }

    @When("user clicks on Save button")
    public void user_clicks_on_save_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productsInInventoryPage.SaveBtn));
        productsInInventoryPage.SaveBtn.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should see {string} product was created")
    public void user_should_see_product_was_created(String productName) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productsInInventoryPage.productName));
        String actualResult = productsInInventoryPage.productName.getText();
        Assert.assertEquals(productName, actualResult);
    }

    @And("user types product name as {string} in search box and press Enter")
    public void userTypesProductNameAsInSearchBox(String productName) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productsInInventoryPage.searchBox));
        productsInInventoryPage.searchBox.click();
        productsInInventoryPage.searchBox.sendKeys(productName + Keys.ENTER);
        BrowserUtils.sleep(2);
    }

    EditProductPage editProductPage = new EditProductPage();

    @When("user clicks on any product")
    public void user_clicks_on_any_product() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productsInInventoryPage.productContainer));
        productsInInventoryPage.productContainer.click();
    }

    @When("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        productsInInventoryPage.editBtn.click();
    }

    @When("user clicks Can be Sold checkbox")
    public void user_clicks_can_be_sold_checkbox() {
        editProductPage.canBeSoldCheckBoxes.click();
        Assert.assertTrue(editProductPage.canBeSoldCheckBoxes.isSelected());
    }

    @When("user clicks Can be Purchased checkbox")
    public void user_clicks_can_be_purchased_checkbox() {
        editProductPage.canBePurchasedCheckBoxes.click();
        Assert.assertTrue(editProductPage.canBePurchasedCheckBoxes.isSelected());
    }

    @When("user clicks Can be Expensed checkbox")
    public void user_clicks_can_be_expensed_checkbox() {
        editProductPage.canBeExpensedCheckBoxes.click();
        Assert.assertTrue(editProductPage.canBeExpensedCheckBoxes.isSelected());
    }

    @When("user chooses from Product Type dropdown Service option")
    public void user_chooses_from_product_type_dropdown_service_option() {
        Select select = new Select(editProductPage.productTypeSelectDropdown);
        select.selectByIndex(2);
        Assert.assertTrue(editProductPage.productTypeSelectDropdown.isSelected());
    }

    @When("user chooses from Category dropdown {string} option")
    public void user_chooses_from_category_dropdown_option(String categoryName) {
        editProductPage.categoryDropdown.sendKeys(Keys.CLEAR + categoryName + Keys.ENTER);
        Assert.assertTrue(editProductPage.categoryDropdown.getText().contains(categoryName));
    }

    @When("user types in Internal Reference field {string}")
    public void user_types_in_internal_reference_field(String internalReference) {
        editProductPage.initialReferenceInput.sendKeys(internalReference);
        Assert.assertEquals(editProductPage.initialReferenceInput.getText(),internalReference);
    }

    @When("user types in Barcode field {string}")
    public void user_types_in_barcode_field(String barcode) {
        editProductPage.barcodeInput.sendKeys(barcode);
        Assert.assertEquals(editProductPage.barcodeInput.getText(),barcode);
    }

    @When("user types in Sales Price field {string}")
    public void user_types_in_sales_price_field(String salesPrice) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(editProductPage.salesPriceInput));

            editProductPage.salesPriceInput.clear();
            editProductPage.salesPriceInput.sendKeys(salesPrice);
            Assert.assertTrue(editProductPage.salesPriceInput.getText().contains(salesPrice));

    }

    @When("user types in Cost field {string}")
    public void user_types_in_cost_field(String cost) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(editProductPage.costInput));

            editProductPage.costInput.clear();
            editProductPage.costInput.sendKeys(cost);
        Assert.assertTrue(editProductPage.costInput.getText().contains(cost));

    }

    @Then("user should be able to do all changes")
    public void user_should_be_able_to_do_all_changes() {

    }

}
