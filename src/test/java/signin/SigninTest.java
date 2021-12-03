package signin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setup.Setup;

public class SigninTest extends Setup {
    private WebDriver driver;

    @Test(priority = 0)
    public void testSigning() throws InterruptedException{
        Thread.sleep(3000);
        signinpage.enterEmail();
        signinpage.enterPassword();
        signinpage.clickSignin();
    }
}
