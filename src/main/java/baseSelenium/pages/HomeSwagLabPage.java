package baseSelenium.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeSwagLabPage  extends BasePage {

    public HomeSwagLabPage(WebDriver pdriver) {
        super(pdriver);
    }

    @FindBy(id = "user-name")
    WebElement txtUser;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(id = "login-button")
    WebElement btnLogin;


    public  void openPage(){
        getDriver().get("https://www.saucedemo.com/");
    }

    private void fillOutUser(String user){
        txtUser.sendKeys(user);
    }

    private void fillOutPassword(String password){
        txtPassword.sendKeys(password);
    }

    private void loginSwagLab(){
        btnLogin.click();
    }

    public void loginSwagLab(String user, String password){
        fillOutUser(user);
        fillOutPassword(password);
        loginSwagLab();
    }
}
