package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signinpage {
    private WebDriver driver;

    public Signinpage(WebDriver driver){this.driver = driver;}

    public void enterEmail(){
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("akala4gov@yahoo.com");
    }
    public void enterPassword(){
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")).sendKeys("HARDURAHGBEMI2019");
    }

    public void clickSignin() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).click();
        Thread.sleep(3000);
    }
}
