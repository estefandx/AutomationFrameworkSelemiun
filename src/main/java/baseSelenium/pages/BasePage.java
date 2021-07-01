package baseSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {


    private WebDriver driver;
    private WebDriverWait wait;


    public BasePage(WebDriver pDriver) {
        PageFactory.initElements(pDriver, this);
        driver = pDriver;
        wait = new WebDriverWait(driver,30);

    }



    protected WebDriverWait getWait(){
        return  wait;
    }

    protected WebDriver getDriver() {
        return driver;
    }




    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

}
