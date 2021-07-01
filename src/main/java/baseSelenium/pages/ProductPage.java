package baseSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage  extends  BasePage{

    public ProductPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item_description']/div[@class='pricebar']/button")
    WebElement btnAddProduct;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement btnShoppingCart;


    public  void addProduct(){
        btnAddProduct.click();
    }

    public  void  shoppingCart(){
        btnShoppingCart.click();
    }
}
