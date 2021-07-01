package baseSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YoutubePage extends  BasePage {

    public YoutubePage(WebDriver pDriver) {
        super(pDriver);
    }

    @FindBy(id = "search")
    WebElement btnSearch;

    public void searchVideo(String video) throws InterruptedException {
        Thread.sleep(2000);
        btnSearch.click();
        btnSearch.sendKeys(video);
    }


}
