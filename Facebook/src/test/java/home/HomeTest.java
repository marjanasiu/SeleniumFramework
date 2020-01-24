package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("https://facebook.com");
        HomePage hp = new HomePage();
        hp.login("marjanasiu@gmail.com","Atlyfe@2019");
    }
}