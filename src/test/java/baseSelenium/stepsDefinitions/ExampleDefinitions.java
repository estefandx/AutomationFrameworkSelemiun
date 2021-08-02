package baseSelenium.stepsDefinitions;

import baseSelenium.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.manager.DriverManager;

public class ExampleDefinitions extends DriverManager {

    private final DriverManager driverManager;
    YoutubePage youtubePage;
    HomeSwagLabPage homeSwagLabPage;
    ProductPage productPage;
    YourCartPage yourCartPage;
    InformationPage informationPage;

    public ExampleDefinitions(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Given("That I am  SwagLab's home")
    public void that_i_am_swag_lab_s_home() throws InterruptedException {
        homeSwagLabPage = new HomeSwagLabPage(driverManager.driver);
        homeSwagLabPage.openPage();
        homeSwagLabPage.loginSwagLab("standard_user","secret_sauce");
        Thread.sleep(3000);

    }
    @When("I buy a bag in  the store")
    public void i_buy_a_bag_in_the_store() throws InterruptedException {
        productPage = new ProductPage(driverManager.driver);
        yourCartPage = new YourCartPage(driverManager.driver);
        informationPage = new InformationPage(driverManager.driver);
        productPage.addProduct();
        productPage.shoppingCart();

        yourCartPage.selectCheckout();
        informationPage.FillOutFormInformation("bryan","morenmo","232424");
        Thread.sleep(3000);


    }
    @Then("I can see a billing with the product")
    public void i_can_see_a_billing_with_the_product() {
        Assert.fail();

    }
}
