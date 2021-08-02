package baseSelenium.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import utilities.manager.DriverManager;

import java.util.concurrent.TimeUnit;

public class Hook extends DriverManager {

    private final DriverManager driverManager;


    public Hook(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Before
    public void  initializeDriver(){

        WebDriverManager.chromedriver().setup();
        driverManager.driver = new ChromeDriver();
        driverManager.driver.manage().window().maximize();
        driverManager.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @After
    public void closedDriver(){
        driverManager.driver.quit();

    }



}
