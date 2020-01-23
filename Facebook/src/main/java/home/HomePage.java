package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {

    public void login(String email, String password) {
        this.driver.findElement(By.id("email")).sendKeys(email);
        this.driver.findElement(By.id("pass")).sendKeys(password);
        this.driver.findElement(By.cssSelector("input[value=Log In]")).click();
    }

}
