package setup;


import POM.Forgotpassword;
import POM.Signinpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup {
    private WebDriver driver;
    protected Signinpage signinpage;
    protected Forgotpassword forgotpassword;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
//        driver.findElement(By.linkText("Forgotten password?")).click();
        signinpage = new Signinpage(driver);
//        forgotpassword = new Forgotpassword(driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
