package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgotpassword {
    private WebDriver driver;
    public Forgotpassword(WebDriver driver){this.driver = driver;}

    public void enterPhoneNumber(){
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/form/div/div[2]/div/table/tbody/tr[2]/td[2]/input")).sendKeys("07065526766");
    }
    public Recoverpage clickSearch(){
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/form/div/div[3]/div/div[1]/button")).click();
        return new Recoverpage(driver);
    }
}
