package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @BeforeMethod
    @Parameters({"url"})
    public void setup(String url) {
        //setting up the chrome browser.
       System.setProperty("webdriver.chrome.driver",
               "/Users/marjanaaktar/Documents/NormalFramework/Generic/src/main/driver/chromedriver");
       this.driver = new ChromeDriver();
       this.driver.manage().window().fullscreen();
       this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       this.driver.get(url);
    }

    @AfterMethod
    public void cleanup() {
        //Close the chrome browser.
        this.driver.close();

    }

}
