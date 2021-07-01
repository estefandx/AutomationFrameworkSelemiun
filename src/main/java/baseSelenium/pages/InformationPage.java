package baseSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends  BasePage {

    public InformationPage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(id = "first-name")
    WebElement txtFistName;

    @FindBy(id = "last-name")
    WebElement txtLastName;

    @FindBy(id = "postal-code")
    WebElement txtPostalCode;

    @FindBy(id = "continue")
    WebElement btnContinue;


    public  void FillOutFormInformation(String firstName,String lastName,String postalCode){
        txtFistName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtPostalCode.sendKeys(postalCode);
        btnContinue.click();    }




}
