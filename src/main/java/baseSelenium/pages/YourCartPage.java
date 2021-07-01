package baseSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends  BasePage {

    public YourCartPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(id = "checkout")
    WebElement btnCheckOut;


    public void selectCheckout(){
        btnCheckOut.click();
    }


}
